package digital.zelenev.image.image;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ImageRestController implements ImageRestControllerMapping {

    private final ImageService imageService;

    @Override
    public void saveImage(MultipartFile image) {
        imageService.saveImage(image);
    }

    @Override
    public ImageDto getImageById(UUID id) {
        return imageService.getImageById(id);
    }
}
