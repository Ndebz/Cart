
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*;import com.cart.model.*; import java.text.NumberFormat;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Que's Book Store</title>
        <style>
            
            #products-holder{
                float: left;
                width: 500px;
            }
            
            #cart{
                float: right;
                width: 300px;
            }
            
            .container{
                width:960px;
                margin-left: auto;
                margin-right: auto;
            }
            
            ul {
                list-style-type: none;
            }
            
            input[type=text]{
                width: 43px;
            }
            
        </style>
    </head>
    <body>
        <div class="container">
        <h1>Que's Book Store</h1>
        <div id="products-holder">
        <%
           //get catalog products
           ArrayList<Product> products = Catalog.getInstance().getCatalog();
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            
            for(int i = 0;i < products.size();i++){
                out.print("<div>");
                out.println("<form action='addtocart.do' method='post'>  ");
                out.print("<h2>"+products.get(i).getProductName()+"</h2>");
                out.println("<input type='hidden' name='id' value='"+products.get(i).getProductID()+"'/>");
                out.println(products.get(i).getProductDescription()+ "<br />") ;
                out.println(currency.format(products.get(i).getProductPrice()));
                out.println("<input type='text' name='amount' /><br />");
                out.println("<input type='submit' value='Add to Cart' >");
                out.println("</form>");
                out.print("</div>");
                
            }
         %>
        </div>
         <div id="cart" style="background-color: yellow;">
             <ul>
             <%
               ArrayList<CartItem> cart = ((Cart)session.getAttribute("cart")).getCart();
               double total = ((Cart)session.getAttribute("cart")).getCartTotal();
              
               
               if (cart.isEmpty()){
                   out.println("<li>Shopping Cart is Empty</li>");
               }else{
                    for(CartItem c : cart){

                        out.println("<li>"+ c.getProductName() +" x "+ c.getNumberOfItems()+"</strong></li>");
                    }
                    out.println("<li><strong>Cart Total: </strong>" + currency.format(total) + "</li>");
               }
             %>
             </ul>
         </div>
        </div><!--container-->
    </body>
</html>
