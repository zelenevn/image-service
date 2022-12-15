package digital.zelenev.image.imageprocessing;


import digital.zelenev.image.image.Image;
import org.mapstruct.Mapper;

@Mapper
public interface ImageMessageMapper {

    ImageMessage toMessage(Image image);

    Image toImage(ImageMessage imageMessage);
}
