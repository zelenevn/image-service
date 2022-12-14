package digital.zelenev.image.imageprocessing;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ImageProcessingRestController implements ImageProcessingRestControllerMapping {

    private final ImageProcessingService imageProcessingService;

    @Override
    public void processImage(@RequestBody MultipartFile image) {
        log.info(image.toString());
        imageProcessingService.processImage(image);
    }
}
