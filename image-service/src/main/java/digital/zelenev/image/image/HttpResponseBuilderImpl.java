package digital.zelenev.image.image;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class HttpResponseBuilderImpl implements HttpResponseBuilder {

    @Override
    public ResponseEntity<byte[]> buildImageResponseEntity(Image image) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "image/" + image.getExtension());
        httpHeaders.add("Content-Length", String.valueOf(image.getLength()));

        return new ResponseEntity<>(
                image.getImageContent(),
                httpHeaders,
                HttpStatus.OK
        );
    }
}
