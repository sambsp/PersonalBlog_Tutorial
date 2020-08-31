function onAddCatalog() {
    $('#catalog-input').attr('hidden', false);
}

$('#catalog-input').on('keyup', function(e) {
    if (e.keyCode == 13) {
        var catalog = $('#catalog-input').val().trim();

        var data = {'name': catalog}
        var url = document.location.origin + '/api/addcatalog';
        if (catalog != '') {
            function success(data) {
                Toast.fire({
                  type: 'success',
                  title: '已经添加'
                });
            }

            function error(xhr) {
                Toast.fire({
                    type: 'error',
                    title: "Ajax 发生错误: " + xhr.responseText
                });
            }

            netPostJson(url, data, success, error);
        }
    }
});

function getCatalogData () {
    var data = {};
    var url = document.location.origin + '/api/getcatalog';
    function success(data) {
        if(data && data.length) {
            var tbody = $('#catalog-table-body');
            for (var i = 0; i < data.length; ++i) {
                var c = data[i];
                if (!c.createTime) {
                    c.createTime = '';
                }
                var s = '<tr><td>' + c.id + '</td><td>' + c.name + '</td><td>' + c.createTime + '</td></tr>';
                tbody.append(s);
            }

            attachDataTable();
        }
    }

    function error(xhr) {
        Toast.fire({
            type: 'error',
            title: "Ajax 发生错误: " + xhr.responseText
        });
    }

    netPostJson(url, data, success, error);
}

function attachDataTable() {
    $("#catalog-table-container").DataTable({
        "paging": true,         //是否分页，如果是false，则全部显示，否则默认是10个数据一页
        "lengthChange": true,   //是否可以控制每页多少个数据，这个会影响Show x entries的显示
        "searching": true,      //是否要显示search栏
        "ordering": true,       //是否出排序的小控件
        "info": true,           //不知
        "autoWidth": false,      //
        "language": {
            "lengthMenu": "每页显示记录 _MENU_",
            "zeroRecords": "没有任何内容",
            "info": "当前第_PAGE_页，共_PAGES_页",
            "infoEmpty": "No records available",
            "infoFiltered": "(filtered from _MAX_ total records)",
            "search": "搜索：",
            "paginate": {
                "first": "首頁",
                "last": "末頁",
                "next": "下一頁",
                "previous": "前一頁"
            }
        },
    });
}

$(document).ready(function() {
    getCatalogData();
});

