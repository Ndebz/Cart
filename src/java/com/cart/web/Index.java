/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.web;

import com.cart.model.Cart;
import com.cart.model.CartItem;
import com.cart.model.Product;
import com.cart.model.ProductsLoad;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SanelisoEmmah
 */
@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {

     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        HttpSession session = request.getSession(true);
        
        Cart cart = (Cart)session.getAttribute("cart");
        if (cart != null) {
             
         } else {
           
        
             cart = new Cart();
          
             session.setAttribute("cart",cart);
            }
        
        ArrayList<Product> load  = (ArrayList<Product>)session.getAttribute("productslist");
        if (load != null) {
             
         } else {
            load = new ProductsLoad().getProductslist();
            session.setAttribute("productslist", load);
        }
      
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

  

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
