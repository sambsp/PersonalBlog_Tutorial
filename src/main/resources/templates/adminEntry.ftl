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
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Personal Blog</h3>
        </div>

        <ul class="list-unstyled components">
            <li class="active">
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Home</a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li>
                        <a href="#">Link 1</a>
                    </li>
                    <li>
                        <a href="#">Link 2</a>
                    </li>
                    <li>
                        <a href="#">Link 3</a>
                    </li>
                </ul>
            </li>
        </ul>

    </nav>

    <!-- Content -->
    <div id="content">
        <p>hello world</p>
    </div>
</div>

</body>

</html>