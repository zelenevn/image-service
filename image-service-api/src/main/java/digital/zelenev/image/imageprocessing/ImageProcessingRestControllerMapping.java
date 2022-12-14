package digital.zelenev.image.imageprocessing;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping(path = "process")
public interface ImageProcessingRestControllerMapping {

    @PostMapping
    void processImage(@RequestBody MultipartFile image);
}
