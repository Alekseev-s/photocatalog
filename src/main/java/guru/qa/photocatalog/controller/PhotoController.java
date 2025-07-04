package guru.qa.photocatalog.controller;

import guru.qa.photocatalog.domain.Photo;
import guru.qa.photocatalog.service.PhotoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/photo")
public class PhotoController {

    private final PhotoService photoService;

    @Autowired
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping("/all")
    public List<Photo> all() {
        return photoService.allPhotos();
    }

    @GetMapping("/{id}")
    public Photo byId(@PathVariable("id") String id) {
        return photoService.byId(id);
    }
}
