package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import autre.Supprime;
import fonction.*;

public final class liste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Hopital</title>\n");
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
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/premium.css\">\n");
      out.write("    <script src=\"angular.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\" theme-blue\">\n");
      out.write("\n");
      out.write("     ");

    Modifier mod=new Modifier();
    String nom=request.getParameter("name");
    String prenom=request.getParameter("prenom");
    String id=request.getParameter("iddoc");
    String cont = request.getParameter("contact");
    Supprime sup = new Supprime();
    String ids = request.getParameter("iddocs");
        try
        {
            
            sup.supprDocteur(ids);
        }
        catch(Exception e)
        {

        }
        try
        {
            
            mod.modifie(nom,prenom,id,cont);
        }
        catch(Exception e)
        {

        }
        
    
    
    

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
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"\" href=\"index.html\"><span class=\"navbar-brand\"> Hopital</span></a></div>\n");
      out.write("\n");
      out.write("         <div class=\"navbar-collapse collapse\" style=\"height: 1px;\">\n");
      out.write("          <ul id=\"main-menu\" class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li class=\"dropdown hidden-xs\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                    \n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("              \n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"sidebar-nav\">\n");
      out.write("    <ul>\n");
      out.write("    <li><a href=\"Accueil.html\" data-target=\".dashboard-menu\" class=\"nav-header\" data-toggle=\"collapse\"> Accueil<i ></i></a></li>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <li data-popover=\"true\" rel=\"popover\" data-placement=\"right\"><a href=\"insererDoc.jsp\" data-target=\".premium-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"> Insertion<i ></i></a></li>\n");
      out.write("\n");
      out.write("        <li><a href=\"liste.jsp\" data-target=\".accounts-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"> Gestion Docteur </a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <li><a href=\"listeP.jsp\" data-target=\".legal-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"> Gestion Patient<i ></i></a></li>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <li><a href=\"help.html\" class=\"nav-header\"> Gestion Medicament</a></li>\n");
      out.write("         \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div  ng-app=\"myApp\" ng-controller=\"customersCtrl\">\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("              \n");
      out.write("            <div class=\"faq-content\">\n");
      out.write("                \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-9 col-md-9\">\n");
      out.write("            <div class=\"search-well\">\n");
      out.write("                <form class=\"form-inline\" style=\"margin-top:0px;\">\n");
      out.write("                    <input class=\"input-xlarge form-control\" placeholder=\"Nom\" id=\"appendedInputButton\" type=\"text\" ng-model=\"test.nom\">\n");
      out.write("                    <input class=\"input-xlarge form-control\" placeholder=\"Prenom\" id=\"appendedInputButton\" type=\"text\" ng-model=\"test.prenom\">\n");
      out.write("                    <input class=\"input-xlarge form-control\" placeholder=\"date de naissance\" id=\"appendedInputButton\" type=\"text\" ng-model=\"test.naissance\">\n");
      out.write("                </form>   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("             </div>\n");
      out.write("            <h1>Liste Docteurs</h1>\n");
      out.write("<table class=\"table\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>IdPersonne</th>\n");
      out.write("      <th>Nom</th>\n");
      out.write("      <th>Prenom</th>\n");
      out.write("      <th>Date de naissance</th>\n");
      out.write("      <th>Specialisation</th>\n");
      out.write("      <th>Contact</th>\n");
      out.write("      <th>Modifier</th>\n");
      out.write("      <th>Supprimer</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr ng-repeat=\"x in names | filter:test\">\n");
      out.write("        <td>{{ x.id  }}</td>\n");
      out.write("        <td>{{ x.nom }}</td>\n");
      out.write("        <td>{{ x.prenom }}</td>\n");
      out.write("        <td>{{ x.naissance }}</td>\n");
      out.write("        <td>{{ x.specialisation }}</td>\n");
      out.write("        <td>{{ x.contact }}</td>\n");
      out.write("        <td><a href=\"Modification.jsp?iddoc={{ x.id  }}&&nom={{ x.nom }}&&prenom={{ x.prenom }}&&contact={{ x.contact }}\">Modifier</a></td>\n");
      out.write("        \n");
      out.write("                <td><a href=\"Supprimer.jsp?iddoc={{ x.id  }}\">Supprimer</a></td>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("        </div>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("             <footer>\n");
      out.write("                <hr>\n");
      out.write("                <p>© 2016 </p>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("<script>\n");
      out.write("var app = angular.module('myApp', []);\n");
      out.write("app.controller('customersCtrl', function($scope, $http) {\n");
      out.write("    $http.get(\"http://localhost:8084/Hopital/selectD.jsp\").then(function (response) {$scope.names = response.data;\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
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
