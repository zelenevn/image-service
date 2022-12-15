package digital.zelenev.image.image;

import org.springframework.web.multipart.MultipartFile;

public interface MultipartFileMapper {

    Image toImage(MultipartFile file);
}
