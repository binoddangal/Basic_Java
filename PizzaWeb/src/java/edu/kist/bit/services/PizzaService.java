/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kist.bit.services;

import edu.kist.bit.dto.PizzaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Binod Dangal
 */
public class PizzaService {
    private Connection conn = null;
    
    public PizzaService(){
        if (conn == null){
            DBConnection db = new DBConnection();
            conn = db.getConnection();
        }
    }
     public void savePizza(PizzaDTO PizzaDTO) throws SQLException{
        String query = "INSERT INTO pizza_tbl(customer_name,address,phone,"
                + "pizza_type,pizza_topping_type,pizza_size,"
                + "amount,discount,service_charge,total_amt) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, PizzaDTO.getCustomerName());
            pstmt.setString(2, PizzaDTO.getAddress());
            pstmt.setString(3, PizzaDTO.getPhone());
            pstmt.setString(4, PizzaDTO.getPizzaType());
            pstmt.setString(5, PizzaDTO.getPizzaToppings());
            pstmt.setString(6, PizzaDTO.getPizzaSize());
            pstmt.setDouble(7, PizzaDTO.getAmount());
            pstmt.setDouble(8, PizzaDTO.getDiscount());
            pstmt.setDouble(9, PizzaDTO.getCharge());
            pstmt.setDouble(10, PizzaDTO.getTotalAmount());

            int result = pstmt.executeUpdate(query);
            if(result>0)
            {
                System.out.println("Query Executed Successfully");
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }
     public List<PizzaDTO> getALlPizzaDTO(){
         List<PizzaDTO> pizzas = new ArrayList<>();
         String query = "SELECT * FROM pizza_tbl";
         
         try{
         PreparedStatement pstmt = conn.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery();
         while (rs.next()){
             PizzaDTO PizzaDTO = new PizzaDTO();
             
             pizzas.add(PizzaDTO);
             PizzaDTO.setCustomerName(rs.getString("customer_name"));
             PizzaDTO.setAddress(rs.getString("address"));
             PizzaDTO.setPhone(rs.getString("phone"));
             PizzaDTO.setPizzaType(rs.getString("phone"));
             PizzaDTO.setPizzaToppings(rs.getString("phone"));
             PizzaDTO.setPizzaSize(rs.getString("phone"));
             PizzaDTO.setAmount(rs.getDouble("amount"));
             PizzaDTO.setDiscount(rs.getDouble("discount"));
             PizzaDTO.setCharge(rs.getDouble("charge"));
             PizzaDTO.setTotalAmount(rs.getDouble("total_amt"));
             pizzas.add(PizzaDTO);
         }         
         }
         catch (SQLException ex){
             Logger.getLogger(PizzaService.class.getName()).log(Level.SEVERE, query);
         }
         return pizzas;
     }
}
