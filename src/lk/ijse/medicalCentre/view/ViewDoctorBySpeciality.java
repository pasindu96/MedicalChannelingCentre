/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.medicalCentre.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.medicalCentre.controller.ManageDoctorController;
import lk.ijse.medicalCentre.core.dto.DoctorDTO;

/**
 *
 * @author pasindu
 */
public class ViewDoctorBySpeciality extends javax.swing.JFrame {

    /**
     * Creates new form ViewDoctorBySpeciality
     */
    public ViewDoctorBySpeciality() {
        initComponents();
        loadAllDoctorID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbDocID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbDocID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDocID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDocIDActionPerformed(evt);
            }
        });

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DoctorID", "Speciality"
            }
        ));
        jScrollPane1.setViewportView(tblView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(cmbDocID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cmbDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDocIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDocIDActionPerformed
       /*try {
            if (cmbDocID.getSelectedIndex() == -1) return;
            
            DoctorDTO doc = ManageDoctorController.searchDoctorID(new DoctorDTO(null,null,null,cmbDocID.getSelectedItem().toString(),null,null));
            if (doc == null) return;
            
            ArrayList<DoctorDTO> allDOctors = ManageDoctorController.getAllDoctors();
            DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
            dtm.setRowCount(0);
            if (allDOctors != null) {
            
            for (DoctorDTO doctor : allDOctors) {
                Object[] rowData={
                doctor.getDoctorID(),
                doctor.getName(),
                doctor.getSpeciallity(),
                doctor.getHospital_name(),
            };
            dtm.addRow(rowData);
            } 
            
        } 
        }catch (Exception ex) {
            Logger.getLogger(DoctorSearch.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_cmbDocIDActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDoctorBySpeciality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorBySpeciality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorBySpeciality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorBySpeciality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctorBySpeciality().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDocID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblView;
    // End of variables declaration//GEN-END:variables

    private void loadAllDoctorID() {
        try{
        ArrayList<DoctorDTO> allDocID = ManageDoctorController.getAllDoctorID();
            cmbDocID.removeAllItems();
            if (allDocID == null) return;
            
            for (DoctorDTO doctor : allDocID) {
                cmbDocID.addItem(doctor.getSpeciallity());
            }
    }catch(Exception ex){
        
        }
    }
}   

