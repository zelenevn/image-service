package digital.zelenev.image.image;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@Component
public class MultipartFileMapperImpl implements MultipartFileMapper {

    public Image toImage(MultipartFile file) {
        try {
            String imageExtension = Objects.requireNonNull(file.getContentType()).split("/")[1];
            return new Image(
                    file.getName(),
                    file.getBytes(),
                    imageExtension,
                    file.getSize()
            );
        } catch (IOException e) {
            throw new ImageMappingException("Error while mapping image.");
        }
    }
}
