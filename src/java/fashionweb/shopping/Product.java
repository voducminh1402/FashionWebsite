/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionweb.shopping;

import java.util.Map;

/**
 *
 * @author VODUCMINH
 */
public class Product {
    private String productID;
    private String productName;
    private String productImage;
    private double productPrice;
    private int quantity;

    public Product() {
        this.productID = "";
        this.productName = "";
        this.productImage = "";
        this.productPrice = 0;
        this.quantity = 0;
    }

    public Product(String productID, String productName, String productImage, double productPrice, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", productImage=" + productImage + ", productPrice=" + productPrice + ", quantity=" + quantity + '}';
    }
    
    
}
