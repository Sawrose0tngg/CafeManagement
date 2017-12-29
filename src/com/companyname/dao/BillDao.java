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
public class BillDao {
//    PreparedStatement ps=null;
//    public void savebill(Bill bill){
//        String sql="insert into bill(cname,amt,pdate)values(?,?,?)";
//        try{
//             ps=Database.getConnection().prepareStatement(sql);
//             ps.setString(1, bill.getCname());
//             ps.setString(2,bill.getAmount() );
//             ps.setString(3, bill.getDate());
//             ps.executeUpdate();
//             
//        }catch(SQLException e){
//            e.printStackTrace();
//        } finally{
//            try{
//                ps.close();
//            }catch(SQLException ex){
//                Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
//                
//            }
//        }
//    }

    public void saveSales(Bill bill) {
        PreparedStatement ps = null;
        try {
            String sql1 = "insert into sales(quantity,name ,mrp,total)values(?,?,?,?)";
            ps = Database.getConnection().prepareStatement(sql1);
            ps.setString(1, bill.getQuantity());
            ps.setString(2, bill.getName());
            ps.setString(3, bill.getMrp());
            ps.setString(4, bill.getPrice());
            ps.executeUpdate();

        } catch (Exception e) {

        }

    }

    public List<Bill> getBillList() {
        List<Bill> list = new ArrayList<>();
        String sql = "select * from bill";
        PreparedStatement ps = null;
        try {
            ps = Database.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();

                bill.setAmount(rs.getString("amount"));
                bill.setCname(rs.getString("cname"));
                bill.setDate(rs.getString("date"));

                list.add(bill);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();

            } catch (SQLException ex) {
                Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public void deleteBill(int id) {
        String sql = "delete from bill where id=?";
        PreparedStatement ps = null;
        try {
            ps = Database.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
