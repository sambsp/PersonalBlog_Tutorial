function fetchTagList() {
    netPostJson(document.location.origin + '/api/gettaglist',
        {},

        function(data) {
            if(data && data.length) {
                var parent = $('#tag-table-body');
                for (var i = 0; i < data.length; ++i) {
                    var c = data[i];
                    var s = '<tr><td>' + c.id + '</td><td>' + c.name + '</td><td>' + c.createTime + '</td></tr>';
                    parent.append(s);
                }
            }
        },

        function(xhr) {
            Toast.fire({
                type: 'error',
                title: "Ajax 发生错误: " + xhr.responseText
            });
        });
}

$(document).ready(function() {
    fetchTagList();
});