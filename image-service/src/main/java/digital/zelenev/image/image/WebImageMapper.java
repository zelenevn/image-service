package digital.zelenev.image.image;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class WebImageMapper {

    public Image toImage(MultipartFile file) {
        try {
            return new Image(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ImageDto toDto(Image image) {
        return new ImageDto(image.getImage());
    }
}
