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
    var id = $('#article-id').attr('value').trim();
    var tagList = $('#tags-container').find('.token-autocomplete-token');

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

    if (tagList.length == 0) {
        console.log("标签不能是空的");
        return;
    }

    var tags = [];
    for (var i = 0; i < tagList.length; ++i) {
        var tag = {};
        tag.name = tagList[i].getAttribute('data-text');
        tags.push(tag);
    }

    var data = {'title': title, 'content': content, 'catalog': { 'id': catalog }, 'tagList': tags, 'id': id};
    var url = document.location.origin + '/api/savearticle';
    netPostJson(url, data, function(data) {
            Toast.fire({
            	type: 'success',
            	title: '保存成功'
            });

            if (id == "") {
                $('#article-id').attr('value', data.id);
            }
        }, function(xhr) {
            Toast.fire({
                type: 'error',
                title: "Ajax 发生错误: " + xhr.responseText
            });
        });
}

$(document).ready(function() {
    var data = {};
    var url = document.location.origin + '/api/getcatalog';

    netPostJson(url, data, function(data) {
            if(data && data.length) {
                var root = $('#catlog-selection');
                for (var i = 0; i < data.length; ++i) {
                    var c = data[i];
                    var s = '<option value="' + c.id + '">' + c.name + '</option>';
                    root.append(s);
                }
            }
        }, function (xhr) {
            Toast.fire({
                type: 'error',
                title: "Ajax 发生错误: " + xhr.responseText
            });
        });

    var tokenAutocomplete = new TokenAutocomplete({
        name: 'tags-container',
        selector: '#tags-container',
        suggestionRenderer: function (suggestion) {
            var option = document.createElement('li');
            option.textContent = suggestion.text;
            if (suggestion.description) {
                var description = document.createElement('small');
                description.textContent = suggestion.description;
                description.classList.add('token-autocomplete-suggestion-description');
                option.appendChild(description);
            }
            return option;
        }
    });
});