/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionweb.product;

/**
 *
 * @author VODUCMINH
 */
public class ProductDTO {
    private String productID;
    private int categoryID;
    private String productName;
    private double price;
    private int discount;
    private String description;
    private String productImage;
    private String createDate;
    private int productQuantity; 
    private String availableStatus;
    private String conditionStatus;

    public ProductDTO() {
    }

    public ProductDTO(String productID, int categoryID, String productName, double price, int discount, String description, String productImage, String createDate, int productQuantity, String availableStatus, String conditionStatus) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.productImage = productImage;
        this.createDate = createDate;
        this.productQuantity = productQuantity;
        this.availableStatus = availableStatus;
        this.conditionStatus = conditionStatus;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
    }

    public String getConditionStatus() {
        return conditionStatus;
    }

    public void setConditionStatus(String conditionStatus) {
        this.conditionStatus = conditionStatus;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "productID=" + productID + ", categoryID=" + categoryID + ", productName=" + productName + ", price=" + price + ", discount=" + discount + ", description=" + description + ", productImage=" + productImage + ", createDate=" + createDate + ", productQuantity=" + productQuantity + ", availableStatus=" + availableStatus + ", conditionStatus=" + conditionStatus + '}';
    }
    
    
}
