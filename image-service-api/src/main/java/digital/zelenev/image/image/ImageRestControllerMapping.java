package digital.zelenev.image.image;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping(path = "image")
public interface ImageRestControllerMapping {

    @PostMapping
    void saveImage(@RequestBody MultipartFile image);
}
