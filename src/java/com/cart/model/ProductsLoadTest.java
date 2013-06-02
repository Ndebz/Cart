/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.model;

import java.util.ArrayList;


public class ProductsLoadTest {
    
    public static void main(String args[]){
        
        ProductsLoad p = new ProductsLoad();
        p.loadProducts();
        ArrayList<Product> list = p.getProductslist();
        
        for(int i=0;i < list.size(); i++ ){
            System.out.println(list.get(i).getProductName());
        }
    }
}
