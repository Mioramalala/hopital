<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="connexion.Connect"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html lang="en"><head>
        <meta charset="utf-8">
        <title>Login</title>
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

    </head>
    <body class=" theme-blue">
<script src="bootstrap.js"></script>
        <!-- Demo page code -->

        <script type="text/javascript">
            $(function () {
                var match = document.cookie.match(new RegExp('color=([^;]+)'));
                if (match)
                    var color = match[1];
                if (color) {
                    $('body').removeClass(function (index, css) {
                        return (css.match(/\btheme-\S+/g) || []).join(' ')
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
            $(function () {
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
<div id="ref">
        <div class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <a class="" href="index.html"><span class="navbar-brand"><span class="fa fa-paper-plane"></span> Hopital</span></a></div>

            <div class="navbar-collapse collapse" style="height: 1px;">

            </div>
        </div>




        <div class="dialog" >
            <div class="panel panel-default">
                <p class="panel-heading no-collapse">Connexion</p>
                <div class="panel-body">
                        <div class="form-group" >
                            <label>Reference du patient</label>
                            <select name="SPEDOC" id="DropDownTimezone" class="form-control">
                                <%
                                    Connection conn;
                                    conn = Connect.getCon();

                                    try {
                                        Statement stm = conn.createStatement();
                                        ResultSet rs = stm.executeQuery("Select refpat From patient");

                                        while (rs.next()) {
                                %>
                                <option value="<%=rs.getString(1)%>"><%=rs.getString(1)%></option>
                                <%
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                %>
                            </select>
                        </div>
                        <a class="btn btn-primary pull-left" data-toggle="modal" data-target="#myModal">Nouveau Patient</a>
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                        <h4 class="modal-title" id="myModalLabel">Insertion Patient</h4>
                                    </div>
                                    <div class="modal-body">
                                        <div class="row">
                                            <div class="col-md-4">
                                                <br>
                                                <div id="myTabContent" class="tab-content">
                                                    <div class="tab-pane active in" id="home">
                                                        <form id="tab" action="#" method="GET">
                                                            <div class="form-group">
                                                                <label>Nom</label>
                                                                <input type="text" class="form-control" id="NOMPAT">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Prenom</label>
                                                                <input type="text" class="form-control" id="PRENOMPAT">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Date de naissance</label>
                                                                <input type="date" class="form-control" id="DATEPAT">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Profession</label>
                                                                <input type="text" class="form-control" id="PROFESSIONPAT">
                                                            </div>


                                                        </form>
                                                    </div>


                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
                                        <button type="button" id="save" class="btn btn-primary" data-dismiss="modal">Enregistrer</button>
                                        <script src="jquery-1.11.1.js"></script>
                                        <script>
            $(document).ready(function ()
            {
                $("#save").click(function () {
                    var nom = document.getElementById('NOMPAT').value;
                    var prenom = document.getElementById('PRENOMPAT').value;
                    var dates = document.getElementById("DATEPAT").value;
                    var profession = document.getElementById("PROFESSIONPAT").value;
                    $.ajax({
                        url: "insertPat.jsp",
                        type: 'GET',
                        data: 'nom=' + nom + "&prenom=" + prenom + "&date=" + dates + "&profession=" + profession,
                        dataType: 'html',
                        success: function (code_html, statut)
                        {
                            //var json=JSON.parse(code_html);
                            $('#ref').load("choisirPat.jsp#ref").fadeIn("slow");
                        }
                    });
                });
            });
                                        </script>

                                    </div>
                                </div>
                            </div>
                        </div>
                        <a onclick="consult()" class="btn btn-primary pull-right">ok</a>
                        <div class="clearfix"></div>
                    </form>
                </div>
            </div>

        </div>


</div>
        <script src="lib/bootstrap/js/bootstrap.js"></script>
        <script type="text/javascript">
            $("[rel=tooltip]").tooltip();
            $(function () {
                $('.demo-cancel-click').click(function () {
                    return false;
                });
            });
            function consult()
            {
                var reference = document.getElementById('DropDownTimezone').value;
                document.location.href="Consultation.jsp?reference="+reference;
            }
        </script>


    </body></html>
