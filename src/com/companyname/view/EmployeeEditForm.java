/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.view;

import com.companyname.dao.EmployeeDao;
import com.companyname.dto.Employee;


/**
 *
 * @author bhaskar
 */
public class EmployeeEditForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeEditForrm
     */
    public EmployeeEditForm() {
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        username1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\bhaskar\\Desktop\\daju.jpg")); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(username1);
        username1.setBounds(191, 82, 155, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 150, 111, 21);

        submit.setBackground(new java.awt.Color(255, 0, 51));
        submit.setForeground(new java.awt.Color(255, 255, 102));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(310, 220, 70, 40);
        jPanel1.add(jpassword);
        jpassword.setBounds(191, 133, 155, 30);

        jLabel4.setText("id");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 8, 14);
        jPanel1.add(id);
        id.setBounds(10, 0, 60, 23);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 220, 80, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 110, 30);

        jLabel6.setBackground(new java.awt.Color(102, 255, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 0));
        jLabel6.setText("EMPLOYEE EDIT FORM");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 10, 280, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/companyname/view/daju.jpg"))); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 260);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        Employee employee=new Employee();
        //        employee.setType((String)select1.getSelectedItem());
        employee.setUsername(username1.getText());
        employee.setId(Integer.parseInt(id.getText()));
        employee.setPassword(jpassword.getText());
        EmployeeDao dao=new EmployeeDao();
        dao.UpdateEmployeeInfo(employee);
        this.dispose();
        new EmployeeForm().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
EmployeeForm f= new EmployeeForm();
f.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeEditForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jpassword;
    private javax.swing.JButton submit;
    public javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}