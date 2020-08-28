function onAddCatalog() {
    $('#catalog-input').attr('hidden', false);
}

$('#catalog-input').on('keyup', function(e) {
    if (e.keyCode == 13) {
        var catalog = $('#catalog-input').val().trim();

        var data = {'catalog': catalog}

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

