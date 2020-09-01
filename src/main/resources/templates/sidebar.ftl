<nav id="sidebar">
    <div class="sidebar-header" onclick="window.location = '/';" style="cursor: pointer;">
        <h3>Personal Blog</h3>
    </div>

    <ul class="list-unstyled components">
        <li class="active">
            <a href="#articleSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">文章管理</a>
            <ul class="collapse list-unstyled" id="articleSubmenu">
                <li>
                    <a href="#">所有文章</a>
                </li>
                <li class="current">
                    <a href="/newarticle">写文章</a>
                </li>
                <li>
                    <a href="/catalog">分类目录</a>
                </li>
                <li>
                    <a href="/tag">标签</a>
                </li>
            </ul>
        </li>
    </ul>
</nav>