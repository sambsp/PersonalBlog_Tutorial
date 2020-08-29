function onAddCatalog() {
    $('#catalog-input').attr('hidden', false);
}

$('#catalog-input').on('keyup', function(e) {
    if (e.keyCode == 13) {
        var catalog = $('#catalog-input').val().trim();

        var data = {'name': catalog}

        if (catalog != '') {
            $.ajax({
                type: 'post',
                async: true,
                data: JSON.stringify(data),
                url: document.location.origin + '/api/addcatalog',
                dataType:'json',
                contentType: "application/json; charset=utf-8",
                success: function(data) {
                    Toast.fire({
                        type: 'success',
                        title: '已经添加'
                    });
                },
                error: function (xhr) {
                    Toast.fire({
                        type: 'error',
                        title: "Ajax 发生错误: " + xhr.responseText
                    });
                }
            });
        }
    }
});

function getCatalogData () {
    var data = {};

    $.ajax({
        type: 'post',
        async: true,
        data: JSON.stringify(data),
        url: document.location.origin + '/api/getcatalog',
        dataType:'json',
        contentType: "application/json; charset=utf-8",
        success: function(data) {
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
            }
        },
        error: function (xhr) {
            Toast.fire({
                type: 'error',
                title: "Ajax 发生错误: " + xhr.responseText
            });
        }
    });
}

$(document).ready(function() {
    getCatalogData();
});

