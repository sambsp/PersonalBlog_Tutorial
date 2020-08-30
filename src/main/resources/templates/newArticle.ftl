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

    <style>
        .ck-editor__editable_inline {
            min-height: 400px;
        }
    </style>
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
                        <h4>新的文章<span id="article-id" value=""></span></h4>
                    </div>
                    <div class="card-body">
                        <div class="form-group">
                            <label>题目</label>
                            <input type="text" id="article-title" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>文章内容</label>
                            <div id="article-editor"></div>
                        </div>
                        <div class="row">
                            <div class="form-group col-3">
                                <label>分类</label>
                                <select id="catlog-selection" class="form-control custom-select" onchange="">
                                    <option selected="" disabled="">选择类型</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="card-footer">
                        <div class="row">
                            <div class="col-12">
                                <button class="btn btn-secondary" onclick="saveArticle()">保存</button>
                                <button class="btn btn-success" onclick="">发布</button>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
</body>

<script src="3rdParty/ckeditor/ckeditor.js"></script>
<script src="3rdParty/sweetalert2/sweetalert2.all.min.js"></script>
<script src="javascript/sidebartoggle.js"></script>
<script src="javascript/newarticle.js"></script>

</html>