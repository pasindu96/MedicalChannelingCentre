/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ac.uok.view;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ac.uok.dao.db.DBConnection;

/**
 *
 * @author pasindu
 */
public class LoginPage extends javax.swing.JFrame {
    public  String userName;
    private String passWord;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Login ");
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        btnExit = new javax.swing.JButton();
        label1 = new java.awt.Label();
        btnLogin = new org.jdesktop.swingx.JXButton();
        txtUserName = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(640, 440));
        setResizable(false);

        jXPanel2.setLayout(null);

        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ac/uok/image/download copy.png"))); // NOI18N
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jXPanel2.add(jXLabel1);
        jXLabel1.setBounds(260, 10, 120, 90);

        jXLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jXLabel2.setText("Weligama Medical Centre");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jXPanel2.add(jXLabel2);
        jXLabel2.setBounds(200, 90, 290, 45);

        jXLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ac/uok/image/user-icon1.png"))); // NOI18N
        jXLabel3.setText("jXLabel3");
        jXPanel2.add(jXLabel3);
        jXLabel3.setBounds(60, 180, 50, 40);

        jXLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ac/uok/image/technology_internet_communications4-512.png"))); // NOI18N
        jXPanel2.add(jXLabel5);
        jXLabel5.setBounds(50, 240, 50, 40);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jXPanel2.add(btnExit);
        btnExit.setBounds(420, 320, 90, 40);

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("User Name");
        jXPanel2.add(label1);
        label1.setBounds(116, 190, 80, 31);

        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jXPanel2.add(btnLogin);
        btnLogin.setBounds(260, 320, 90, 40);

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jXPanel2.add(txtUserName);
        txtUserName.setBounds(260, 190, 250, 30);

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Password");
        jXPanel2.add(label2);
        label2.setBounds(116, 250, 80, 31);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jXPanel2.add(txtPassword);
        txtPassword.setBounds(260, 250, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ac/uok/image/44.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(888, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(881, 440));
        jXPanel2.add(jLabel1);
        jLabel1.setBounds(0, -10, 650, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        int out=0;
        try{
        if(txtUserName.getText()== null || txtPassword.getText()==null ){
            JOptionPane.showMessageDialog(null, "Incorrect UserName or Password");
        }else{
                Connection conn=DBConnection.getInstance().getConnection();
                String sql="select * from login;";
                Statement stm;
                try {
                    stm = conn.createStatement();
                    ResultSet rst=stm.executeQuery(sql);
                    while(rst.next()){
                        if(rst.getString(2).equals(txtUserName.getText()))
                            if (rst.getString(3).equals(txtPassword.getText())){
                            Demo mainForm=new Demo(txtUserName.getText());
                            LoginPage.this.dispose();
                            mainForm.setVisible(true);
                            out=1;
                            }
                    }
                    if(out==0){
                        txtUserName.setText("");
                        txtPassword.setText("");
                        txtUserName.requestFocus();
                        JOptionPane.showMessageDialog(null, "Incorrect UserName or Password");
                    }
                } catch (SQLException ex) {
                    System.out.println("DDDD");
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        }catch(NullPointerException ob){
             
            JOptionPane.showMessageDialog(null,"Incorrect UserName ");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Do you want to Exit?","EXIT",JOptionPane.YES_NO_CANCEL_OPTION);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLogin.requestFocus();
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private org.jdesktop.swingx.JXButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JPasswordField txtPassword;
    private java.awt.TextField txtUserName;
    // End of variables declaration//GEN-END:variables
    
  
}