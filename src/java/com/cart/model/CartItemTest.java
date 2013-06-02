
package com.cart.model;


public class CartItemTest {
    
    public static void main(String args[]){
        
             Product p1 = new Product();
             Product p2 = new Product();
        
        p1.setProductID(1);
        p1.setProductName("HeadFirst Java");
        p1.setProductDescription("Beginner Book");
        p1.setProductPrice(20.00);
        
        p2.setProductID(2);
        p2.setProductName("HeadFirst Java");
        p2.setProductDescription("Beginner Book");
        p2.setProductPrice(20.00);
        
        CartItem ci = new CartItem();
        CartItem ci2 = new CartItem();
        
        ci.setProduct(p1);
        ci2.setProduct(p2);
        
        
        
        Cart c = new Cart();
        c.addItemToCart(ci);
        c.addItemToCart(ci);
        c.addItemToCart(ci);
        c.addItemToCart(ci2);
        
        c.removeFromCart(1);
        
        
        System.out.println(((CartItem)c.getCart().get(0)).getNumberOfItems());
        
    }
}
