
package com.cart.model;

import java.util.ArrayList;


public class Cart {
    private ArrayList<CartItem> list;
    
    public Cart(){
            
        list = new ArrayList<CartItem>();
      }
    
    public void addItemToCart(CartItem p, int numOfItems){
        Boolean productPresent = false;
        
        for(CartItem ci : list){
            
            //if the product exists
            if(ci.getProductID() == p.getProductID()){
                ci.setNumberOfItems(numOfItems);
                productPresent = true;
            }        
        }
        
        //if the product doesn't exist add one item
            if(productPresent == false){
                p.setNumberOfItems(numOfItems);
                list.add(p);
            }
        
    }
    
    public ArrayList getCart(){
        return list;
    }
    
    public void removeFromCart(int product_id){
        
        for(CartItem ci: list){
            
            if(ci.getProductID() == product_id){
                list.remove(ci);
            }
        }
    }
    
    public Double getCartTotal(){
        Double cartTotal = 0.0;
        
        for(CartItem ci: list){
            
            cartTotal += ci.getTotalPrice();
        }
        return cartTotal;
        
    }
}
