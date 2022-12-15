package digital.zelenev.image.image;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RequestMapping(path = "image")
public interface ImageRestControllerMapping {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void saveImage(@RequestBody MultipartFile image);

    @GetMapping("{id}")
    ResponseEntity<byte[]> getImageById(@PathVariable UUID id);
}
