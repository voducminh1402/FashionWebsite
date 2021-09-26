package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import fashionweb.shopping.Product;
import fashionweb.product.ProductDTO;
import fashionweb.shopping.Cart;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"Ashion Template\">\n");
      out.write("    <meta name=\"keywords\" content=\"Ashion, unica, creative, html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Ashion | Template</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Cookie&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;800;900&display=swap\"\n");
      out.write("    rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Breadcrumb Begin -->\n");
      out.write("    <div class=\"breadcrumb-option\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"breadcrumb__links\">\n");
      out.write("                        <a href=\"./index.jsp\"><i class=\"fa fa-home\"></i> Home</a>\n");
      out.write("                        <span>Checkout</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Breadcrumb End -->\n");
      out.write("\n");
      out.write("    <!-- Checkout Section Begin -->\n");
      out.write("    <section class=\"checkout spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h6 class=\"coupon__link\"><span class=\"icon_tag_alt\"></span> <a href=\"#\">Have a coupon?</a> Click\n");
      out.write("                    here to enter your code.</h6>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"MainController\" class=\"checkout__form\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <h5>Billing detail</h5>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>First Name <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Last Name <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Country <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Address <span>*</span></p>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Street Address\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Apartment. suite, unite ect ( optinal )\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Town/City <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Country/State <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Postcode/Zip <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Phone <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6 col-md-6 col-sm-6\">\n");
      out.write("                                <div class=\"checkout__form__input\">\n");
      out.write("                                    <p>Email <span>*</span></p>\n");
      out.write("                                    <input type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"checkout__form__checkbox\">\n");
      out.write("                                    <label for=\"acc\">\n");
      out.write("                                        Create an acount?\n");
      out.write("                                        <input type=\"checkbox\" id=\"acc\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <p>Create am acount by entering the information below. If you are a returing\n");
      out.write("                                        customer login at the <br />top of the page</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__form__input\">\n");
      out.write("                                        <p>Account Password <span>*</span></p>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__form__checkbox\">\n");
      out.write("                                        <label for=\"note\">\n");
      out.write("                                            Note about your order, e.g, special noe for delivery\n");
      out.write("                                            <input type=\"checkbox\" id=\"note\">\n");
      out.write("                                            <span class=\"checkmark\"></span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__form__input\">\n");
      out.write("                                        <p>Oder notes <span>*</span></p>\n");
      out.write("                                        <input type=\"text\"\n");
      out.write("                                        placeholder=\"Note about your order, e.g, special noe for delivery\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4\">\n");
      out.write("                            <div class=\"checkout__order\">\n");
      out.write("                                <h5>Your order</h5>\n");
      out.write("                                <div class=\"checkout__order__product\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>\n");
      out.write("                                            <span class=\"top__text\">Product</span>\n");
      out.write("                                            <span class=\"top__text__right\">Total</span>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            Cart cart = (Cart) session.getAttribute("CART");
                                            int count = 1;
                                            double totalMoney = 0;
                                            
                                            if (cart != null) {
                                                if (cart.getCart().size() == 0){
                                        
      out.write("\n");
      out.write("                                                <li style=\"text-align: center\">No product in cart!</li>\n");
      out.write("                                        ");

                                                }
                                                else {
                                                    for(Product product : cart.getCart().values()) {
                                                    totalMoney += product.getProductPrice();
                                        
      out.write("\n");
      out.write("                                        <li>");
      out.print( new DecimalFormat("00").format(count++) );
      out.write(".&nbsp");
      out.print( product.getProductName() );
      out.write("<span>$ ");
      out.print( product.getProductPrice() );
      out.write("</span></li>\n");
      out.write("                                        ");

                                                }
                                                }
                                            }        
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                       </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__order__total\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li>Total <span>$");
      out.print( totalMoney );
      out.write("</span></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"checkout__order__widget\">\n");
      out.write("                                    <label for=\"o-acc\">\n");
      out.write("                                        Create an acount?\n");
      out.write("                                        <input type=\"checkbox\" id=\"o-acc\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <p>Create am acount by entering the information below. If you are a returing customer\n");
      out.write("                                    login at the top of the page.</p>\n");
      out.write("                                    <label for=\"check-payment\">\n");
      out.write("                                        Cheque payment\n");
      out.write("                                        <input type=\"checkbox\" id=\"check-payment\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label for=\"paypal\">\n");
      out.write("                                        PayPal\n");
      out.write("                                        <input type=\"checkbox\" id=\"paypal\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    if (cart != null && cart.getCart().size() == 0) {
                                
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"site-btn product-add-btn-disabled\" name=\"action\" value=\"Checkout Confirm\">Place order</button>\n");
      out.write("                                ");

                                    }
                                    else {
                                
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\" name=\"action\" value=\"Checkout Confirm\">Place order</button>    \n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Checkout Section End -->\n");
      out.write("\n");
      out.write("        <!-- Instagram Begin -->\n");
      out.write("        <div class=\"instagram\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-2 col-md-4 col-sm-4 p-0\">\n");
      out.write("                        <div class=\"instagram__item set-bg\" data-setbg=\"img/instagram/insta-1.jpg\">\n");
      out.write("                            <div class=\"instagram__text\">\n");
      out.write("                                <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                <a href=\"#\">@ ashion_shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-4 col-sm-4 p-0\">\n");
      out.write("                        <div class=\"instagram__item set-bg\" data-setbg=\"img/instagram/insta-2.jpg\">\n");
      out.write("                            <div class=\"instagram__text\">\n");
      out.write("                                <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                <a href=\"#\">@ ashion_shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-4 col-sm-4 p-0\">\n");
      out.write("                        <div class=\"instagram__item set-bg\" data-setbg=\"img/instagram/insta-3.jpg\">\n");
      out.write("                            <div class=\"instagram__text\">\n");
      out.write("                                <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                <a href=\"#\">@ ashion_shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-4 col-sm-4 p-0\">\n");
      out.write("                        <div class=\"instagram__item set-bg\" data-setbg=\"img/instagram/insta-4.jpg\">\n");
      out.write("                            <div class=\"instagram__text\">\n");
      out.write("                                <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                <a href=\"#\">@ ashion_shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-4 col-sm-4 p-0\">\n");
      out.write("                        <div class=\"instagram__item set-bg\" data-setbg=\"img/instagram/insta-5.jpg\">\n");
      out.write("                            <div class=\"instagram__text\">\n");
      out.write("                                <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                <a href=\"#\">@ ashion_shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-4 col-sm-4 p-0\">\n");
      out.write("                        <div class=\"instagram__item set-bg\" data-setbg=\"img/instagram/insta-6.jpg\">\n");
      out.write("                            <div class=\"instagram__text\">\n");
      out.write("                                <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                <a href=\"#\">@ ashion_shop</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Instagram End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Begin -->\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-7\">\n");
      out.write("                        <div class=\"footer__about\">\n");
      out.write("                            <div class=\"footer__logo\">\n");
      out.write("                                <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt\n");
      out.write("                            cilisis.</p>\n");
      out.write("                            <div class=\"footer__payment\">\n");
      out.write("                                <a href=\"#\"><img src=\"img/payment/payment-1.png\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/payment/payment-2.png\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/payment/payment-3.png\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/payment/payment-4.png\" alt=\"\"></a>\n");
      out.write("                                <a href=\"#\"><img src=\"img/payment/payment-5.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-5\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Quick links</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">About</a></li>\n");
      out.write("                                <li><a href=\"#\">Blogs</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact</a></li>\n");
      out.write("                                <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-sm-4\">\n");
      out.write("                        <div class=\"footer__widget\">\n");
      out.write("                            <h6>Account</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">My Account</a></li>\n");
      out.write("                                <li><a href=\"#\">Orders Tracking</a></li>\n");
      out.write("                                <li><a href=\"#\">Checkout</a></li>\n");
      out.write("                                <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-8 col-sm-8\">\n");
      out.write("                        <div class=\"footer__newslatter\">\n");
      out.write("                            <h6>NEWSLETTER</h6>\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Email\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">Subscribe</button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"footer__social\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                        <div class=\"footer__copyright__text\">\n");
      out.write("                            <p>Copyright &copy; <script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("        <!-- Js Plugins -->\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.countdown.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
