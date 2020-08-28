function onAddCatalog() {
    $('#catalog-input').attr('hidden', false);
}

$('#catalog-input').on('keyup', function(e) {
    if (e.keyCode == 13) {
        console.log("hello world");
    }
});

