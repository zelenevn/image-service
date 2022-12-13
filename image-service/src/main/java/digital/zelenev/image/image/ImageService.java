package digital.zelenev.image.image;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageInputBoundary imageInputBoundary;
    private final WebImageMapper webImageMapper;

    public void saveImage(MultipartFile image) {
        imageInputBoundary.saveImage(webImageMapper.toImage(image));
    }

    public Image getImageById(UUID id) {
        return imageInputBoundary.getImageById(id);
    }
}
