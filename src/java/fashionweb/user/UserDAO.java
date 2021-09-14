/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionweb.user;

import fashionweb.utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VODUCMINH
 */
public class UserDAO {
    public UserDTO checkLogin(String userID, String password) throws SQLException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * "
                            + " FROM tblUsers "
                            + " WHERE userID=? AND password=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String roleID = rs.getString("roleID");
                    String fullName = rs.getString("fullName");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String createDate = rs.getString("createDate");
                    int getStatus = Integer.parseInt(rs.getString("status"));
                    boolean status = false;
                    if (getStatus == 1) {
                        status = true;
                    }
                    else if (getStatus == 0) {
                        status = false;
                    }
                    
                    user = new UserDTO(userID, roleID, fullName, phoneNumber, address, email, password, createDate, status);
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
        return user;
    }
    
    public List<UserDTO> getAllUser() throws SQLException {
        List<UserDTO> listUser = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT * FROM tblUsers";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String userID = rs.getString("userID");
                    String roleID = rs.getString("roleID");
                    String fullName = rs.getString("fullName");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String password = "1";
                    String createDate = rs.getString("createDate");
                    int getStatus = Integer.parseInt(rs.getString("status"));
                    boolean status = false;
                    if (getStatus == 1) {
                        status = true;
                    }
                    else if (getStatus == 0) {
                        status = false;
                    }

                    UserDTO user = new UserDTO(userID, roleID, fullName, phoneNumber, address, email, password, createDate, status);
                    listUser.add(user);
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
        
        return listUser;
    }
    
    public boolean insertUser(UserDTO user) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
            
                String userID = user.getUserID();
                String roleID = user.getRoleID();
                String fullName = user.getFullName();
                String phoneNumber = user.getPhoneNumber();
                String address = user.getAddress();
                String email = user.getEmail();
                String password = user.getPassword();
                String createDate = user.getCreateDate();
                int status = 1;

                String sql = "INSERT INTO tblUsers(userID, roleID, fullName, phoneNumber, address, email, password, createDate, status) "
                            + "VALUES(?,?,?,?,?,?,?,?,?)";

                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                stm.setString(2, roleID);
                stm.setString(3, fullName);
                stm.setString(4, phoneNumber);
                stm.setString(5, address);
                stm.setString(6, email);
                stm.setString(7, password);
                stm.setString(8, createDate);
                stm.setInt(9, status);

                check = stm.executeUpdate() > 0;
            }
        } 
        catch (Exception e) {
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
    
    public boolean checkDuplicate(String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT userID "
                            + "FROM tblUsers "
                            + "WHERE userID=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                rs = stm.executeQuery();
                
                if (rs.next()) {
                    check = true;
                }
            }
        } catch (Exception e) {
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
    
    public boolean updateUser(UserDTO user) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblUsers "
                            + " SET roleID=?, fullName=?, phoneNumber=?, address=?, email=?, password=?, createDate=?, status=? "
                            + " WHERE userID=?";
                stm = conn.prepareStatement(sql);
                
                stm.setString(1, user.getRoleID());
                stm.setString(2, user.getFullName());
                stm.setString(3, user.getPhoneNumber());
                stm.setString(4, user.getAddress());
                stm.setString(5, user.getEmail());
                stm.setString(6, user.getPassword());
                stm.setString(7, user.getCreateDate());
                if (user.isStatus() == true) {
                    stm.setInt(8, 1);
                }
                else if (user.isStatus() == false) {
                    stm.setInt(8, 0);
                }
                stm.setString(9, user.getUserID());
                
                check = stm.executeUpdate() > 0;
                
            }
        }
        catch(Exception e) {
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
    
    public boolean deleteUser(String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        
        try {
            conn = DBUtils.getConnection();
             
            if (conn != null) {
                String sql = "DELETE tblUsers WHERE userID=?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                
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
    
}
    

