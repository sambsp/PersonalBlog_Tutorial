package Model;

import javax.validation.constraints.NotBlank;

public class Article {
    @NotBlank(message = "title cannot be empty")
    private String title;
    @NotBlank(message = "content cannot be empty")
    private String content;
    @NotBlank(message = "catalog cannot be empty")
    private String catalog;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
}