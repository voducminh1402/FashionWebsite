<%-- 
    Document   : Menu
    Created on : Sep 1, 2021, 7:53:01 PM
    Author     : VODUCMINH
--%>

<%@page import="fashionweb.shopping.Cart"%>
<%@page import="fashionweb.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <% 
        UserDTO user = (UserDTO) session.getAttribute("LOGIN_USER");
        boolean checkNull = true;
        if (user != null) {
            String search = (String) request.getParameter("search");
            checkNull = false;
            if (!"US".equals(user.getRoleID())) {
                response.sendRedirect("login.html");
                return;
            }
        }
    %>
    
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Offcanvas Menu Begin -->
    <div class="offcanvas-menu-overlay"></div>
    <div class="offcanvas-menu-wrapper">
        <div class="offcanvas__close">+</div>
        <ul class="offcanvas__widget">
            <li><span class="icon_search search-switch"></span></li>
            <li><a href="#"><span class="icon_heart_alt"></span>
                <div class="tip">2</div>
            </a></li>
            <li><a href="shop-cart.jsp"><span class="icon_bag_alt"></span>
                    <%
                        Cart cart = (Cart) session.getAttribute("CART");
                        int cartSize;
                        if (cart != null) {
                            cartSize = cart.getCart().size();
                    %>
                        <div class="tip"><%= cart.getCart().size() %></div>
                    <%
                        }
                        else {
                    %>
                        <div class="tip">0</div>
                    <%
                        }
                    %>
            </a></li>
        </ul>
        <div class="offcanvas__logo">
            <a href="./index.jsp"><img src="img/logo.png" alt=""></a>
        </div>
        <div id="mobile-menu-wrap"></div>
        <div class="offcanvas__auth">
            <a href="MainController">Logout</a>
        </div>
    </div>
    <!-- Offcanvas Menu End -->

    <!-- Header Section Begin -->
    <header class="header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-3 col-lg-2">
                    <div class="header__logo">
                        <a href="./index.jsp"><img src="img/logo.png" alt=""></a>
                    </div>
                </div>
                <div class="col-xl-6 col-lg-7">
                    <nav class="header__menu">
                        <ul>
                            <li class="active"><a href="./index.jsp">Home</a></li>
                            <li><a href="#">Women’s</a></li>
                            <li><a href="#">Men’s</a></li>
                            <li><a href="MainController?action=Get Product">Shop</a></li>
                            <li><a href="#">Pages</a>
                                <ul class="dropdown">
                                    <li><a href="./shop-cart.jsp">Shop Cart</a></li>
                                    <li><a href="./checkout.jsp">Checkout</a></li>
                                    <li><a href="./blog-details.jsp">Blog Details</a></li>
                                </ul>
                            </li>
                            <li><a href="./blog.jsp">Blog</a></li>
                            <li><a href="./contact.jsp">Contact</a></li>
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <div class="header__right">
                        <div class="header__right__auth">
                            <%
                                if (checkNull == false) {
                            %>  
                                <a>Hello <%= user.getFullName() %></a>
                                <form class="inline-form" action="MainController" method="POST">
                                    <button type="submit" name="action" value="Logout"><a>Logout</a></button>
                                </form>
                            <%
                                }
                                else{
                            %>
                                <a href="login.html">Login</a>
                            <%
                                } 
                            %>    
                        </div>
                        <ul class="header__right__widget">
                            <li><span class="icon_search search-switch"></span></li>
                            <li><a href="#"><span class="icon_heart_alt"></span>
                                <div class="tip">2</div>
                            </a></li>
                            <li><a href="shop-cart.jsp"><span class="icon_bag_alt"></span>
                                
                                <%
                                    if (cart != null) {
                                %>        
                                    <div class="tip"><%= cart.getCart().size() %></div>
                                <%
                                    }
                                    else {
                                %>
                                    <div class="tip">0</div>
                                <%
                                    }
                                %>
                            </a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="canvas__open">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </header>
    <!-- Header Section End -->
    
    <!-- Search Begin -->
    <div class="search-model">
        <div class="h-100 d-flex align-items-center justify-content-center">
            <div class="search-close-switch">+</div>
            <form class="search-model-form" action="MainController">
                <input type="text" id="search-input" placeholder="Search here....." name="search">
                <button class="search-button" type="submit" name="action" value="Search Product">Search</button>
            </form>
        </div>
    </div>
    <!-- Search End -->