<%-- 
    Document   : insererDoc
    Created on : 27 oct. 2016, 10:01:10
    Author     : itu
--%>

<%@page import="java.util.Date"%>
<%@page import="facture.Facture"%>
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
            String refdoc = request.getParameter("refdoc");
            String refpat = request.getParameter("refpat");
            String dates = request.getParameter("dates");
            String temp = request.getParameter("temp");
            String tenH = request.getParameter("tenH");
            String tenB = request.getParameter("tenB");
            String poids = request.getParameter("poids");
            Date date = new Date();
            Facture fact = new Facture();
            Date demain = fact.additionJour(1);
            String refF = fact.getrefF();
            /*Facture fac = new Facture();
            if(dateEdit!="" && dateLivre!="" && dateLimite!="")
            {
                int status = fac.insert(nom,categorie,dateEdit,dateLivre,dateLimite);
            }*/
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
  <li class="active"><a href="#home" data-toggle="tab">Facture</a></li>
</ul>

<div class="row">
  <div class="col-md-4">
    <br>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
      
        <div class="form-group">
            <label>Reference du docteur</label>
            <label><%=refdoc%></label>
          </div>
        
        
        

        <div class="form-group">
            <label>Reference du Patient</label>
            <label><%=refpat%></label>
          </div>
            <div class="form-group">
        <label>Montant</label>
        <label>117 000</label>
        </div>
            <div class="form-group">
        <label>Date de Livraison</label>
        <label><%=date%></label>
        </div>
            <div class="form-group">
        <label>Date limite</label>
        <label><%=demain%></label>
        </div>
        </div>
            <div class="form-group">
        <label>Reference Facture</label>
        <label id="refFact"><%=refF%></label>
        </div>
          <div class="btn-toolbar list-toolbar">
              <button class="btn btn-primary" onclick="consulte()"><i class="fa fa-save"></i> Payer plutard</button>
      <button class="btn btn-primary" onclick="fact()"><i class="fa fa-save"></i> Acceder aux paiement</button>
<script type="text/javascript">
                                        function fact()
                                        {
                                            var refFact = document.getElementById('refFact').value;
                                            document.location.href="Paiement.jsp?refFact="+refFact;
                                        }
                                        function consulte()
                                        {
                                            //var refFact = document.getElementById('refFact').value;
                                            document.location.href="ChoisirPat.jsp";
                                        }
                                    </script>
    </div>
        
      </div>

      <div class="tab-pane fade" id="profile">

          
          
        
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
