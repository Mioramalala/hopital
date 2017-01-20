package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\"><head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/bootstrap/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/font-awesome/css/font-awesome.css\">\n");
      out.write("\n");
      out.write("    <script src=\"lib/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/premium.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\" theme-blue\">\n");
      out.write("\n");
      out.write("    <!-- Demo page code -->\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            var match = document.cookie.match(new RegExp('color=([^;]+)'));\n");
      out.write("            if(match) var color = match[1];\n");
      out.write("            if(color) {\n");
      out.write("                $('body').removeClass(function (index, css) {\n");
      out.write("                    return (css.match (/\\btheme-\\S+/g) || []).join(' ')\n");
      out.write("                })\n");
      out.write("                $('body').addClass('theme-' + color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $('[data-popover=\"true\"]').popover({html: true});\n");
      out.write("            \n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        #line-chart {\n");
      out.write("            height:300px;\n");
      out.write("            width:800px;\n");
      out.write("            margin: 0px auto;\n");
      out.write("            margin-top: 1em;\n");
      out.write("        }\n");
      out.write("        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { \n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            var uls = $('.sidebar-nav > ul > *').clone();\n");
      out.write("            uls.addClass('visible-xs');\n");
      out.write("            $('#main-menu').append(uls.clone());\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Le fav and touch icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../assets/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"../assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!--[if lt IE 7 ]> <body class=\"ie ie6\"> <![endif]-->\n");
      out.write("  <!--[if IE 7 ]> <body class=\"ie ie7 \"> <![endif]-->\n");
      out.write("  <!--[if IE 8 ]> <body class=\"ie ie8 \"> <![endif]-->\n");
      out.write("  <!--[if IE 9 ]> <body class=\"ie ie9 \"> <![endif]-->\n");
      out.write("  <!--[if (gt IE 9)|!(IE)]><!--> \n");
      out.write("   \n");
      out.write("  <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <div class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <a class=\"\" href=\"index.html\"><span class=\"navbar-brand\"><span class=\"fa fa-paper-plane\"></span> Hopital</span></a></div>\n");
      out.write("\n");
      out.write("        <div class=\"navbar-collapse collapse\" style=\"height: 1px;\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"dialog\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <p class=\"panel-heading no-collapse\">Sign In</p>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Nom</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control span12\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label>Mot de passe</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control span12\">\n");
      out.write("                </div>\n");
      out.write("                <a href=\"index.html\" class=\"btn btn-primary pull-right\">Se connecter</a>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"pull-right\" style=\"\"><a href=\"http://www.portnine.com\" target=\"blank\" style=\"font-size: .75em; margin-top: .25em;\">Design by Portnine</a></p>\n");
      out.write("    <p><a href=\"inscription.jsp\">Vous n'etes pas encore inscrit?</a></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"lib/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(\"[rel=tooltip]\").tooltip();\n");
      out.write("        $(function() {\n");
      out.write("            $('.demo-cancel-click').click(function(){return false;});\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("</body></html>\n");
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
