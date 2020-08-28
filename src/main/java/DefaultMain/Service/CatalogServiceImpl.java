package DefaultMain.Service;

import DefaultMain.Database.CatalogRepository;
import DefaultMain.Model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class CatalogServiceImpl implements CatalogService {
    @Autowired
    CatalogRepository catalogRepository;


    @Override
    public Catalog create(Catalog catalog) {
        return catalogRepository.insert(catalog);
    }

    @Override
    public Collection<Catalog> read() {
        return null;
    }

    @Override
    public Catalog update(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    @Override
    public void delete(String id) {

    }
}
