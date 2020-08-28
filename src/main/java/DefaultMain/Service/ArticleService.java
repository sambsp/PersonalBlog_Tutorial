package DefaultMain.Service;

import DefaultMain.Model.Article;

import java.util.Collection;

public interface ArticleService {
    public abstract Article create(Article article);
    public abstract Collection<Article> read();
    public abstract Article update(Article article);
    public abstract void delete(String id);
}
