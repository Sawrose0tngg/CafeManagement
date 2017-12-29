/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.dao;


import com.companyname.database.Database;
import com.companyname.dto.Food_Addition_Info;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Food_Addition_Dao {
    public void add_foods(Food_Addition_Info fai) throws SQLException
    {
        Connection con = Database.getConnection();
        
        String query = "INSERT INTO add_foods(food_type,food_item,rate) VALUES ('"+fai.getFood_type()+"','"+fai.getFood_item()+"',"+fai.getRate()+")";
        
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Food_Addition_Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public List<Food_Addition_Info>  getFood_Addition_InfoList(){
        List<Food_Addition_Info> list=new ArrayList<>();
        String sql="select * from add_foods";
        PreparedStatement ps=null;
        try{
            
           ps=Database.getConnection().prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
            Food_Addition_Info food=new Food_Addition_Info();
            food.setAf_id(rs.getInt("af_id"));
            food.setFood_type(rs.getString("food_type"));
            food.setFood_item(rs.getString("food_item"));
            food.setRate(rs.getInt("rate"));
            list.add(food);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Food_Addition_Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list;
        }
        
        
    }
    
    public void deleteFood_Addition_Info (int af_id){
        
        String sql="delete from add_foods where af_id=?";
        PreparedStatement ps=null;
        try{
            
           ps=Database.getConnection().prepareStatement(sql);
           
           ps.setInt(1, af_id);
           ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Food_Addition_Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    public void updateFood (Food_Addition_Info adf) throws SQLException{
        //String query = "UPDATE now_showing_movies SET name='"+movie_name+"',photo='"+photo+"' WHERE nsmid="+nsmid;
        String sql="update add_foods SET food_type='"+adf.getFood_type()+"',food_item='"+adf.getFood_item()+"',rate="+adf.getRate()+" WHERE af_id="+adf.getAf_id();
        
        Connection con = Database.getConnection();
        try{
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        }
        catch(Exception ex){
            System.out.println("Error executiong query");
            
        }
        
        
    }
    
    
    
    
}
