package digital.zelenev.image.image;

import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public interface ImageService {

    void saveImage(MultipartFile image);

    Image getImageById(UUID id);
}
