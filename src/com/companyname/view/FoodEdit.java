/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.view;

import com.companyname.dao.Food_Addition_Dao;
import com.companyname.dto.Employee;
import com.companyname.dto.Food_Addition_Info;
import com.companyname.view.FoodAddition;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dell
 */
public class FoodEdit extends javax.swing.JFrame {

    /**
     * Creates new form FoodEdit
     */
    public FoodEdit() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jsubmit = new javax.swing.JButton();
        jfooditem = new javax.swing.JTextField();
        jrate = new javax.swing.JTextField();
        jid = new javax.swing.JLabel();
        ftype1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 309));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FOODTYPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 55, 120, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("FOOD ITEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 104, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("RATE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 58, 26);

        jsubmit.setBackground(new java.awt.Color(255, 255, 51));
        jsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jsubmit.setForeground(new java.awt.Color(51, 51, 255));
        jsubmit.setText("Submit");
        jsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jsubmit);
        jsubmit.setBounds(280, 190, 100, 50);
        getContentPane().add(jfooditem);
        jfooditem.setBounds(216, 97, 146, 34);
        getContentPane().add(jrate);
        jrate.setBounds(216, 146, 146, 32);
        getContentPane().add(jid);
        jid.setBounds(216, 11, 146, 26);

        ftype1.setBackground(new java.awt.Color(255, 255, 51));
        ftype1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ftype1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Drinks", "Soups", "MainCourse", "Noodles", "Deserts" }));
        getContentPane().add(ftype1);
        ftype1.setBounds(216, 55, 133, 25);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 230, 77, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/companyname/view/punam.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsubmitActionPerformed
        // TODO add your handling code here:
        Employee employee=new Employee();
        Food_Addition_Info adf=new Food_Addition_Info(); 
        adf.setAf_id(Integer.parseInt(jid.getText()));
        adf.setFood_type(ftype1.getSelectedItem().toString());
        adf.setFood_item(jfooditem.getText());
        adf.setRate(Integer.parseInt(jrate.getText()));
        Food_Addition_Dao fad=new Food_Addition_Dao();
        try {
            fad.updateFood(adf);
        } catch (SQLException ex) {
            Logger.getLogger(FoodEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        FoodAddition fa=new FoodAddition();
   fa.setVisible(true);
        
        
        
        
        
    }//GEN-LAST:event_jsubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
FoodAddition f= new FoodAddition();
f.setVisible(true);
this.dispose();
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
            java.util.logging.Logger.getLogger(FoodEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox ftype1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField jfooditem;
    public javax.swing.JLabel jid;
    public javax.swing.JTextField jrate;
    private javax.swing.JButton jsubmit;
    // End of variables declaration//GEN-END:variables
}
