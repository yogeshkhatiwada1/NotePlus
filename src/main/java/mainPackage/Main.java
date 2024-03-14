/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainPackage;

import javax.imageio.ImageIO;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.text.*;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main extends javax.swing.JFrame {

    private UndoManager undoManager;
    private Color fontColor ;
    public Main() throws IOException {
        initComponents();
        undoManager = new UndoManager();
        jTextPane1.getDocument().addUndoableEditListener(undoManager);
        jPanel2.setVisible(false);
        jTextPane1.setForeground(fontColor);
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTheMenuState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTheMenuState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTheMenuState();
            }

            private void updateTheMenuState() {
                String text = jTextPane1.getText();
                boolean isTextEmpty = text.trim().isEmpty();
                jMenuItem20.setVisible(!isTextEmpty);
                jMenuItem23.setVisible(!isTextEmpty);
                jMenuItem16.setEnabled(!isTextEmpty);
            }
        };
        jTextPane1.getStyledDocument().addDocumentListener(documentListener);
        jMenuItem20.setVisible(false);
        jMenuItem23.setVisible(false);
        jMenuItem16.setEnabled(false);
    }
    File file;
    JFrame findReplaceFrame = new JFrame("Find and Replace");
        public JButton findButton;
        public JButton replaceButton;
        public JButton replaceAllButton;
    private void initComponents() throws IOException {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu6= new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ScrollBarUI customScrollBarUI = new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = Color.GRAY;
                this.trackColor = Color.LIGHT_GRAY;
            }
            @Override
            protected JButton createDecreaseButton(int orientation) {
                return invisibleButton();
            }
            @Override
            protected JButton createIncreaseButton(int orientation) {
                return invisibleButton();
            }
            private JButton invisibleButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                return button;
            }
        };
        jScrollPane1.getVerticalScrollBar().setUI(customScrollBarUI);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Untitled-Noteplus");
        String imagePath = "C:\\Users\\acer\\Desktop\\Noteplus\\Notepad.png";
        Image icon = ImageIO.read(new File(imagePath));
        setIconImage(icon);
        setPreferredSize(new java.awt.Dimension(1300, 602));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jLabel1.setText("");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(new FlowLayout());
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(319, 319, 319)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(1150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(48, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36))
        );
        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));
        jTextPane1.setBorder(null);
        jTextPane1.setPreferredSize(new java.awt.Dimension(800, 500));
        jTextPane1.setSelectionColor(new java.awt.Color(153, 169, 143));
        jScrollPane1.setViewportView(jTextPane1);
        jPanel3.add(jScrollPane1);
        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel1);

        jMenuBar1.setFont(new java.awt.Font("Kristen ITC", 0, 14));
        jMenuBar1.setInheritsPopupMenu(true);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(350, 27));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 27));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(500, 27));

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Files-PNG-File.png")); // NOI18N
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\New.png")); // NOI18N
        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Open.png")); // NOI18N
        jMenuItem5.setText("Open");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Save.png")); // NOI18N
        jMenuItem6.setText("Save");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\save as.png")); // NOI18N
        jMenuItem7.setText("Save As");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\print.png")); // NOI18N
        jMenuItem8.setText("Print");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem9.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\exit.png")); // NOI18N
        jMenuItem9.setText("Exit");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Edit-266735.png")); // NOI18N
        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem10.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\undo.png")); // NOI18N
        jMenuItem10.setText("Undo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem11.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\redo.png")); // NOI18N
        jMenuItem11.setText("Redo");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem12.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\select all.png")); // NOI18N
        jMenuItem12.setText("Select All");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem13.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\copy.png")); // NOI18N
        jMenuItem13.setText("Copy");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem14.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\cut1.png")); // NOI18N
        jMenuItem14.setText("Cut");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem15.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\paste.png")); // NOI18N
        jMenuItem15.setText("Paste");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem16.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\find&replace.png")); // NOI18N
        jMenuItem16.setText("Find and Replace");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\view.png")); // NOI18N
        jMenu3.setText("View");
        jMenu3.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\ZoomIn.png")); // NOI18N
        jMenu4.setText("Zoom");
        jMenu4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\zoom.png")); // NOI18N
        jMenuItem2.setText("Zoom In");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\ZoomOut.png")); // NOI18N
        jMenuItem3.setText("Zoom Out");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\default.png")); // NOI18N
        jMenuItem4.setText("Set Default");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenu3.add(jMenu4);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem17.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\detail.png")); // NOI18N
        jMenuItem17.setText("Details");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\setting.png")); // NOI18N
        jMenu5.setText("Settings");
        jMenu5.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\font.png")); // NOI18N
        jMenu7.setText("Font Setting");
        jMenu7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jMenuItem25.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem25.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Font_.png")); // NOI18N
        jMenuItem25.setText("Fonts");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem25);

        jMenu8.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Font-Style.png")); // NOI18N
        jMenu8.setText("Font Style");
        jMenu8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jMenuItem28.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem28.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jMenuItem28.setSelected(false);
        jMenuItem28.setText("Bold");
        jMenuItem28.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\bold.png")); // NOI18N
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem28);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem29.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jMenuItem29.setSelected(false);
        jMenuItem29.setText("Italic");
        jMenuItem29.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Italic.png")); // NOI18N
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem29);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem30.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jMenuItem30.setSelected(false);
        jMenuItem30.setText("Underline");
        jMenuItem30.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Underline.png")); // NOI18N
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem30);

        jMenu7.add(jMenu8);

        jMenuItem27.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenuItem27.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Font-Color.png")); // NOI18N
        jMenuItem27.setText("Font Color");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem27);

        jMenu5.add(jMenu7);

        jMenu6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\theme.png")); // NOI18N
        jMenu6.setText("Theme");

        jMenuItem19.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Default_.png")); // NOI18N
        jMenuItem19.setText("Default");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Dark.png")); // NOI18N
        jMenuItem20.setText("Dark");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Light.png")); // NOI18N
        jMenuItem21.setText("Light");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem21);

        jMenuItem22.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Grey.png")); // NOI18N
        jMenuItem22.setText("Gray");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem22);

        jMenuItem23.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Blue.png")); // NOI18N
        jMenuItem23.setText("Blue");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem23);

        jMenuItem24.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\Noteplus\\Sage.png")); // NOI18N
        jMenuItem24.setText("Sage");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem24);
        jMenu5.add(jMenu6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       jTextPane1.setText("");
        setTitle("Untitled-NotePlus");
    }
    private double scale = 1.0;
    private final int initialFontSize = 12;

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Increase the scale factor by 10%
        scale += 0.1;
        if (scale > 3.5) {
            scale = 3.5;
        }
        // Set the new font size of the JTextPane
        Font font = jTextPane1.getFont();
        int newSize = (int) (initialFontSize * scale);
        Font newFont = font.deriveFont((float) newSize);
        jTextPane1.setFont(newFont);
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Decrease the scale factor by 10%
        scale -= 0.1;
        if (scale < 0.6) {
            scale = 0.6;
        }
        // Set the new font size of the JTextPane
        Font font = jTextPane1.getFont();
        int newSize = (int) (initialFontSize * scale);
        Font newFont = font.deriveFont((float) newSize);
        jTextPane1.setFont(newFont);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Reset the scale factor to 1.0 (default)
        scale = 1.0;
        // Set the new font size of the JTextPane
        Font font = jTextPane1.getFont();
        int newSize = (int) (initialFontSize * scale);
        Font newFont = font.deriveFont((float) newSize);
        jTextPane1.setFont(newFont);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFileChooser chooser = new JFileChooser("C:\\Users\\acer\\Desktop\\Noteplus_Documents");
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text files (*.txt)", "txt");
        chooser.setFileFilter(txtFilter);

        // set the icon of the file chooser dialog
        ImageIcon icon = new ImageIcon("C:/Users/acer/Desktop/Noteplus/Notepad.png");
        SwingUtilities.invokeLater(() -> {
            JOptionPane.getRootFrame().setIconImage(icon.getImage());
            int result = chooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
                try {
                    String content = new String(Files.readAllBytes(file.toPath()));
                    jTextPane1.setText(content);
                    setTitle(file.getName());
                    jTextPane1.setCaretPosition(0); // set the caret position to the beginning of the text
                    jTextPane1.setEditable(false);
                    jTextPane1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            jTextPane1.setEditable(true);
                            jTextPane1.setCaretPosition(jTextPane1.viewToModel(e.getPoint()));
                            jTextPane1.getCaret().setVisible(true);
                        }
                    });
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        int count = 0;
        String fileName = "untitled.txt";
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        File folder = new File(desktopPath + "/Noteplus_Documents");

        if (!folder.exists()) {
            JOptionPane.showMessageDialog(null, "A new folder Noteplus_Documents has been created in your desktop.\nAll the documents created will be saved over there.", "New Folder Created", JOptionPane.OK_OPTION);
            folder.mkdir();
        }
         file = new File(desktopPath + "/Noteplus_Documents/" + fileName);

        while (file.exists()) {
            count++;
            fileName = "untitled" + count + ".txt";
            file = new File(desktopPath + "/Noteplus_Documents/" + fileName);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println(jTextPane1.getText());
            setTitle(file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        int count = 0;
        String fileName = "untitled.txt";
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        File folder = new File(desktopPath + "/Noteplus_Documents");

        if (!folder.exists()) {
            JOptionPane.showMessageDialog(null, "A new folder Noteplus_Documents has been created in your desktop.\nAll the documents created will be saved over there.", "New Folder Created", JOptionPane.OK_OPTION);
            folder.mkdir();
        }
        file = new File(desktopPath + "/Noteplus_Documents/" + fileName);

        while (file.exists()) {
            count++;
            fileName = "untitled" + count + ".txt";
            file = new File(desktopPath + "/Noteplus_Documents/" + fileName);
        }

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFileChooser fileChooser = new JFileChooser(desktopPath + "/Noteplus_Documents/");
        fileChooser.setSelectedFile(new File(fileName));

        // set the icon of the file chooser dialog
        ImageIcon icon = new ImageIcon("C:/Users/acer/Desktop/Noteplus/Notepad.png");
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setDialogTitle("Save As");
        fileChooser.setApproveButtonToolTipText("Save");
        SwingUtilities.invokeLater(() -> {
            JOptionPane.getRootFrame().setIconImage(icon.getImage());
            fileChooser.setCurrentDirectory(folder);
            int option = fileChooser.showSaveDialog(null);

            if (option == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getPath();

                if (selectedFile.exists()) {
                    int response = JOptionPane.showConfirmDialog(null, "File already exists. Do you want to overwrite it?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (response == JOptionPane.NO_OPTION) {
                        return;
                    }
                }
                if (!filePath.endsWith(".txt")) {
                    filePath += ".txt";
                }

                try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                    writer.println(jTextPane1.getText());
                    setTitle(selectedFile.getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(jTextPane1.getPrintable(null, null));
        job.setJobName("Print Document");

        PageFormat pageFormat = job.defaultPage();
        Paper paper = pageFormat.getPaper();

        // Set Margins
        double leftMargin = 10;    // Left margin in points
        double rightMargin = 10;   // Right margin in points
        double topMargin = 36;     // Top margin in points
        double bottomMargin = 36;  // Bottom margin in points

        paper.setImageableArea(
                paper.getImageableX() + leftMargin,
                paper.getImageableY() + topMargin,
                paper.getImageableWidth() - leftMargin - rightMargin,
                paper.getImageableHeight() - topMargin - bottomMargin
        );
        pageFormat.setPaper(paper);

        job.setPrintable(jTextPane1.getPrintable(null, null), pageFormat);

        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();

                // Save as PDF
                PrinterJob printJob = PrinterJob.getPrinterJob();
                printJob.setJobName("Save as PDF");

                Printable printable = new Printable() {
                    @Override
                    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                        if (pageIndex > 0) {
                            return Printable.NO_SUCH_PAGE;
                        }

                        Graphics2D g2 = (Graphics2D) graphics;

                        g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                        g2.translate(leftMargin, topMargin);  // Set the top-left margin

                        float printableWidth = (float) pageFormat.getImageableWidth() - (float) (leftMargin + rightMargin);
                        float printableHeight = (float) pageFormat.getImageableHeight() - (float) (topMargin + bottomMargin);

                        jTextPane1.setSize((int) printableWidth, (int) printableHeight);
                        jTextPane1.printAll(g2);

                        return Printable.PAGE_EXISTS;
                    }
                };

                printJob.setPrintable(printable, pageFormat);

                File outputFile = new File("output.pdf");
                FileOutputStream fos = new FileOutputStream(outputFile);
                DocPrintJob docPrintJob = printJob.getPrintService().createPrintJob();
                Doc doc = new SimpleDoc(printable, DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);
                docPrintJob.print(doc, new HashPrintRequestAttributeSet());
                fos.close();
            } catch (PrinterException | IOException e) {
                e.printStackTrace();
            } catch (PrintException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
            if (undoManager.canUndo()) {
                undoManager.undo();
            }
    }

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
        if (undoManager.canRedo()) {
            undoManager.redo();
        }
    }

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextPane1.selectAll();
    }

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedText = jTextPane1.getSelectedText();
        if (selectedText != null && !selectedText.isEmpty()) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection stringSelection = new StringSelection(selectedText);
            clipboard.setContents(stringSelection, null);
        }
    }

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextPane1.cut();
    }

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
        Transferable clipboardContent = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

        if (clipboardContent != null && clipboardContent.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String pastedText = (String) clipboardContent.getTransferData(DataFlavor.stringFlavor);
                jTextPane1.replaceSelection(pastedText);
            } catch (UnsupportedFlavorException | IOException e) {
                e.printStackTrace();
            }
        }
    }
    private Color foreground;
    private Color background;
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
        String imagePath = "C:\\Users\\acer\\Desktop\\Noteplus\\find&replace.png";
        Image image = Toolkit.getDefaultToolkit().getImage(imagePath);
        findReplaceFrame.setIconImage(image);
        findReplaceFrame.setSize(500, 200);
        // get position of jTextPane on screen
        Point jTextPanePos = jTextPane1.getLocationOnScreen();
        // calculate position of findReplaceFrame relative to jTextPane
        int x = jTextPanePos.x + 50;
        int y = jTextPanePos.y + 50;
        findReplaceFrame.setLocation(x, y);
        findReplaceFrame.setLayout(new BorderLayout());

        // create search panel
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel searchLabel = new JLabel("Find:");
        JTextField searchField = new JTextField(20);
        JLabel resultsLabel = new JLabel("");
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(resultsLabel); // add label for displaying results

        // create replace panel
        JPanel replacePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel replaceLabel = new JLabel("Replace with:");
        JTextField replaceField = new JTextField((int) 16.2f);
        replacePanel.add(replaceLabel);
        replacePanel.add(replaceField);

        // create buttons panel
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        findButton = new  JButton("Find");
        replaceButton = new JButton("Replace");
        replaceAllButton = new JButton("Replace All");
        buttonsPanel.add(findButton);
        buttonsPanel.add(replaceButton);
        buttonsPanel.add(replaceAllButton);

        // add panels to internal frame
        findReplaceFrame.add(searchPanel, BorderLayout.NORTH);
        findReplaceFrame.add(replacePanel, BorderLayout.CENTER);
        findReplaceFrame.add(buttonsPanel, BorderLayout.SOUTH);
        findReplaceFrame.setResizable(false);
        findReplaceFrame.setVisible(true);
        setThemeColors(findReplaceFrame.getContentPane());
        findButton.setEnabled(false);
        replaceButton.setEnabled(false);
        replaceAllButton.setEnabled(false);
        // DocumentListener to enable/disable Find button based on searchField content
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButtonState();
            }

            private void updateButtonState() {
                findButton.setEnabled(!searchField.getText().isEmpty());
            }
        });
        replaceField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButtonState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButtonState();
            }

            private void updateButtonState() {
                replaceButton.setEnabled(!replaceField.getText().isEmpty());
                replaceAllButton.setEnabled(!replaceField.getText().isEmpty());
            }
        });
        findButton.setForeground(Color.RED);
        replaceButton.setForeground(Color.RED);
        replaceAllButton.setForeground(Color.RED);
        // add action listeners to buttons
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                DefaultHighlighter highlighter = (DefaultHighlighter) jTextPane1.getHighlighter();
                DefaultHighlighter.DefaultHighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
                highlighter.removeAllHighlights();
                Document doc = jTextPane1.getDocument();
                Pattern pattern = Pattern.compile("\\b" + searchText + "\\b", Pattern.CASE_INSENSITIVE); // match whole word only, case-insensitive
                Matcher matcher = null;
                try {
                    matcher = pattern.matcher(doc.getText(0, doc.getLength()));
                } catch (BadLocationException ex) {
                    throw new RuntimeException(ex);
                }
                boolean found = false;
                int count = 0; // initialize count variable
                while (matcher.find()) {
                    found = true;
                    count++; // increment count for each match found
                    try {
                        highlighter.addHighlight(matcher.start(), matcher.end(), painter);
                    } catch (BadLocationException ex) {
                        ex.printStackTrace();
                    }
                }
                if (!found) {
                    resultsLabel.setText("No matches found for \"" + searchText + "\"");
                } else {
                    if (count == 1) {
                        resultsLabel.setText(count + " match found for \"" + searchText + "\""); // display results in label
                    } else {
                        resultsLabel.setText(count + " matches found for \"" + searchText + "\""); // display results in label
                    }
                }
            }
        });

        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String replaceText = replaceField.getText();
                DefaultHighlighter highlighter = (DefaultHighlighter) jTextPane1.getHighlighter();
                Highlighter.Highlight[] highlights = highlighter.getHighlights();
                if (highlights.length > 0) {
                    Highlighter.Highlight h = highlights[0];
                    int startIndex = h.getStartOffset();
                    int endIndex = h.getEndOffset();
                    try {
                        // save current caret position
                        int caretPos = jTextPane1.getCaretPosition();

                        jTextPane1.getDocument().remove(startIndex, endIndex - startIndex);
                        jTextPane1.getDocument().insertString(startIndex, replaceText, null);

                        // restore caret position
                        jTextPane1.setCaretPosition(caretPos);

                    } catch (BadLocationException ex) {
                        ex.printStackTrace();
                    }
                    highlighter.removeAllHighlights();
                } else {
                    resultsLabel.setText("\" "+searchField.getText()+ " \" not found.");
                }
            }
        });

        replaceAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                String replaceText = replaceField.getText();
                DefaultHighlighter highlighter = (DefaultHighlighter) jTextPane1.getHighlighter();
                Highlighter.Highlight[] highlights = highlighter.getHighlights();
                if (highlights.length > 0) {
                    // save current caret position
                    int caretPos = jTextPane1.getCaretPosition();

                    String text = jTextPane1.getText();
                    String wordBoundary = "\\b";
                    String escapedSearchText = Pattern.quote(searchText);
                    String wordRegex = wordBoundary + escapedSearchText + wordBoundary;
                    Pattern pattern = Pattern.compile(wordRegex, Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(text);
                    text = matcher.replaceAll(replaceText);
                    jTextPane1.setText(text);

                    // restore caret position
                    jTextPane1.setCaretPosition(caretPos);

                    // remove any highlights
                    highlighter.removeAllHighlights();
                } else {
                    resultsLabel.setText("\"" + searchText + "\" not found.");
                }
            }
        });

        findReplaceFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                findReplaceFrame.dispose();
                jTextPane1.getHighlighter().removeAllHighlights();
                resultsLabel.setText("");
            }
        });
        findReplaceFrame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowLostFocus(WindowEvent e) {
                findReplaceFrame.dispose();
                jTextPane1.getHighlighter().removeAllHighlights();
                resultsLabel.setText("");
            }
        });
    }
    private boolean isDetailsShown = false; // initialize to false

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
        isDetailsShown = !isDetailsShown; // toggle isDetailsShown
        if (isDetailsShown) {
            showDetails();
        } else {
            hideDetails();
        }
    }

    private void showDetails() {
        jPanel2.setVisible(true);
        jTextPane1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateNumChars();
            }
        });
        jTextPane1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateNumChars();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateNumChars();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateNumChars();
            }
        });
        updateNumChars();
        jMenuItem17.setText("Hide Details"); // change menu item text
    }

    private void hideDetails() {
        jPanel2.setVisible(false);
        jTextPane1.removeKeyListener(jTextPane1.getKeyListeners()[0]); // remove key listener
        jTextPane1.getDocument().removeDocumentListener((DocumentListener) jTextPane1.getDocument().getProperty("key_listener"));
        jMenuItem17.setText("Details"); // change menu item text
    }

    private void updateNumChars() {
        String text = jTextPane1.getText();
        int numChars = text.length();
        int numWords = 0;

        if (!text.isEmpty()) {
            numWords = text.split("\\s+").length;
        }

        String charText = (numChars <= 1) ? " Character" : " Characters";
        String wordText = (numWords <= 1) ? " Word" : " Words";

        jLabel1.setText(numChars + charText + " | " + numWords + wordText);
    }

    private void setThemeColors(Container container) {
        container.setBackground(background);
        container.setForeground(foreground);

        // Recursively update the color scheme for all child components
        for (Component component : container.getComponents()) {
            if (component instanceof Container) {
                setThemeColors((Container) component);
            } else {
                component.setBackground(background);
                component.setForeground(foreground);
            }
        }
    }

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {
        setDefaultTheme();
    }

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {
        setDarkTheme();
    }

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {
        setLightTheme();
    }

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {
        setGrayTheme();
    }

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {
        setBlueTheme();
    }

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {
        setSageTheme();
    }

    private void setDefaultTheme() {
         background = new Color(255, 255, 255); // Default theme background color
         foreground = new Color(0, 0, 0); // Default theme foreground color
        setThemeColors(background, foreground);
    }

    private void setDarkTheme() {
         background = new Color(45, 45, 45); // Dark theme background color
         foreground = new Color(255,255,255); // Dark theme foreground color
        setThemeColors(background, foreground);
    }

    private void setLightTheme() {
         background = new Color(245, 245, 240); // Light theme background color
         foreground = new Color(0, 0, 0); // Light theme foreground color
        setThemeColors(background, foreground);
    }

    private void setGrayTheme() {
         background = new Color(211, 211, 211); // Gray theme background color
         foreground = new Color(0, 0, 0); // Gray theme foreground color
        setThemeColors(background, foreground);
    }

    private void setBlueTheme() {
         background = new Color(57, 72, 103); // Blue theme background color
         foreground = new Color(255, 255, 255); // Blue theme foreground color
        setThemeColors(background, foreground);
    }

    private void setSageTheme() {
         background = new Color(179, 200, 144); // Sage theme background color
         foreground = new Color(0, 0, 0); // Sage theme foreground color
        setThemeColors(background, foreground);
    }

    private void setThemeColors(Color background, Color foreground) {
        jTextPane1.setBackground(background);
        jTextPane1.setForeground(foreground);
        jPanel2.setBackground(background);
        jPanel2.setForeground(foreground);
        jLabel1.setForeground(foreground);
        jMenuBar1.setBackground(background);
        findButton.setForeground(Color.RED);
        replaceButton.setForeground(Color.RED);
        replaceAllButton.setForeground(Color.RED);
        jMenu4.setOpaque(true);
        jMenu6.setOpaque(true);
        jMenu7.setOpaque(true);
        jMenu8.setOpaque(true);
        for (int i = 0; i <jMenuBar1.getMenuCount(); i++) {
            JMenu menu = jMenuBar1.getMenu(i);
            menu.setBackground(background);
            menu.setForeground(foreground);
            for (int j = 0; j < menu.getItemCount(); j++) {
                JMenuItem menuItem = menu.getItem(j);
                menuItem.setBackground(background);
                menuItem.setForeground(foreground);
            }
        }
        for (int j = 0; j < jMenu4.getItemCount(); j++) {
            JMenuItem menuItem = jMenu4.getItem(j);
            menuItem.setBackground(background);
            menuItem.setForeground(foreground);
        }
        for (int j = 0; j < jMenu6.getItemCount(); j++) {
            JMenuItem menuItem = jMenu6.getItem(j);
            menuItem.setBackground(background);
            menuItem.setForeground(foreground);
        }
        for (int j = 0; j < jMenu7.getItemCount(); j++) {
            jMenu7.setBackground(background);
            jMenu7.setForeground(foreground);
            JMenuItem menuItem = jMenu7.getItem(j);
            menuItem.setBackground(background);
            menuItem.setForeground(foreground);
        }
        for (int j = 0; j < jMenu8.getItemCount(); j++) {
            jMenu8.setBackground(background);
            jMenu8.setForeground(foreground);
            JMenuItem menuItem = jMenu8.getItem(j);
            menuItem.setBackground(background);
            menuItem.setForeground(foreground);
        }

    }

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {
        // Create a list of font families available on the system
        String[] fontFamilies = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        // Create a font family combo box
        JComboBox<String> fontFamilyComboBox = new JComboBox<>(fontFamilies);
        fontFamilyComboBox.setSelectedItem(jTextPane1.getFont().getFamily());

        // Create the font customization panel
        JPanel fontPanel = new JPanel(new GridLayout(2, 2, 10, 5));
        fontPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        fontPanel.add(new JLabel("Font Family:"));
        fontPanel.add(fontFamilyComboBox);
        // Show the dialog with font customization options
        int option = JOptionPane.showConfirmDialog(
                this, // Parent component (replace with your own if necessary)
                fontPanel, // Custom panel with font customization options
                "Fonts", // Dialog title
                JOptionPane.OK_CANCEL_OPTION, // Option type
                JOptionPane.PLAIN_MESSAGE // Message type
        );

        // Handle the user's selection
        if (option == JOptionPane.OK_OPTION) {
            String fontFamily = (String) fontFamilyComboBox.getSelectedItem();
            MutableAttributeSet attrs = jTextPane1.getInputAttributes();
            StyleConstants.setFontFamily(attrs, fontFamily);

            if (jTextPane1.getSelectedText() != null) {
                jTextPane1.setCharacterAttributes(attrs, false);
            }
        }
    }
    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {
        Color newFontColor = JColorChooser.showDialog(jTextPane1, "Font Color", fontColor);
        if (newFontColor != null) {
            fontColor = newFontColor;
            StyledDocument doc = jTextPane1.getStyledDocument();
            int start = jTextPane1.getSelectionStart();
            int end = jTextPane1.getSelectionEnd();
            boolean textSelected = start != end;

            if (textSelected) {
                Style style = doc.addStyle("FontColor", null);
                StyleConstants.setForeground(style, fontColor);
                doc.setCharacterAttributes(start, end - start, style, false);
            } else {
                MutableAttributeSet attrs = jTextPane1.getInputAttributes();
                StyleConstants.setForeground(attrs, fontColor);
            }
        }
    }

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {
        StyledEditorKit.BoldAction boldAction = new StyledEditorKit.BoldAction();
        boldAction.actionPerformed(evt);
    }

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {
        StyledEditorKit.ItalicAction italicAction = new StyledEditorKit.ItalicAction();
        italicAction.actionPerformed(evt);
    }

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {
        StyledEditorKit.UnderlineAction underlineAction = new StyledEditorKit.UnderlineAction();
        underlineAction.actionPerformed(evt);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem27;
    private JMenuItem jMenuItem28;
    private JMenuItem jMenuItem29;
    private JMenuItem jMenuItem30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
}
