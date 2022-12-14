package digital.zelenev.image.imageprocessing;

import digital.zelenev.image.image.Image;
import digital.zelenev.image.image.WebImageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageProcessingService {

    private final ProcessingInputBoundary processingInputBoundary;

    private final WebImageMapper webImageMapper;

    public void processImage(MultipartFile multipartImageFile) {
        Image image = webImageMapper.toImage(multipartImageFile);
        processingInputBoundary.processImage(image);
    }
}
