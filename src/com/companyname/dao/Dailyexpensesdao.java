/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.dao;

import com.companyname.database.Database;
import com.companyname.view.Expenses;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhaskar
 */
public class Dailyexpensesdao {
    public void saveDailyexpenses(Expenses expenses){
        PreparedStatement ps=null;
        try{
        String sql="insert into expenses(item,quantity,mrp,price,Date,total)values(?,?,?,?,?,?)";
        ps=Database.getConnection().prepareStatement(sql);
        ps.setString(1,expenses.getItem());
        ps.setString(2,expenses.getQuantity());
        ps.setString(3, expenses.getMrp());
        ps.setString(4, expenses.getPrice());
        ps.setString(5, expenses.getDate());
        ps.setString(6,expenses.getTotal());
        ps.executeUpdate();
    }catch(Exception e){
        
    }
    
}
     public List<Expenses> getExpensesesList(){
      List<Expenses> list = new ArrayList<>();
       String sql="select * from expenses";
        PreparedStatement ps=null;
        try{
            ps=Database.getConnection().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               Expenses e =new Expenses();
               e.setId(rs.getString("id"));
               
               e.setItem(rs.getString("item"));
//               employee.setType(rs.getString("type"));
               e.setQuantity(rs.getString("quantity"));
               e.setMrp(rs.getString("mrp"));
               e.setPrice(rs.getString("price"));
               e.setTotal(rs.getString("total"));
               
               list.add(e);
               
           }
           
    }catch(SQLException e){
        e.printStackTrace();
    }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list;
        }
    }public void deleteExpensesInfo(int expensesId){
        String sql="delete from expenses where id=?";
        PreparedStatement ps=null;
        try{
           ps=Database.getConnection().prepareStatement(sql);
   ps.setInt(1,expensesId);
           ps.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
}
