/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionweb.controller;

import fashionweb.product.ProductDAO;
import fashionweb.product.ProductDTO;
import fashionweb.shopping.Cart;
import fashionweb.shopping.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VODUCMINH
 */
public class AddToCartController extends HttpServlet {
    private static final String ERROR = "error.jsp";
    private static final String SUCCESS = "shop.jsp";
    private static final String SEARCH_PAGE = "search.jsp";
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String url = ERROR;
        try {
            String id = request.getParameter("id");
            ProductDAO dao = new ProductDAO();
            ProductDTO getProduct = dao.getProductById(id);

            String productID = id;
            String productName = getProduct.getProductName();
            String productImage = getProduct.getProductImage();
            Double productPrice = getProduct.getPrice();
            int quantity = 1;
            
            Product product = new Product(productID, productName, productImage, productPrice, quantity);
            
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("CART");

            if (cart == null) {
                cart = new Cart();
            }
            cart.addToCart(product);
            session.setAttribute("CART", cart);
            url = SUCCESS;
        } 
        catch (Exception e) {
            log("Error at AddToCartController: " + e.toString());
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

    private void log(Double productPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
