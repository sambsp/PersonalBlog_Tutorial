package DefaultMain.Service;

import DefaultMain.Database.ArticleRepository;
import DefaultMain.Model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article create(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Collection<Article> read() {
        return null;
    }

    @Override
    public void update(String id, Article article) {

    }

    @Override
    public void delete(String id) {

    }
}
