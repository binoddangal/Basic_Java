/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kist.bit.servlet;

import edu.kist.bit.dto.PizzaDTO;
import edu.kist.bit.services.PizzaService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Binod Dangal
 */
public class PizzaServlet extends HttpServlet{
    PizzaService pizzaService;
      @Override
    public void init(ServletConfig config) throws ServletException{
        pizzaService = new PizzaService();
    }
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) 
            throws ServletException,IOException{
        rep.setContentType("text/html;charset=UTF-8");
        
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) 
            throws ServletException,IOException
    {
        String customerName = req.getParameter("customer_name");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String pizza_type = req.getParameter("pizza_type");
        String pizza_topping_type = req.getParameter("pizza_topping_type");
        String pizza_size = req.getParameter("pizza_size");
        double amount = Double.parseDouble(req.getParameter("amount"));
        double discount = Double.parseDouble(req.getParameter("discount"));
        double service_charge = Double.parseDouble(req.getParameter("service_charge"));
        double total_amt = Double.parseDouble(req.getParameter("total_amt"));
        
        PizzaDTO pizzaDto = new PizzaDTO();
        pizzaDto.setCustomerName(customerName);
        pizzaDto.setAddress(address);
        pizzaDto.setPhone(phone);
        pizzaDto.setPizzaType(pizza_type);
        pizzaDto.setPizzaToppings(pizza_topping_type);
        pizzaDto.setPizzaSize(pizza_size);
        pizzaDto.setAmount(amount);
        pizzaDto.setDiscount(discount);
        pizzaDto.setCharge(service_charge);
        pizzaDto.setTotalAmount(total_amt);
        
        try {
            pizzaService.savePizza(pizzaDto);
        } catch (SQLException ex) {
            Logger.getLogger(PizzaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
