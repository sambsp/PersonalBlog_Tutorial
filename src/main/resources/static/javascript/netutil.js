function netPostJson(url, data, success, error) {
    $.ajax({
        type: 'post',
        async: true,
        data: JSON.stringify(data),
        url: url,
        dataType:'json',
        contentType: "application/json; charset=utf-8",
        success: function(data) {
            if (success != null) {
                success(data);
            }
        },
        error: function (xhr) {
            if (error != null) {
                error(xhr);
            }
        }
    });
}