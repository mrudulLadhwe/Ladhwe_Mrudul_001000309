/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.DemographicInfo;
import model.DrivingLicenseInfo;

/**
 *
 * @author mrudu
 */
public class DrivingLicenseCreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form DrivingLicenseCreatePanel
     */
    DrivingLicenseInfo driving;
    DemographicInfo demoInfo;
    
    public DrivingLicenseCreatePanel(DemographicInfo demoInfo, DrivingLicenseInfo driving) {
        initComponents();
        this.demoInfo = demoInfo;
        this.driving = driving;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DrivingLicense = new javax.swing.JLabel();
        LicenseNo = new javax.swing.JLabel();
        issuedDate = new javax.swing.JLabel();
        expiryDate = new javax.swing.JLabel();
        bloodType = new javax.swing.JLabel();
        LicenseNumberInput = new javax.swing.JTextField();
        issueddateInput = new javax.swing.JTextField();
        expiryDateInput = new javax.swing.JTextField();
        bloodTypeInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        UploadButton = new javax.swing.JButton();
        photo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 229, 251));

        DrivingLicense.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DrivingLicense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DrivingLicense.setText("Input Driving License Details");

        LicenseNo.setText("License Number :");

        issuedDate.setText("Issued Date :");

        expiryDate.setText("Expiry Date :");

        bloodType.setText("Blood Type :");

        issueddateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueddateInputActionPerformed(evt);
            }
        });

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        UploadButton.setText("Upload");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        photo.setText("Upload Photo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(expiryDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LicenseNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issuedDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloodType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UploadButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LicenseNumberInput)
                                .addComponent(issueddateInput)
                                .addComponent(expiryDateInput)
                                .addComponent(bloodTypeInput, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                    .addComponent(DrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LicenseNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(issueddateInput, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(issuedDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiryDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bloodTypeInput)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UploadButton)
                    .addComponent(photo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void issueddateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueddateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueddateInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        driving.setLicenseNo(LicenseNumberInput.getText());
        driving.setIssuedDate(issueddateInput.getText());
        driving.setExpiryDate(expiryDateInput.getText());
        driving.setBloodType(bloodTypeInput.getText());
        demoInfo.setDrive(driving);
        
        JOptionPane.showMessageDialog(this, "Information Saved!!");
        
        clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        File f = choose.getSelectedFile();
        String filename = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(118,142,Image.SCALE_SMOOTH);
        photo.setIcon(icon);
    }//GEN-LAST:event_UploadButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DrivingLicense;
    private javax.swing.JLabel LicenseNo;
    private javax.swing.JTextField LicenseNumberInput;
    private javax.swing.JButton UploadButton;
    private javax.swing.JLabel bloodType;
    private javax.swing.JTextField bloodTypeInput;
    private javax.swing.JLabel expiryDate;
    private javax.swing.JTextField expiryDateInput;
    private javax.swing.JLabel issuedDate;
    private javax.swing.JTextField issueddateInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables

    private void clearSelection() {
        LicenseNumberInput.setText("");
        issueddateInput.setText("");
        expiryDateInput.setText("");
        bloodTypeInput.setText("");
    }
}