<%-- 
    Document   : liste
    Created on : 10 nov. 2016, 09:40:28
    Author     : itu
--%>

<%@page import="autre.Supprime"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="fonction.*"%>
<!DOCTYPE html>
<html lang="en">
    <head>
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
    
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/premium.css">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

</head>
<body class=" theme-blue">

     
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
          <a class="" href="index.html"><span class="navbar-brand"> Hopital</span></a></div>

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


        <li><a href="#" data-target=".legal-menu" class="nav-header collapsed" data-toggle="collapse"> Gestion Patient<i ></i></a></li>
    

        <li><a href="help.html" class="nav-header"> Gestion Medicament</a></li>
         
    </div>

    <div class="content">
        <div  ng-app="myApp" ng-controller="customersCtrl">
        <div class="main-content">
              
            <div class="faq-content">
                
    <div class="row">
        <div class="col-sm-9 col-md-9">
            <div class="search-well">
                <form class="form-inline" style="margin-top:0px;">
                    <input class="input-xlarge form-control" placeholder="Nom" id="appendedInputButton" type="text" ng-model="test.nom">
                    <input class="input-xlarge form-control" placeholder="Prenom" id="appendedInputButton" type="text" ng-model="test.prenom">
                    <input class="input-xlarge form-control" placeholder="date de naissance" id="appendedInputButton" type="text" ng-model="test.naissance">
                </form>   
                
                
            </div>
        </div>
        
    </div>
</div>
             </div>
            <h1>Liste Patients</h1>
<table class="table">
  <thead>
    <tr>
      <th>IdPersonne</th>
      <th>Nom</th>
      <th>Prenom</th>
      <th>Date de naissance</th>
      <th>Profession</th>
    </tr>
  </thead>
  <tbody>
    <tr ng-repeat="x in names | filter:test">
        <td>{{ x.id  }}</td>
        <td>{{ x.nom }}</td>
        <td>{{ x.prenom }}</td>
        <td>{{ x.naissance }}</td>
        <td>{{ x.profession }}</td>
        
    </tr>
  </tbody>
</table>
        </div>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
             <footer>
                <hr>
                <p>© 2016 </p>
            </footer>
        </div>



    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("http://localhost:8084/Hopital/selectP.jsp").then(function (response) {$scope.names = response.data;
    });
});
</script>
