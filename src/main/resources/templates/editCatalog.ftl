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
        <#include "./sidebartoggle.ftl">

        <section style="padding: 5px">
            <div class="card card-primary">
                <div class="card-header">
                    <h4>编辑分类栏目</h4>
                </div>
                <div class="card-body">
                    <button class="btn btn-primary mb-2" onclick="onAddCatalog();">新增栏目</button>
                    <input id="catalog-input" class="form-control col-4 mt-2" placeholder="输入内容后回车确认即可" hidden>
                </div>
                <div class="card-footer">

                </div>
            </div>
        </section>
    </div>
</div>
</body>

<script src="3rdParty/sweetalert2/sweetalert2.all.min.js"></script>
<script src="javascript/sidebartoggle.js"></script>
<script src="javascript/catalog.js"></script>

</html>