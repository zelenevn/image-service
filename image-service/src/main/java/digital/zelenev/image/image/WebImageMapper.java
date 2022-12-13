package digital.zelenev.image.image;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class WebImageMapper {

    Image toImage(MultipartFile file) {
        try {
            return new Image(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    MultipartFile toFile(Image image) {
        return new MockMultipartFile("file.jpg", image.getImage());
    }
}
