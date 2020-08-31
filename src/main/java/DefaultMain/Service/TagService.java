package DefaultMain.Service;

import DefaultMain.Model.Tag;

import java.util.Collection;
import java.util.List;

public interface TagService {
    public abstract Tag create(Tag tag);
    public abstract Collection<Tag> read();
    public abstract Tag update(Tag tag);
    public abstract void delete(String id);
    public abstract  boolean exists(String name);
    public abstract List<Tag> findByName(String name);
}
