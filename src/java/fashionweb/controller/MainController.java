/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VODUCMINH
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {
    private static final String ERROR = "error.jsp";
    private static final String LOGIN = "LoginController";
    private static final String LOGOUT = "LogoutController";
    private static final String SEARCH_PRODUCT = "SearchProductController";
    private static final String GET_PRODUCT = "GetProductController";
    private static final String ADD_TO_CART = "AddToCartController";
    private static final String UPDATE_CART = "UpdateCartController";
    private static final String REMOVE_CART = "RemoveCartController";
    private static final String ADD_USER = "AddUserController";
    private static final String EDIT_USER = "EditUserController";
    private static final String DELETE_USER = "DeleteUserController";
    private static final String ADD_PRODUCT = "AddProductController";
    private static final String EDIT_PRODUCT = "EditProductController";
    private static final String DELETE_PRODUCT = "DeleteProductController";
    private static final String DETAIL_PRODUCT = "DetailProductController";
    private static final String CHECKOUT_CONFIRM = "CheckoutConfirmController";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");
            if ("Login".equals(action)) {
                url = LOGIN;
            }
            else if ("Logout".equals(action)) {
                url = LOGOUT;
            }
            else if ("Search Product".equals(action)) {
                url = SEARCH_PRODUCT;
            }
            else if ("Get Product".equals(action)) {
                url = GET_PRODUCT;
            }
            else if ("Add To Cart".equals(action)) {
                url = ADD_TO_CART;
            }
            else if ("Modify Cart".equals(action)) {
                url = UPDATE_CART;
            }
            else if ("Remove Cart".equals(action)) {
                url = REMOVE_CART;
            }
            else if ("Add User".equals(action)) {
                url = ADD_USER;
            }
            else if ("Edit User".equals(action)) {
                url = EDIT_USER;
            }
            else if ("Delete User".equals(action)) {
                url = DELETE_USER;
            }
            else if ("Add Product".equals(action)) {
                url = ADD_PRODUCT;
            }
            else if ("Edit Product".equals(action)) {
                url = EDIT_PRODUCT;
            }
            else if ("Delete Product".equals(action)) {
                url = DELETE_PRODUCT;
            }
            else if ("Detail Product".equals(action)) {
                url = DETAIL_PRODUCT;
            }
            else if ("Checkout Confirm".equals(action)) {
                url = CHECKOUT_CONFIRM;
            }
            else {
                HttpSession session = request.getSession();
                session.setAttribute("ERROR_MESSAGE", "Function is not available!");
            }
        } 
        catch (Exception e) {
            log("Error at MainController: " + e.toString());
        }
        finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
