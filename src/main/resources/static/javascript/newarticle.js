ClassicEditor.create( document.querySelector( '#article-editor' ), {

				toolbar: {
					items: [
						'heading',
						'|',
						'bold',
						'italic',
						'link',
						'bulletedList',
						'numberedList',
						'|',
						'indent',
						'outdent',
						'|',
						'imageUpload',
						'blockQuote',
						'insertTable',
						'mediaEmbed',
						'undo',
						'redo'
					]
				},
				language: 'en',
				image: {
					toolbar: [
						'imageTextAlternative',
						'imageStyle:full',
						'imageStyle:side'
					]
				},
				table: {
					contentToolbar: [
						'tableColumn',
						'tableRow',
						'mergeTableCells'
					]
				},
				licenseKey: '',

			} )
			.then( editor => {
				window.editor = editor;
			} )
			.catch( error => {
				console.error( 'Oops, something gone wrong!' );
				console.error( 'Please, report the following error in the https://github.com/ckeditor/ckeditor5 with the build id and the error stack trace:' );
				console.warn( 'Build id: k2i30chx32nf-8o65j7c6blw0' );
				console.error( error );
			} );

function saveArticle() {
    var title = $('#article-title').val();
    var catalog = $("#catlog-selection").val();
    var content = window.editor.getData();

    if (title == null || title.trim() == '') {
        console.log("题目不能是空的");
        return;
    }

    if (catalog == null || catalog.trim() == '') {
        console.log("分类不能是空的");
        return;
    }

    if (content == null || content.trim == '') {
        console.log("内容不能是空的");
        return;
    }

    $.ajax({
        type: 'post',
        async: true,
        data: {'title': title, 'content': content, 'catalog': catalog},
        url: document.location.origin + '/api/savearticle',
        dataType:'text',
        success: function(data) {
            console.log("保存成功");
        },
        error: function () {
            console.log("Ajax 发生错误！");
        }
    });
}