/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FullMachine;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Christopher
 */
public class GuiFrame extends javax.swing.JFrame {
    
    File inputFile;
    MachineStart start;

    /**
     * Creates new form GuiFrame
     */
    public GuiFrame() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerRingButtonGroup = new javax.swing.ButtonGroup();
        middleRingButtonGroup = new javax.swing.ButtonGroup();
        outerRingButtonGroup = new javax.swing.ButtonGroup();
        encodeOrDecode = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        innerRingSettingsPanel = new javax.swing.JPanel();
        innerRingButton1 = new javax.swing.JRadioButton();
        innerRingButton2 = new javax.swing.JRadioButton();
        innerRingButton3 = new javax.swing.JRadioButton();
        innerRingButton4 = new javax.swing.JRadioButton();
        innerRingButton5 = new javax.swing.JRadioButton();
        middleRingSettingsPanel = new javax.swing.JPanel();
        middleRingButton1 = new javax.swing.JRadioButton();
        middleRingButton2 = new javax.swing.JRadioButton();
        middleRingButton3 = new javax.swing.JRadioButton();
        middleRingButton4 = new javax.swing.JRadioButton();
        middleRingButton5 = new javax.swing.JRadioButton();
        outerRingSettingsPanel = new javax.swing.JPanel();
        outerRingButton1 = new javax.swing.JRadioButton();
        outerRingButton2 = new javax.swing.JRadioButton();
        outerRingButton3 = new javax.swing.JRadioButton();
        outerRingButton4 = new javax.swing.JRadioButton();
        outerRingButton5 = new javax.swing.JRadioButton();
        titleLabel = new javax.swing.JLabel();
        innerStartSettings = new javax.swing.JPanel();
        innerStartSettingsScroll = new javax.swing.JScrollPane();
        innerStartSettingsList = new javax.swing.JList<>();
        middleStartSettings = new javax.swing.JPanel();
        middleStartSettingsScroll = new javax.swing.JScrollPane();
        middleStartSettingsList = new javax.swing.JList<>();
        outerStartSettings = new javax.swing.JPanel();
        outerStartSettingsScroll = new javax.swing.JScrollPane();
        outerStartSettingsList = new javax.swing.JList<>();
        plugboardPanel = new javax.swing.JPanel();
        plugboardTextField = new javax.swing.JTextField();
        plugboardLabel = new javax.swing.JLabel();
        encodeDecodePanel = new javax.swing.JPanel();
        encodeButton = new javax.swing.JRadioButton();
        decodeButton = new javax.swing.JRadioButton();
        finalButtonPanel = new javax.swing.JPanel();
        runButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        fileChooser.setCurrentDirectory(null);
        fileChooser.setDialogTitle("File Chooser");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Enigma Machine");
        setResizable(false);

        innerRingSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inner Wheel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        innerRingSettingsPanel.setPreferredSize(new java.awt.Dimension(100, 206));

        innerRingButtonGroup.add(innerRingButton1);
        innerRingButton1.setSelected(true);
        innerRingButton1.setText("Cipher 1");

        innerRingButtonGroup.add(innerRingButton2);
        innerRingButton2.setText("Cipher 2");
        innerRingButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innerRingButton2ActionPerformed(evt);
            }
        });

        innerRingButtonGroup.add(innerRingButton3);
        innerRingButton3.setText("Cipher 3");

        innerRingButtonGroup.add(innerRingButton4);
        innerRingButton4.setText("Cipher 4");
        innerRingButton4.setToolTipText("");

        innerRingButtonGroup.add(innerRingButton5);
        innerRingButton5.setText("Cipher 5");
        innerRingButton5.setToolTipText("");

        javax.swing.GroupLayout innerRingSettingsPanelLayout = new javax.swing.GroupLayout(innerRingSettingsPanel);
        innerRingSettingsPanel.setLayout(innerRingSettingsPanelLayout);
        innerRingSettingsPanelLayout.setHorizontalGroup(
            innerRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerRingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(innerRingButton1)
                    .addComponent(innerRingButton2)
                    .addComponent(innerRingButton3)
                    .addComponent(innerRingButton4)
                    .addComponent(innerRingButton5))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        innerRingSettingsPanelLayout.setVerticalGroup(
            innerRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerRingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerRingButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(innerRingButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(innerRingButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(innerRingButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(innerRingButton5)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        middleRingSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Middle Wheel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        middleRingSettingsPanel.setPreferredSize(new java.awt.Dimension(100, 206));

        middleRingButtonGroup.add(middleRingButton1);
        middleRingButton1.setSelected(true);
        middleRingButton1.setText("Cipher 1");

        middleRingButtonGroup.add(middleRingButton2);
        middleRingButton2.setText("Cipher 2");
        middleRingButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleRingButton2ActionPerformed(evt);
            }
        });

        middleRingButtonGroup.add(middleRingButton3);
        middleRingButton3.setText("Cipher 3");

        middleRingButtonGroup.add(middleRingButton4);
        middleRingButton4.setText("Cipher 4");
        middleRingButton4.setToolTipText("");

        middleRingButtonGroup.add(middleRingButton5);
        middleRingButton5.setText("Cipher 5");
        middleRingButton5.setToolTipText("");

        javax.swing.GroupLayout middleRingSettingsPanelLayout = new javax.swing.GroupLayout(middleRingSettingsPanel);
        middleRingSettingsPanel.setLayout(middleRingSettingsPanelLayout);
        middleRingSettingsPanelLayout.setHorizontalGroup(
            middleRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleRingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middleRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(middleRingButton1)
                    .addComponent(middleRingButton2)
                    .addComponent(middleRingButton3)
                    .addComponent(middleRingButton4)
                    .addComponent(middleRingButton5))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        middleRingSettingsPanelLayout.setVerticalGroup(
            middleRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleRingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(middleRingButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(middleRingButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(middleRingButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(middleRingButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(middleRingButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outerRingSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outer Wheel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        outerRingSettingsPanel.setPreferredSize(new java.awt.Dimension(100, 206));

        outerRingButtonGroup.add(outerRingButton1);
        outerRingButton1.setSelected(true);
        outerRingButton1.setText("Cipher 1");

        outerRingButtonGroup.add(outerRingButton2);
        outerRingButton2.setText("Cipher 2");
        outerRingButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outerRingButton2ActionPerformed(evt);
            }
        });

        outerRingButtonGroup.add(outerRingButton3);
        outerRingButton3.setText("Cipher 3");

        outerRingButtonGroup.add(outerRingButton4);
        outerRingButton4.setText("Cipher 4");
        outerRingButton4.setToolTipText("");

        outerRingButtonGroup.add(outerRingButton5);
        outerRingButton5.setText("Cipher 5");
        outerRingButton5.setToolTipText("");

        javax.swing.GroupLayout outerRingSettingsPanelLayout = new javax.swing.GroupLayout(outerRingSettingsPanel);
        outerRingSettingsPanel.setLayout(outerRingSettingsPanelLayout);
        outerRingSettingsPanelLayout.setHorizontalGroup(
            outerRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerRingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outerRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outerRingButton1)
                    .addComponent(outerRingButton2)
                    .addComponent(outerRingButton3)
                    .addComponent(outerRingButton4)
                    .addComponent(outerRingButton5))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        outerRingSettingsPanelLayout.setVerticalGroup(
            outerRingSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerRingSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outerRingButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outerRingButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outerRingButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outerRingButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outerRingButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setText("The Only Enigma Machine in Existance");

        innerStartSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inner Start", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        innerStartSettingsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        innerStartSettingsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        innerStartSettingsList.setSelectedIndex(0);
        innerStartSettingsScroll.setViewportView(innerStartSettingsList);

        javax.swing.GroupLayout innerStartSettingsLayout = new javax.swing.GroupLayout(innerStartSettings);
        innerStartSettings.setLayout(innerStartSettingsLayout);
        innerStartSettingsLayout.setHorizontalGroup(
            innerStartSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerStartSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerStartSettingsScroll)
                .addContainerGap())
        );
        innerStartSettingsLayout.setVerticalGroup(
            innerStartSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerStartSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerStartSettingsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        middleStartSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Middle Start", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        middleStartSettingsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        middleStartSettingsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        middleStartSettingsList.setSelectedIndex(0);
        middleStartSettingsScroll.setViewportView(middleStartSettingsList);

        javax.swing.GroupLayout middleStartSettingsLayout = new javax.swing.GroupLayout(middleStartSettings);
        middleStartSettings.setLayout(middleStartSettingsLayout);
        middleStartSettingsLayout.setHorizontalGroup(
            middleStartSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleStartSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(middleStartSettingsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        middleStartSettingsLayout.setVerticalGroup(
            middleStartSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleStartSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(middleStartSettingsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        outerStartSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outer Start", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        outerStartSettingsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        outerStartSettingsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        outerStartSettingsList.setSelectedIndex(0);
        outerStartSettingsScroll.setViewportView(outerStartSettingsList);

        javax.swing.GroupLayout outerStartSettingsLayout = new javax.swing.GroupLayout(outerStartSettings);
        outerStartSettings.setLayout(outerStartSettingsLayout);
        outerStartSettingsLayout.setHorizontalGroup(
            outerStartSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerStartSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outerStartSettingsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        outerStartSettingsLayout.setVerticalGroup(
            outerStartSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerStartSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outerStartSettingsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        plugboardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plugboard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        plugboardTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plugboardTextFieldActionPerformed(evt);
            }
        });

        plugboardLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        plugboardLabel.setText("Enter plugboard settings");

        javax.swing.GroupLayout plugboardPanelLayout = new javax.swing.GroupLayout(plugboardPanel);
        plugboardPanel.setLayout(plugboardPanelLayout);
        plugboardPanelLayout.setHorizontalGroup(
            plugboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plugboardPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(plugboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(plugboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plugboardTextField)
                .addContainerGap())
        );
        plugboardPanelLayout.setVerticalGroup(
            plugboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plugboardPanelLayout.createSequentialGroup()
                .addComponent(plugboardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(plugboardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        encodeDecodePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encode / Decode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        encodeOrDecode.add(encodeButton);
        encodeButton.setText("Encode");

        encodeOrDecode.add(decodeButton);
        decodeButton.setText("Decode");

        javax.swing.GroupLayout encodeDecodePanelLayout = new javax.swing.GroupLayout(encodeDecodePanel);
        encodeDecodePanel.setLayout(encodeDecodePanelLayout);
        encodeDecodePanelLayout.setHorizontalGroup(
            encodeDecodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encodeDecodePanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(encodeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(decodeButton)
                .addGap(82, 82, 82))
        );
        encodeDecodePanelLayout.setVerticalGroup(
            encodeDecodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encodeDecodePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encodeDecodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encodeButton)
                    .addComponent(decodeButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        finalButtonPanel.setBorder(new javax.swing.border.MatteBorder(null));

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout finalButtonPanelLayout = new javax.swing.GroupLayout(finalButtonPanel);
        finalButtonPanel.setLayout(finalButtonPanelLayout);
        finalButtonPanelLayout.setHorizontalGroup(
            finalButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalButtonPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        finalButtonPanelLayout.setVerticalGroup(
            finalButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalButtonPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(finalButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(finalButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(encodeDecodePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plugboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(innerStartSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(innerRingSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleRingSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(middleStartSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outerStartSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outerRingSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(innerRingSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(middleRingSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(outerRingSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(innerStartSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(middleStartSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outerStartSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(plugboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encodeDecodePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void innerRingButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innerRingButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_innerRingButton2ActionPerformed

    private void middleRingButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleRingButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleRingButton2ActionPerformed

    private void outerRingButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outerRingButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outerRingButton2ActionPerformed

    private void plugboardTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plugboardTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plugboardTextFieldActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            inputFile = fileChooser.getSelectedFile();
            /*
            try {
                // What to do with the file, e.g. display it in a TextArea
                textarea.read(new FileReader(file.getAbsolutePath()), null);
            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
            */
        } else {
            System.out.println("File access cancelled by user.");
        }
        
        //getRingChoices();
        //getStartSettings();
        //getPlugboard();
        start = new MachineStart(getRingChoices(), getStartSettings(), getPlugboard(), inputFile, getCodeChoice());
    }//GEN-LAST:event_runButtonActionPerformed

    public int[] getRingChoices(){

        int[] ringChoices = new int[3];
        
        if(innerRingButton1.isSelected()){ ringChoices[0] = Character.getNumericValue(innerRingButton1.getText().charAt(innerRingButton1.getText().length()-1)) ; }
        else if(innerRingButton2.isSelected()){ ringChoices[0] = Character.getNumericValue(innerRingButton2.getText().charAt(innerRingButton2.getText().length()-1)) ; }
        else if(innerRingButton3.isSelected()){ ringChoices[0] = Character.getNumericValue(innerRingButton3.getText().charAt(innerRingButton3.getText().length()-1)) ; }
        else if(innerRingButton4.isSelected()){ ringChoices[0] = Character.getNumericValue(innerRingButton4.getText().charAt(innerRingButton4.getText().length()-1)) ; }
        else if(innerRingButton5.isSelected()){ ringChoices[0] = Character.getNumericValue(innerRingButton5.getText().charAt(innerRingButton5.getText().length()-1)) ; }

        if(middleRingButton1.isSelected()){ ringChoices[1] = Character.getNumericValue(middleRingButton1.getText().charAt(middleRingButton1.getText().length()-1)) ; }
        else if(middleRingButton2.isSelected()){ ringChoices[1] = Character.getNumericValue(middleRingButton2.getText().charAt(middleRingButton2.getText().length()-1)) ; }
        else if(middleRingButton3.isSelected()){ ringChoices[1] = Character.getNumericValue(middleRingButton3.getText().charAt(middleRingButton3.getText().length()-1)) ; }
        else if(middleRingButton4.isSelected()){ ringChoices[1] = Character.getNumericValue(middleRingButton4.getText().charAt(middleRingButton4.getText().length()-1)) ; }
        else if(middleRingButton5.isSelected()){ ringChoices[1] = Character.getNumericValue(middleRingButton5.getText().charAt(middleRingButton5.getText().length()-1)) ; }

        if(outerRingButton1.isSelected()){ ringChoices[2] = Character.getNumericValue(outerRingButton1.getText().charAt(outerRingButton1.getText().length()-1)) ; }
        else if(outerRingButton2.isSelected()){ ringChoices[2] = Character.getNumericValue(outerRingButton2.getText().charAt(outerRingButton2.getText().length()-1)) ; }
        else if(outerRingButton3.isSelected()){ ringChoices[2] = Character.getNumericValue(outerRingButton3.getText().charAt(outerRingButton3.getText().length()-1)) ; }
        else if(outerRingButton4.isSelected()){ ringChoices[2] = Character.getNumericValue(outerRingButton4.getText().charAt(outerRingButton4.getText().length()-1)) ; }
        else if(outerRingButton5.isSelected()){ ringChoices[2] = Character.getNumericValue(outerRingButton5.getText().charAt(outerRingButton5.getText().length()-1)) ; }
      
        return ringChoices;
    }
    
    public int[] getStartSettings(){
        
        int[] startSettings = new int[3];

        startSettings[0] = Integer.parseInt( innerStartSettingsList.getSelectedValue() ); 
        startSettings[1] = Integer.parseInt( middleStartSettingsList.getSelectedValue() ); 
        startSettings[2] = Integer.parseInt( outerStartSettingsList.getSelectedValue() ); 
        
        return startSettings;
    }
    
    public String getPlugboard(){
        /*
        if(plugboardTextField.getText() == null){
            System.out.println("Plugboard text found as null. Converting to a # ");
            return "#";
        }
        else{
            return plugboardTextField.getText();
        }
        */
        return plugboardTextField.getText();
        
    }
    
    public int getCodeChoice(){
        if( decodeButton.isSelected() )
        {
            return 2;
        }
        else{
            return 1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFrame().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton decodeButton;
    private javax.swing.JRadioButton encodeButton;
    private javax.swing.JPanel encodeDecodePanel;
    private javax.swing.ButtonGroup encodeOrDecode;
    private javax.swing.JButton exitButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel finalButtonPanel;
    private javax.swing.JRadioButton innerRingButton1;
    private javax.swing.JRadioButton innerRingButton2;
    private javax.swing.JRadioButton innerRingButton3;
    private javax.swing.JRadioButton innerRingButton4;
    private javax.swing.JRadioButton innerRingButton5;
    private javax.swing.ButtonGroup innerRingButtonGroup;
    private javax.swing.JPanel innerRingSettingsPanel;
    private javax.swing.JPanel innerStartSettings;
    private javax.swing.JList<String> innerStartSettingsList;
    private javax.swing.JScrollPane innerStartSettingsScroll;
    private javax.swing.JRadioButton middleRingButton1;
    private javax.swing.JRadioButton middleRingButton2;
    private javax.swing.JRadioButton middleRingButton3;
    private javax.swing.JRadioButton middleRingButton4;
    private javax.swing.JRadioButton middleRingButton5;
    private javax.swing.ButtonGroup middleRingButtonGroup;
    private javax.swing.JPanel middleRingSettingsPanel;
    private javax.swing.JPanel middleStartSettings;
    private javax.swing.JList<String> middleStartSettingsList;
    private javax.swing.JScrollPane middleStartSettingsScroll;
    private javax.swing.JRadioButton outerRingButton1;
    private javax.swing.JRadioButton outerRingButton2;
    private javax.swing.JRadioButton outerRingButton3;
    private javax.swing.JRadioButton outerRingButton4;
    private javax.swing.JRadioButton outerRingButton5;
    private javax.swing.ButtonGroup outerRingButtonGroup;
    private javax.swing.JPanel outerRingSettingsPanel;
    private javax.swing.JPanel outerStartSettings;
    private javax.swing.JList<String> outerStartSettingsList;
    private javax.swing.JScrollPane outerStartSettingsScroll;
    private javax.swing.JLabel plugboardLabel;
    private javax.swing.JPanel plugboardPanel;
    private javax.swing.JTextField plugboardTextField;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}