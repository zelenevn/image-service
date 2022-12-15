package digital.zelenev.image.image;

import org.springframework.http.ResponseEntity;

public interface HttpResponseBuilder {

    ResponseEntity<byte[]> buildImageResponseEntity(Image image);
}
