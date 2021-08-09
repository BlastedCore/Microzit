package io.javabrain.moviecatalogservice.resources;

import io.javabrain.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collections;
import java.util.List;
//Handler for all website interactions, all CatalogItem Logic happens here, resources: catalogitem , project calls: movie-info, rating-data
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {

    //Endpoint for specific User related Items.
    // todo Login, Verification, Calling other services, Interactivity.
    @RequestMapping("/{userID}")
    public List<CatalogItem> getCatalog(@PathVariable("userID") String userID) {
        return Collections.singletonList(
                new CatalogItem("Titanic", "description", 4)
        );
    }
}
