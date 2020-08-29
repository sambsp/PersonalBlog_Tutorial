package DefaultMain.Service;

import DefaultMain.Model.Catalog;

import java.util.Collection;

public interface CatalogService {
    public abstract Catalog create(Catalog catalog);
    public abstract Collection<Catalog> read();
    public abstract Catalog update(Catalog catalog);
    public abstract void delete(String id);
    public abstract boolean exists(Catalog catalog);
}
