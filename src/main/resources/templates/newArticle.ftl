<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>后台首页</title>
    <!-- JQuery   -->
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Popper   -->
    <script src="https://cdn.bootcdn.net/ajax/libs/popper.js/2.4.4/umd/popper.js"></script>
    <!-- Bootstrap -->
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <!-- Font Awesome -->
    <script src="https://cdn.bootcdn.net/ajax/libs/font-awesome/5.13.0/js/solid.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/font-awesome/5.13.0/js/fontawesome.js"></script>

    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <div class="wrapper">
        <!-- Sidebar -->
        <#include "./sidebar.ftl">

        <!-- Content -->
        <div id="content">
            <nav class="navbar navbar-expand navbar-white navbar-light">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" onclick="javascript:toggleSidebar()" href="#"><i class="fas fa-bars"></i></a>
                    </li>
                </ul>
            </nav>

            <section class="newarticlesetion">
                <div class="card">
                    <h3>文章标题</h3>
                </div>
            </section>
        </div>
    </div>
</body>

<script type="text/javascript">
    function toggleSidebar() {
        $('#sidebar').toggleClass('active');
    }
</script>

</html>