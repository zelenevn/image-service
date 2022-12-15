package digital.zelenev.image.image;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ImageRestController implements ImageRestControllerMapping {

    private final ImageService imageService;

    private final HttpResponseBuilder httpResponseBuilder;

    @Override
    public void saveImage(MultipartFile image) {
        imageService.saveImage(image);
    }

    @Override
    public ResponseEntity<byte[]> getImageById(UUID id) {
        Image imageById = imageService.getImageById(id);
        return httpResponseBuilder.buildImageResponseEntity(imageById);
    }
}
