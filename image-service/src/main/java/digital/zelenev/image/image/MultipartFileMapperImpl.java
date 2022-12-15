package digital.zelenev.image.image;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Component
public class MultipartFileMapperImpl implements MultipartFileMapper {

    public Image toImage(MultipartFile file) {
        try {
            return new Image(
                    file.getName(),
                    file.getBytes(),
                    file.getContentType(),
                    file.getSize()
            );
        } catch (IOException e) {
            throw new ImageMappingException("Error while mapping image.");
        }
    }
}
