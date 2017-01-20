<%-- 
    Document   : insererDoc
    Created on : 27 oct. 2016, 10:01:10
    Author     : itu
--%>

<%@page import="fonction.InsertDAO"%>
<%@page import="fonction.VerifieInsc"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="connexion.Connect"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>Hopital</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>

        <script src="lib/jQuery-Knob/js/jquery.knob.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function() {
            $(".knob").knob();
        });
    </script>


    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/premium.css">

</head>
<body class=" theme-blue">
    <jsp:useBean id="obj" class="pers.Docteur"/>
    <jsp:useBean id="obj1" class="pers.Specialisation"/>
        <jsp:setProperty property="*" name="obj"/>
        <%
            String cont = request.getParameter("CONTACT");
            String nom = request.getParameter("NOMDOC");
            String spe = request.getParameter("SPECIAL");
            String speDoc = request.getParameter("SPEDOC");
            if(spe!=null)
            {
               InsertDAO.insert(spe);
            }
            if(nom!=null)
            {
               out.println(VerifieInsc.insert(obj,cont,speDoc));
               
            }
        %>

    <!-- Demo page code -->

    <script type="text/javascript">
        $(function() {
            var match = document.cookie.match(new RegExp('color=([^;]+)'));
            if(match) var color = match[1];
            if(color) {
                $('body').removeClass(function (index, css) {
                    return (css.match (/\btheme-\S+/g) || []).join(' ')
                })
                $('body').addClass('theme-' + color);
            }

            $('[data-popover="true"]').popover({html: true});
            
        });
    </script>
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { 
            color: #fff;
        }
    </style>

    <script type="text/javascript">
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
    </script>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
   
  <!--<![endif]-->

    <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="" href="index.jsp"><span class="navbar-brand"> Hopital</span></a></div>

         <div class="navbar-collapse collapse" style="height: 1px;">
          <ul id="main-menu" class="nav navbar-nav navbar-right">
            <li class="dropdown hidden-xs">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    
                </a>

              
            </li>
          </ul>

        </div>
      </div>
    

    <div class="sidebar-nav">
    <ul>
    <li><a href="Accueil.html" data-target=".dashboard-menu" class="nav-header" data-toggle="collapse"> Accueil<i ></i></a></li>
   

    <li data-popover="true" rel="popover" data-placement="right"><a href="insererDoc.jsp" data-target=".premium-menu" class="nav-header collapsed" data-toggle="collapse"> Insertion<i ></i></a></li>
<li data-popover="true" rel="popover" data-placement="right"><a href="insererPat.jsp" data-target=".premium-menu" class="nav-header collapsed" data-toggle="collapse"> Insertion Patient<i ></i></a></li>
        <li><a href="liste.jsp" data-target=".accounts-menu" class="nav-header collapsed" data-toggle="collapse"> Gestion Docteur </a></li>


        <li><a href="listeP.jsp" data-target=".legal-menu" class="nav-header collapsed" data-toggle="collapse"> Gestion Patient<i ></i></a></li>
    

        <li><a href="help.html" class="nav-header"> Gestion Medicament</a></li>
         
    </div>
  
  <div class="content">
        <div class="header">
            
            <h1 class="page-title">Insertion</h1>
                   

        </div>
        <div class="main-content">
            
<ul class="nav nav-tabs">
  <li class="active"><a href="#home" data-toggle="tab">Docteur</a></li>
  <li><a href="#profile" data-toggle="tab">Specialisation</a></li>
</ul>

<div class="row">
  <div class="col-md-4">
    <br>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
      <form id="tab" action="#" method="GET">
        <div class="form-group">
        <label>Nom</label>
        <input type="text" class="form-control" name="NOMDOC">
        </div>
        <div class="form-group">
        <label>Prenom</label>
        <input type="text" class="form-control" name="PRENOMDOC">
        </div>
        <div class="form-group">
        <label>Date de naissance</label>
        <input type="date" class="form-control">
        </div>
        <div class="form-group">
        <label>Contact</label>
        <input type="text" class="form-control" name="CONTACT">
        </div>
        <div class="form-group">
        
        </div>

        <div class="form-group">
          
        </div>

        <div class="form-group">
            <label>Specialisation</label>
            <select name="SPEDOC" id="DropDownTimezone" class="form-control">
              <%
                  Connection conn;
                  conn = Connect.getCon();
              
              try
              {
                Statement stm = conn.createStatement ();
                ResultSet rs = stm.executeQuery("Select special From Specialisation");
                
                while(rs.next())
                {
                    %>
                    <option><%=rs.getString(1)%></option>
                    <%
                }
               }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                %>
            </select>
          </div>
          <div class="btn-toolbar list-toolbar">
      <button class="btn btn-primary"><i class="fa fa-save"></i> Enregistrer</button>

    </div>
        </form>
      </div>

      <div class="tab-pane fade" id="profile">

          
          
        <form id="tab2" action="#" metho="get">
          <div class="form-group">
            <label>Nouvelle specialite</label>
            <input type="text" class="form-control" name="SPECIAL">
             <button class="btn btn-primary"><i class="fa fa-save"></i> Enregistrer</button>
          </div>
          <div>
              
          </div>
        </form>
      </div>
    </div>

    
  </div>
</div>


            <footer>
                <hr>

                <!-- Purchase a site license to remove this link from the footer: http://www.portnine.com/bootstrap-themes -->
                
                <p>© 2016 </p>
            </footer>
        </div>
    </div>
  
  <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  
</body></html>
