/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.dao;

import com.companyname.database.Database;
import com.companyname.dto.Bill;
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
public class FullBillingsDao {
     PreparedStatement ps=null;
    public void savebill(Bill bill){
        String sql="insert into bill(cname,amount,date,quanity,name,mrp,price)values(?,?,?,?,?,?,?)";
        try{
             ps=Database.getConnection().prepareStatement(sql);
            // ps.setInt(1, bill.getBillno());
             ps.setString(1, bill.getCname());
             ps.setString(2,bill.getPrice());
             ps.setString(3, bill.getDate());
             ps.setString(4, bill.getQuantity());
             ps.setString(5, bill.getName());
             ps.setString(6,bill.getMrp());
             ps.setString(7,bill.getPrice());
             ps.executeUpdate();
             
        }catch(SQLException e){
            e.printStackTrace();
        } finally{
            try{
                ps.close();
            }catch(SQLException ex){
                
                
            }
        }
    }
//    public void saveSales(Bill bill1){
//        PreparedStatement ps=null;
//        String sql="insert into sales(quantity,name,mrp,total)values(?,?,?,?)";
//        try{
//            ps=Database.getConnection().prepareStatement(sql);
//            ps.setString(1, bill1.getQuantity());
//            ps.setString(2, bill1.getName());
//            ps.setString(3,bill1.getMrp());
//            ps.setString(4,bill1.getPrice());
//            ps.executeUpdate();
//                    
//        }catch(Exception e){
//            
//        }
//        
//    }
     public List<Bill> getBillList(){
        List<Bill> list=new ArrayList<>();
        String sql="select * from bill";
        PreparedStatement ps=null;
try{
    ps=Database.getConnection().prepareStatement(sql);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        Bill bill =new Bill();
//        bill.setBillno(rs.getInt("billno"));
        bill.setCname(rs.getString("cname"));
        bill.setAmount(rs.getString("amount"));
        bill.setDate(rs.getString("date"));
        
        
        list.add(bill);
    }
        
}
   catch(SQLException e){
       e.printStackTrace();
   }finally{
    try{
        ps.close();
        
    }catch(SQLException ex){
        Logger.getLogger(FullBillingsDao.class.getName()).log(Level.SEVERE,null,ex);
    }
}
 return list;   
} 
    
}
