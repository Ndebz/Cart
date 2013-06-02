
package com.cart.model;


public class CartItem {
    
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotalPrice() {
        return getProductPrice() * getNumberOfItems();
    }

    public int getProductID(){
        
        return product.getProductID();
    }
    
    public double getProductPrice(){
        
        return product.getProductPrice();
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
    
    public String getProductName(){
        
        return this.product.getProductName();
    }

    private int numberOfItems;
    
}
