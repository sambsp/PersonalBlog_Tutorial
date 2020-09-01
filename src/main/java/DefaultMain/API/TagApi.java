package DefaultMain.API;

import DefaultMain.Model.Tag;
import DefaultMain.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Collection;

@RestController
public class TagApi {
    @Autowired
    TagService tagService;

    @PostMapping("/api/gettaglist")
    public ResponseEntity<?> getTagList() {
        URI uri  = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();

        Collection<Tag> tagList = tagService.read();

        return ResponseEntity.created(uri).body(tagList);
    }
}
