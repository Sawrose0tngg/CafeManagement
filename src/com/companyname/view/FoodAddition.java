/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.view;

import com.companyname.dao.Food_Addition_Dao;
import com.companyname.dto.Food_Addition_Info;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhaskar
 */
public class FoodAddition extends javax.swing.JFrame {
DefaultTableModel dtm;
public void showData(){
    List<Food_Addition_Info> list=new Food_Addition_Dao().getFood_Addition_InfoList();
    DefaultTableModel tableModel=(DefaultTableModel)jTable1.getModel();
    tableModel.setRowCount(0);
    for(Food_Addition_Info food:list){
        tableModel.addRow(new Object[]{food.getAf_id(),food.getFood_type(),food.getFood_item(),food.getRate()});
    }
}
    /**
     * Creates new form FoodAddition
     */
    public FoodAddition() {
        initComponents();
        showData();
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
        ftype = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        food_item = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jadd = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 437));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FOODTYPE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 43, 120, 25);

        ftype.setBackground(new java.awt.Color(255, 204, 153));
        ftype.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ftype.setForeground(new java.awt.Color(0, 0, 204));
        ftype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Drinks", "Soups", "MainCourse", "Noodles", "Deserts" }));
        getContentPane().add(ftype);
        ftype.setBounds(206, 43, 146, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("FOOD ITEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 98, 104, 21);
        getContentPane().add(food_item);
        food_item.setBounds(210, 90, 146, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("RATE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 58, 26);
        getContentPane().add(rate);
        rate.setBounds(210, 130, 146, 26);

        jadd.setBackground(new java.awt.Color(51, 255, 51));
        jadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jadd.setForeground(new java.awt.Color(0, 0, 255));
        jadd.setText("ADD");
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });
        getContentPane().add(jadd);
        jadd.setBounds(10, 167, 70, 40);

        jDelete.setBackground(new java.awt.Color(51, 255, 51));
        jDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 0, 0));
        jDelete.setText("DELETE");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jDelete);
        jDelete.setBounds(140, 170, 90, 40);

        jupdate.setBackground(new java.awt.Color(255, 51, 51));
        jupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jupdate.setForeground(new java.awt.Color(0, 0, 204));
        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate);
        jupdate.setBounds(281, 167, 89, 40);

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(454, 167, 80, 40);

        jTable1.setBackground(new java.awt.Color(255, 255, 102));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "FOOD TYPE", "FOOD NAME", "RATE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 540, 147);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 360, 55, 47);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\bhaskar\\Desktop\\muna.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 560, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
        // TODO add your handling code here:
        
        String Food_Type = (String)ftype.getSelectedItem();
        String Food_Item = food_item.getText();
        String Rate = rate.getText();
        
        
        
      if(Food_Item.isEmpty()){
            JOptionPane.showMessageDialog(this, "Your Food Item is empty Please Enter it.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
      }
      if(Rate.isEmpty()){
            JOptionPane.showMessageDialog(this, "Your Rate is empty Please Enter it.", "Error", JOptionPane.WARNING_MESSAGE);
      }
      else{
          int Rate2 = Integer.parseInt(Rate);
      
      Food_Addition_Info fai=new Food_Addition_Info();
      fai.setFood_type(Food_Type);
      fai.setFood_item(Food_Item);
      fai.setRate(Rate2);
      Food_Addition_Dao fad=new Food_Addition_Dao();
      
            try {
                fad.add_foods(fai);
            } catch (SQLException ex) {
                Logger.getLogger(FoodAddition.class.getName()).log(Level.SEVERE, null, ex);
            }
      JOptionPane.showMessageDialog(this, "Successfully Inserted", null, JOptionPane.WARNING_MESSAGE);
      food_item.setText("");
      rate.setText("");
      showData();
      }

    }//GEN-LAST:event_jaddActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
int row=jTable1.getSelectedRow();
DefaultTableModel tableModel=(DefaultTableModel) jTable1.getModel();
Object af_id=tableModel.getValueAt(row, 0);
new Food_Addition_Dao().deleteFood_Addition_Info(Integer.parseInt(af_id.toString()));
showData();
        
       
        
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        food_item.setText("");
      rate.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        int row=  jTable1.getSelectedRow();
        DefaultTableModel tableModel=(DefaultTableModel) jTable1.getModel();
        Object FoodId=tableModel.getValueAt(row, 0);
        Object FoodType=tableModel.getValueAt(row, 1);
        Object FoodName=tableModel.getValueAt(row,2 );
        Object Rate=tableModel.getValueAt(row,3 );
        
        
        FoodEdit Edit=new FoodEdit();
   Edit.jid.setText(FoodId.toString());
   Edit.ftype1.setSelectedItem(FoodType.toString());
   Edit.jfooditem.setText(FoodName.toString());
   Edit.jrate.setText(Rate.toString());
   
   this.dispose();
   Edit.setVisible(true);


    }//GEN-LAST:event_jupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
AdminMenuset m= new AdminMenuset();
m.setVisible(true);
this.dispose();
// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FoodAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodAddition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodAddition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField food_item;
    private javax.swing.JComboBox ftype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jadd;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField rate;
    // End of variables declaration//GEN-END:variables
}