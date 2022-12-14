package digital.zelenev.image.image;

import java.util.UUID;

public interface ImageGateway {

    void saveImage(Image image);

    Image getImageById(UUID id);

}
