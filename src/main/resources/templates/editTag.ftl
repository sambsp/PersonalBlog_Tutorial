<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>标签管理</title>
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
    <link href="3rdParty/datatable/datatables.min.css" rel="stylesheet">
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
                    <h4>标签管理</h4>
                </div>
                <div class="card-body">

                    <table id="tag-table-container" class="table table-bordered table-striped table-hover mt-2">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>名称</th>
                            <th>创建时间</th>
                        </tr>
                        </thead>
                        <tbody id="tag-table-body">
                        </tbody>
                        <tfoot>
                        </tfoot>
                    </table>
                </div>
                <div class="card-footer">

                </div>
            </div>
        </section>
    </div>
</div>
</body>

<script src="3rdParty/sweetalert2/sweetalert2.all.min.js"></script>
<script src="3rdParty/datatable/datatables.min.js"></script>
<script src="javascript/sidebartoggle.js"></script>
<script src="javascript/toast.js"></script>
<script src="javascript/netutil.js"></script>
<script src="javascript/tag.js"></script>

</html>