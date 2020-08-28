package DefaultMain.API;

import DefaultMain.Model.Catalog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CatalogApi {
    @PostMapping("/api/addcatalog")
    public ResponseEntity<?> addCatalog(@Valid @RequestBody Catalog catalog) {
        return null;
    }
}
