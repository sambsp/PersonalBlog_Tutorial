package DefaultMain.Service;

import DefaultMain.Database.TagRepository;
import DefaultMain.Model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    TagRepository tagRepository;

    @Override
    public Tag create(Tag tag) {
        return tagRepository.insert(tag);
    }

    @Override
    public Collection<Tag> read() {
        return tagRepository.findAll();
    }

    @Override
    public Tag update(Tag tag) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean exists(String name) {
        List<Tag> tags = tagRepository.findByName(name);
        return tags.size() > 0;
    }

    @Override
    public List<Tag> findByName(String name) {
        return tagRepository.findByName(name);
    }
}
