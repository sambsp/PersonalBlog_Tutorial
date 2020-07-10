<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width", initial-scale="1.0">
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/popper.js/2.4.2/umd/popper.min.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <title>${siteName}</title>
</head>
<body style="background-image: url(default-background.jpg); background-position-x: left; background-position-y: top ; background-size: cover; background-repeat: no-repeat; background-attachment: fixed;">
<!-- 整个页面做成一行，十二列 -->
<div class="row">
    <!-- 左侧第一个占2列的竖向区域 -->
    <div class="col-2">
        <p>1 - 2</p>
    </div>
    <!-- 左侧第二个占2列的竖向区域 -->
    <div class="col-2 bg-dark text-light ">
        <div class="row border-bottom border-secondary mb-4">
            <div class="col d-flex justify-content-center">
                <h1 class="p-5">博客名</h1>
            </div>
            <span class=""></span>
        </div>
        <!-- 搜索部分组合 -->
        <div class="row border-bottom border-secondary mb-4">
            <div class="col">
                <div class="form-group">
                    <label for="inputdefault">搜索</label>
                    <input class="form-control" id="inputdefault" type="text">
                </div>
            </div>
        </div>
        <!-- 最近的帖子组合 -->
        <div class="row border-bottom border-secondary mb-4">
            <div class="col">
                <label for="inputdefault">最近的帖子</label>
                <div>
                    <ul style="padding-left: 20px;">
                        <li>Three.js显示模型，有黑块 六月 22, 2020</li>
                        <li> Github ssh multiple ssh keys 无密码多公钥 六月 13, 2020</li>

                    </ul>
                </div>
            </div>
        </div>
        <!-- 评论组合 -->
        <div class="row border-bottom border-secondary mb-4">
            <div class="col">
                <label for="inputdefault">评论</label>
                <div>
                    <ul style="padding-left: 20px;">
                        <li>Kaylee发表在《JavaFX控件使用style的方式》</li>
                        <li>lyp发表在《Cesium的着色器（shader）》</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- 存档组合 -->
        <div class="row border-bottom border-secondary mb-4">
            <div class="col">
                <label for="inputdefault">存档</label>
                <div>
                    <ul style="padding-left: 20px;">
                        <li>2020年六月</li>
                        <li>2020年五月</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- 分类组合 -->
        <div class="row border-bottom border-secondary mb-4">
            <div class="col">
                <label for="inputdefault">分类</label>
                <div>
                    <ul style="padding-left: 20px;">
                        <li>Learn</li>
                        <li>WebGL教程</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- 标签组合 -->
        <div class="row">
            <div class="col">
                <label for="inputdefault">标签</label>
                <div>
                    3D Android Babylon.js
                </div>
            </div>
        </div>
    </div>
    <!-- 文章主题部分 -->
    <div class="col-6 bg-white">
        <div class="row">
            <div class="col-1"></div>
            <div class="col-10 text-center">
                <h1>Windows simulate key input C#, bootstrap it now</h1>
            </div>
            <h6>五月 19, 2020 BY SAMBSP·0评论</h6>
            <h5 class="text-left">化石原创文章，转载请注明来源并保留原文链接</h5>
            <h5 class="text-left">
                Codeplex中有inputsimulator库，可以模拟按键的输入：
                https://archive.codeplex.com/?p=inputsimulator
                下载后解压，WindowsInput目录下的cs文件，按原来的目录放置到目标工程中，编译后就能使用该库。
                示例代码（用Unity模拟）：
            </h5>
            <h5 class="text-left">化石原创文章，转载请注明来源并保留原文链接</h5>
            <div class="col-1"></div>
        </div>
    </div>
    <div class="col-2">
        <p>11 - 12</p>
    </div>
</div>
</body>
</html>