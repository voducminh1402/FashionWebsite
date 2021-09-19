/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionweb.product;

import fashionweb.utils.DBUtils;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VODUCMINH
 */
public class ProductDAO {
    public List<ProductDTO> getProductList(String search) throws SQLException {
        List<ProductDTO> productList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * "
                            + " FROM tblProducts "
                            + " WHERE productName LIKE ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String productID = rs.getString("productID");
                    int categoryID = Integer.parseInt(rs.getString("categoryID"));
                    String productName = rs.getString("productName");
                    double price = Double.parseDouble(rs.getString("price"));
                    int discount = Integer.parseInt(rs.getString("discount"));
                    String description = rs.getString("description");
                    String productImage = rs.getString("productImage");
                    String createDate = rs.getString("createDate");
                    int productQuantity = Integer.parseInt(rs.getString("productQuantity"));
                    String availableStatus = rs.getString("availableStatus");
                    String conditionStatus = rs.getString("conditionStatus");
                    
                    productList.add(new ProductDTO(productID, categoryID, productName, price, discount, "", productImage, createDate, productQuantity, availableStatus, conditionStatus));
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return productList;
    }
    
    public List<ProductDTO> getAllProductList() throws SQLException {
        List<ProductDTO> productList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM tblProducts";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String productID = rs.getString("productID");
                    int categoryID = Integer.parseInt(rs.getString("categoryID"));
                    String productName = rs.getString("productName");
                    double price = Double.parseDouble(rs.getString("price"));
                    int discount = Integer.parseInt(rs.getString("discount"));
                    String description = rs.getString("description");
                    String productImage = rs.getString("productImage");
                    String createDate = rs.getString("createDate");
                    int productQuantity = Integer.parseInt(rs.getString("productQuantity"));
                    String availableStatus = rs.getString("availableStatus");
                    String conditionStatus = rs.getString("conditionStatus");
                    
                    productList.add(new ProductDTO(productID, categoryID, productName, price, discount, description, productImage, createDate, productQuantity, availableStatus, conditionStatus));
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return productList;
    }
    
    public ProductDTO getProductById(String id) throws SQLException {
        ProductDTO product = new ProductDTO();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * "
                            + "FROM tblProducts "
                            + "WHERE productID=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    int categoryID = Integer.parseInt(rs.getString("categoryID"));
                    String productName = rs.getString("productName");
                    double price = Double.parseDouble(rs.getString("price"));
                    int discount = Integer.parseInt(rs.getString("discount"));
                    String description = rs.getString("description");
                    String productImage = rs.getString("productImage");
                    String createDate = rs.getString("createDate");
                    int productQuantity = Integer.parseInt(rs.getString("productQuantity"));
                    String availableStatus = rs.getString("availableStatus");
                    String conditionStatus = rs.getString("conditionStatus");
                    
                    product = new ProductDTO(id, categoryID, productName, price, discount, description, productImage, createDate, productQuantity, availableStatus, conditionStatus);
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return product;
    }
    
    public boolean insertProduct(ProductDTO product) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        
        try {
            conn = DBUtils.getConnection();
            
            if (conn != null) {
                String productID = product.getProductID();
                int categoryID = product.getCategoryID();
                String productName = product.getProductName();
                double price = product.getPrice();
                int discount = product.getDiscount();
                String description = product.getDescription();
                String productImage = product.getProductImage();
                String createDate = product.getCreateDate();
                int quantity = product.getProductQuantity();
                String available = product.getAvailableStatus();
                String condition = product.getConditionStatus();
                
                String sql = "INSERT INTO tblProducts(productID, categoryID, productName, price, discount, description, productImage, createDate, productQuantity, availableStatus, conditionStatus) "
                            + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                
                stm = conn.prepareStatement(sql);
                stm.setString(1, productID);
                stm.setInt(2, categoryID);
                stm.setString(3, productName);
                stm.setDouble(4, price);
                stm.setInt(5, discount);
                stm.setString(6, description);
                stm.setString(7, productImage);
                stm.setString(8, createDate);
                stm.setInt(9, quantity);
                stm.setString(10, available);
                stm.setString(11, condition);
                
                check = stm.executeUpdate() > 0;
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    public String getCategoryName(int categoryID) throws SQLException {
        String categoryName = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT categoryName "
                            + " FROM tblCategory "
                            + " WHERE categoryID = ?";
                stm = conn.prepareStatement(sql);
                stm.setInt(1, categoryID);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    categoryName = rs.getString("categoryName");
                }
                
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return categoryName;
    } 
    
    public List<Category> getAllCategoryName() throws SQLException {
        List<Category> categoryList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            String categoryName = null;
            int categoryID = 0;
            String categoryImage = null;
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT categoryID, categoryName "
                            + "FROM tblCategory ";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    categoryID = Integer.parseInt(rs.getString("categoryID"));
                    categoryName = rs.getString("categoryName");
                    
                    Category category = new Category(categoryID, categoryName, "");
                    categoryList.add(category);
                }
               
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return categoryList;
    }
    
    public boolean checkDuplicateProduct(String productID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT productID "
                            + " FROM tblproducts "
                            + " WHERE productID=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, productID);
                
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    check = true;
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return check;
    }
    
    public boolean updateProduct(ProductDTO product) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        
        try {
            conn = DBUtils.getConnection();
            
            if (conn != null) {
                String productID = product.getProductID();
                int categoryID = product.getCategoryID();
                String productName = product.getProductName();
                double price = product.getPrice();
                int discount = product.getDiscount();
                String description = product.getDescription();
                String productImage = product.getProductImage();
                String createDate = product.getCreateDate();
                int quantity = product.getProductQuantity();
                String available = product.getAvailableStatus();
                String condition = product.getConditionStatus();
                
                String sql = "UPDATE tblProducts "
                            + " SET categoryID=?, productName=?, price=?, discount=?, description=?, productImage=?, createDate=?, productQuantity=?, availableStatus=?, conditionStatus=? "
                            + " WHERE productID=?";
                
                stm = conn.prepareStatement(sql);
                
                
                stm.setInt(1, categoryID);
                stm.setString(2, productName);
                stm.setDouble(3, price);
                stm.setInt(4, discount);
                stm.setString(5, description);
                stm.setString(6, productImage);
                stm.setString(7, createDate);
                stm.setInt(8, quantity);
                stm.setString(9, available);
                stm.setString(10, condition);
                stm.setString(11, productID);
                
                check = stm.executeUpdate() > 0;
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return check;
    }
    
    public boolean deleteProduct(String productId) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        
        try {
            conn = DBUtils.getConnection();
            
            if (conn != null) {
                String sql = "DELETE tblProducts WHERE productID=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, productId);
                
                check = stm.executeUpdate() > 0;
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return check;
    }
    
    public ProductDTO getDetailProduct(String productID) throws SQLException {
        ProductDTO product = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            
            if (conn != null) {
                String sql = "SELECT categoryID, productName, price, discount, description, productImage, availableStatus "
                            + " FROM  tblProducts "
                            + " WHERE productID=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, productID);
                
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    int categoryID = Integer.parseInt(rs.getString("categoryID"));
                    String productName = rs.getString("productName");
                    double price = Double.parseDouble(rs.getString("price"));
                    int discount = Integer.parseInt(rs.getString("discount"));
                    String description = rs.getString("description");
                    String productImage = rs.getString("productImage");
                    String availableStatus = rs.getString("availableStatus");
                    
                    product = new ProductDTO(productID, categoryID, productName, price, discount, description, productImage, "", 0, availableStatus, "");
                    
                }
                
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return product;
    }
  
    public static void main(String[] args) throws SQLException {
//        ProductDAO dao = new ProductDAO();
//        List<Category> productList = dao.getAllCategoryName();
//        
//        for (Category productDTO : productList) {
//            System.out.println(productDTO.getName());
//        }
    }
}
