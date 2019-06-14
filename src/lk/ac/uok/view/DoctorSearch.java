/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import lk.ac.uok.controller.ManageDoctorSearchController;
import lk.ac.uok.controller.ManageDoctorController;
import lk.ac.uok.core.dto.DoctorDTO;

/**
 *
 * @author pasindu
 */
public class DoctorSearch extends javax.swing.JPanel {

    private String docID;
    private String docName;
    private String docspecial;
    private String  dochospital;
                    
    /**
     * Creates new form DoctorSearch
     */
    public DoctorSearch() {
        initComponents();
        //loadComboBoxItem();
        loadAllDoctors();
        loadAllDoctorSpeciality();
        
        tblDoctor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                if (tblDoctor.getSelectedRow() == -1) return;
                
                 docID= tblDoctor.getValueAt(tblDoctor.getSelectedRow(), 0).toString();
                 docName= tblDoctor.getValueAt(tblDoctor.getSelectedRow(), 1).toString();
                 docspecial= tblDoctor.getValueAt(tblDoctor.getSelectedRow(), 2).toString();
                 dochospital= tblDoctor.getValueAt(tblDoctor.getSelectedRow(), 3).toString();
  
            }
        });
    }

    private void loadAllDoctors(){
        try {
            ArrayList<DoctorDTO> allDOctors = ManageDoctorController.getAllDoctors();
            DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
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
        }
    }
    
//    private void loadAllItemCodes(){
//        
//        try {
//            ArrayList<ItemDTO> allItems = ManageItemsController.getAllItems();
//            itemCodeComboBox.removeAllItems();
//            if (allItems == null) return;
//            
//            for (ItemDTO item : allItems) {
//                itemCodeComboBox.addItem(item.getCode());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
                                                       

//    private void itemCodeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {                                                  
//
//        try {
//            if (itemCodeComboBox.getSelectedIndex() == -1) return;
//            
//            ItemDTO item = ManageItemsController.searchItem(new ItemDTO(itemCodeComboBox.getSelectedItem().toString(), null, null, 0));
//            
//            if (item == null) return;
//            
//            itemDescriptionText.setText(item.getDescription());
//            qtyOnHandText.setText(item.getQtyOnHand() + "");
//            itemPriceText.setText(item.getUnitPrice().toPlainString());
//        } catch (Exception ex) {
//            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }                                                 

//    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        itemPriceText.selectAll();
//        itemPriceText.requestFocus();
//    }                                       
//
//    private void itemPriceTextActionPerformed(java.awt.event.ActionEvent evt) {                                              
//        String itemCode=(String) itemCodeComboBox.getSelectedItem();
//        String description=itemDescriptionText.getText();
//        double unitPrice=Double.parseDouble(itemPriceText.getText());
//        int qty=Integer.parseInt(qtyText.getText());
//        double amount=unitPrice*qty;
//        Object[] rowData={itemCode,description,qty,unitPrice,amount};
//        DefaultTableModel dtm=(DefaultTableModel) orderDetailTable.getModel();
//        dtm.addRow(rowData);
//    }                                             

//    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
//
//        OrderDTO order = new OrderDTO(orderIdText.getText(),
//                parseDate(orderDateText.getText()), customerIdComboBox.getSelectedItem().toString());
//        
//        DefaultTableModel dtm = (DefaultTableModel) orderDetailTable.getModel();
//        
//        ArrayList<OrderDetailDTO> alOrderDetails = new ArrayList();
//        
//        for (int i = 0; i < dtm.getRowCount(); i++) {
//            
//            OrderDetailDTO orderDetail = new OrderDetailDTO(
//                    order.getId(), dtm.getValueAt(i, 0).toString(),
//                    Integer.parseInt(dtm.getValueAt(i, 2).toString()),
//                    new BigDecimal(dtm.getValueAt(i, 3).toString()));
//            
//            alOrderDetails.add(orderDetail);
//        }
//        
//        try {
//            boolean result = PlaceOrderController.placeOrder(order, alOrderDetails);
//            
//            if (result){
//                JOptionPane.showMessageDialog(this, "Order has been successfully placed.");
//            }else{
//                JOptionPane.showMessageDialog(this, "Order hasn't been placed well due to some sort of an error");
//            }
//            
//        } catch (Exception ex) {
//            Logger.getLogger(PlaceOrder.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        cmbDocSpeciality = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnViewDoctor = new org.jdesktop.swingx.JXButton();
        btnRemove = new org.jdesktop.swingx.JXButton();

        setMinimumSize(new java.awt.Dimension(802, 564));

        jXLabel1.setText("Select Speciality");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cmbDocSpeciality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDocSpeciality.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDocSpecialityItemStateChanged(evt);
            }
        });
        cmbDocSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDocSpecialityActionPerformed(evt);
            }
        });

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Doctor Name", "Speciallity", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(tblDoctor);

        btnViewDoctor.setText("Show Doctors");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Doctor");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(cmbDocSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDocSpeciality)
                    .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDocSpecialityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDocSpecialityItemStateChanged
        try {
            if (cmbDocSpeciality.getSelectedIndex() == -1) return;
            
            DoctorDTO doc = ManageDoctorController.searchDoctor(new DoctorDTO(null,null,null,cmbDocSpeciality.getSelectedItem().toString(),null,null));
            if (doc == null) return;
            
            ArrayList<DoctorDTO> allDOctors = ManageDoctorController.getAllDoctors();
            DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
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
        }
    }//GEN-LAST:event_cmbDocSpecialityItemStateChanged

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DoctorDTO doct = new DoctorDTO(docID,
                docName, 
                docspecial, 
               null,null,dochospital);
        try {
            boolean result = ManageDoctorController.deleteDoctor(doct);
            
            if (result){
                JOptionPane.showMessageDialog(this, "Doctor has been successfully deleted.");
                loadAllDoctors();
            }else{
                JOptionPane.showMessageDialog(this, "Doctor hasn't been added due to some error");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DoctorSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        String speciality=(String) cmbDocSpeciality.getSelectedItem();
        try {
            ArrayList<DoctorDTO> doctorList=ManageDoctorSearchController.getDoctorInfo(speciality);
            DefaultTableModel dtm=(DefaultTableModel) tblDoctor.getModel();
            dtm.setRowCount(0);
            for (DoctorDTO doctor : doctorList) {
                Object[] data={doctor.getDoctorID(),doctor.getName(),doctor.getSpeciallity(),doctor.getHospital_name()};
                dtm.addRow(data);
            }
            
            //        cmbDocSpeciality.getSelectedItem();
            //        if(cmbDocSpeciality.getSelectedItem()== "CardioLogist"){
            //            /*DoctorDTO doctor=ManageDoctorController.searchDoctor(new DoctorDTO(null, null, null, "CardioLogist" , null, null);
            //            Object[] rowData={itemCode,description,qty,unitPrice,amount};*/
            //            DefaultTableModel dtm=(DefaultTableModel) tblDoctor.getModel();
            //            //dtm.addRow(rowData);
            //            System.err.println("CardioLogist");
            //
            //        }
            //        if(cmbDocSpeciality.getSelectedItem()== "ENT Surgeon"){
            //            System.err.println("ENT Surgeon");
            //        }
            //        if(cmbDocSpeciality.getSelectedItem()== "Psychiatrist"){
            //            System.err.println("Psychiatrist");
            //        }
            //        if(cmbDocSpeciality.getSelectedItem()== "Gynaecologist"){
            //            System.err.println("Gynaecologist");
            //        }
            //        if(cmbDocSpeciality.getSelectedItem()== "Neurologist"){
            //            System.err.println("Neurologist");
            //        }
        } catch (Exception ex) {
            Logger.getLogger(DoctorSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void cmbDocSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDocSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDocSpecialityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnRemove;
    private org.jdesktop.swingx.JXButton btnViewDoctor;
    private javax.swing.JComboBox<String> cmbDocSpeciality;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private javax.swing.JTable tblDoctor;
    // End of variables declaration//GEN-END:variables

    private void loadComboBoxItem() {
        cmbDocSpeciality.removeAllItems();
        cmbDocSpeciality.addItem("CardioLogist");
        cmbDocSpeciality.addItem("ENT Surgeon");
        cmbDocSpeciality.addItem("Psychiatrist");
        cmbDocSpeciality.addItem("Gynaecologist");
        cmbDocSpeciality.addItem("Neurologist");
        
    }

    private void loadAllDoctorSpeciality() {
        try {
            ArrayList<DoctorDTO> allCustomers = ManageDoctorController.getAllDoctors();

            cmbDocSpeciality.removeAllItems();
            if (allCustomers == null) return;
            for (DoctorDTO doctor : allCustomers) {
                if(!cmbDocSpeciality.equals(doctor.getSpeciallity())==true){
                    cmbDocSpeciality.addItem(doctor.getSpeciallity());
                }    
            }
        } catch (Exception ex) {
            Logger.getLogger(DoctorSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}