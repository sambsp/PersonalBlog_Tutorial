package DefaultMain.API;

import DefaultMain.Model.Catalog;
import DefaultMain.Service.CatalogService;
import DefaultMain.Utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

@RestController
public class CatalogApi {
    @Autowired
    CatalogService catalogService;

    @PostMapping("/api/addcatalog")
    public ResponseEntity<?> addCatalog(@Valid @RequestBody Catalog catalog) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();

        if (!catalogService.exists(catalog)) {
            catalog.setId(null);
            String time = Utility.getNowTime();
            catalog.setCreateTime(time);
            catalog = catalogService.create(catalog);
        }
        return ResponseEntity.created(uri).body(catalog);
    }

    @PostMapping("/api/getcatalog")
    public ResponseEntity<?> getCatalog() {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();

        Collection<Catalog> catalogList = catalogService.read();

        return ResponseEntity.created(uri).body(catalogList);
    }
}
