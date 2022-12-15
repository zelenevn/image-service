package digital.zelenev.image.imageprocessing;

import org.springframework.web.multipart.MultipartFile;

public interface ImageProcessingService {

    void processImage(MultipartFile multipartImageFile);
}
