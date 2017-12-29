/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.dao;

import com.companyname.database.Database;
import com.companyname.dto.Employee;
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
public class EmployeeDao {
    public void saveEmployeeInfo(Employee employee){
       
        String sql="insert into employee(username,password)values(?,?)";
        PreparedStatement ps=null;
        String type= employee.getType();
        
//         int usertype=0;
//        if (!type.equalsIgnoreCase("admin")) {
//            usertype=2;
//        } else {
//            usertype=1;
//            
//        }
//        System.out.println(type);
        try{
           ps=Database.getConnection().prepareStatement(sql);
//           ps.setInt(1,(usertype));
           ps.setString(1,employee.getUsername());
           ps.setString(2, employee.getPassword());
           
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
    public List<Employee> getEmployeeList(){
      List<Employee> list = new ArrayList<>();
       String sql="select * from employee";
        PreparedStatement ps=null;
        try{
            ps=Database.getConnection().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               Employee employee =new Employee();
               employee.setId(rs.getInt("id"));
//               employee.setType(rs.getString("type"));
               employee.setUsername(rs.getString("username"));
               employee.setPassword(rs.getString("password"));
               list.add(employee);
               
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
    }
    
    
    public Employee getEmployeeInfoById(int id){
        Employee employee =new Employee();
       
        PreparedStatement ps=null;
        try{
            String sql="select * from employee where id=?";
            ps=Database.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               
               employee.setId(rs.getInt("id"));
//               employee.setType(rs.getString("type"));
               employee.setUsername(rs.getString("username"));
               employee.setPassword(rs.getString("password"));
               
           }
           
    }catch(SQLException e){
        e.printStackTrace();
    }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return employee;
        }
    }
     public void deleteEmployeeInfo(int employeeId){
        String sql="delete from employee where id=?";
        PreparedStatement ps=null;
        try{
           ps=Database.getConnection().prepareStatement(sql);
   ps.setInt(1,employeeId);
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
     
     
     
     
        public void UpdateEmployeeInfo(Employee employee){
            PreparedStatement ps=null;
        try{
            String sql="update employee set username=?,password=? where id=? ";
           ps=Database.getConnection().prepareStatement(sql);
//           ps.setString(1,employee.getType());
           ps.setString(1,employee.getUsername());
           ps.setString(2, employee.getPassword());
           ps.setInt(3,employee.getId());
           
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

    
        
        
       
    
      
  
 
    
     
    


        
    
    

