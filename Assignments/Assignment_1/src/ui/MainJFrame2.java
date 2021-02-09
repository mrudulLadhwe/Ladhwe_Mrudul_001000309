/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.AddressInfo;
import model.BankAccountInfo;
import model.DemographicInfo;
import model.DrivingLicenseInfo;
import model.MedicalRecordInfo;

/**
 *
 * @author mrudu
 */
public class MainJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame2
     */
    
    DemographicInfo demoInfo;
    AddressInfo addInfo;
    DrivingLicenseInfo driveLi;
    MedicalRecordInfo mediInfo;
    BankAccountInfo accInfo;
    
    public MainJFrame2() {
        initComponents();
        
        demoInfo = new DemographicInfo();
        addInfo = new AddressInfo();
        driveLi = new DrivingLicenseInfo();
        mediInfo = new MedicalRecordInfo();
        accInfo = new BankAccountInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        CreateButtonDemo = new javax.swing.JButton();
        CreateButtonAddress = new javax.swing.JButton();
        CreateButtonBank = new javax.swing.JButton();
        CreateButtonLicense = new javax.swing.JButton();
        CreateButtonMedicalRecord = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        CreateButtonDemo.setBackground(new java.awt.Color(255, 255, 255));
        CreateButtonDemo.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CreateButtonDemo.setText("CreateDemo");
        CreateButtonDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonDemoActionPerformed(evt);
            }
        });

        CreateButtonAddress.setBackground(new java.awt.Color(255, 255, 255));
        CreateButtonAddress.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CreateButtonAddress.setText("CreateAddress");
        CreateButtonAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonAddressActionPerformed(evt);
            }
        });

        CreateButtonBank.setBackground(new java.awt.Color(255, 255, 255));
        CreateButtonBank.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CreateButtonBank.setText("CreateBankAccount");
        CreateButtonBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonBankActionPerformed(evt);
            }
        });

        CreateButtonLicense.setBackground(new java.awt.Color(255, 255, 255));
        CreateButtonLicense.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CreateButtonLicense.setText("CreateDrivingLicense");
        CreateButtonLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonLicenseActionPerformed(evt);
            }
        });

        CreateButtonMedicalRecord.setBackground(new java.awt.Color(255, 255, 255));
        CreateButtonMedicalRecord.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CreateButtonMedicalRecord.setText("CreateMedicalRecord");
        CreateButtonMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonMedicalRecordActionPerformed(evt);
            }
        });

        ViewButton.setBackground(new java.awt.Color(255, 255, 255));
        ViewButton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateButtonDemo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateButtonAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateButtonBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreateButtonMedicalRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CreateButtonLicense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateButtonDemo)
                .addGap(26, 26, 26)
                .addComponent(CreateButtonAddress)
                .addGap(27, 27, 27)
                .addComponent(CreateButtonBank)
                .addGap(28, 28, 28)
                .addComponent(CreateButtonLicense)
                .addGap(33, 33, 33)
                .addComponent(CreateButtonMedicalRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(ViewButton)
                .addGap(22, 22, 22))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonDemoActionPerformed
        // TODO add your handling code here:
        CreatePanel createPanel = new CreatePanel(demoInfo);
        jSplitPane1.setRightComponent(createPanel);
    }//GEN-LAST:event_CreateButtonDemoActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        ViewPanel viewPanel = new ViewPanel(demoInfo);
        jSplitPane1.setRightComponent(viewPanel);
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void CreateButtonAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonAddressActionPerformed
        // TODO add your handling code here:
        AddressCreatePanel addCreate = new AddressCreatePanel(demoInfo, addInfo);
        jSplitPane1.setRightComponent(addCreate);
    }//GEN-LAST:event_CreateButtonAddressActionPerformed

    private void CreateButtonLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonLicenseActionPerformed
        // TODO add your handling code here:
        DrivingLicenseCreatePanel driveCreate = new DrivingLicenseCreatePanel(demoInfo, driveLi);
        jSplitPane1.setRightComponent(driveCreate);
    }//GEN-LAST:event_CreateButtonLicenseActionPerformed

    private void CreateButtonMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonMedicalRecordActionPerformed
        // TODO add your handling code here:
        MedicalRecordCreatePanel mediCreate = new MedicalRecordCreatePanel(demoInfo, mediInfo);
        jSplitPane1.setRightComponent(mediCreate);
    }//GEN-LAST:event_CreateButtonMedicalRecordActionPerformed

    private void CreateButtonBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonBankActionPerformed
        // TODO add your handling code here:
        SavingAccCreatePanel createAcc = new SavingAccCreatePanel(demoInfo, accInfo);
        jSplitPane1.setRightComponent(createAcc);
    }//GEN-LAST:event_CreateButtonBankActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButtonAddress;
    private javax.swing.JButton CreateButtonBank;
    private javax.swing.JButton CreateButtonDemo;
    private javax.swing.JButton CreateButtonLicense;
    private javax.swing.JButton CreateButtonMedicalRecord;
    private javax.swing.JButton ViewButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}