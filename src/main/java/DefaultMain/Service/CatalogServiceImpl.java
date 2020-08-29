package DefaultMain.Service;

import DefaultMain.Database.CatalogRepository;
import DefaultMain.Model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.ignoreCase;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    CatalogRepository catalogRepository;


    @Override
    public Catalog create(Catalog catalog) {
        return catalogRepository.insert(catalog);
    }

    @Override
    public Collection<Catalog> read() {
        return catalogRepository.findAll();
    }

    @Override
    public Catalog update(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean exists(Catalog catalog) {
        Catalog probe = new Catalog();
        probe.setName(catalog.getName());
        ExampleMatcher modelMatcher = ExampleMatcher.matching().withMatcher("name", ignoreCase());
        Example<Catalog> example = Example.of(probe, modelMatcher);
        boolean exists = catalogRepository.exists(example);
        return exists;
    }
}
