package digital.zelenev.image.image;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class JpaImageGateway implements ImageGateway {

    private final ImageRepository imageRepository;

    private final ImageJpaMapper imageJpaMapper;

    @Override
    public void saveImage(Image image) {
        ImageJpaEntity entity = imageJpaMapper.toJpaImageEntity(image);
        imageRepository.save(entity);
        log.info("Save image with id: {}", entity.getId());
    }

    @Override
    public Image getImageById(UUID id) {
        Optional<ImageJpaEntity> found = imageRepository.findById(id);
        if (found.isPresent())
            return imageJpaMapper.toImage(found.get());
        throw new ImageNotFoundInDatabaseException("Cant find image with id: " + id);
    }
}
