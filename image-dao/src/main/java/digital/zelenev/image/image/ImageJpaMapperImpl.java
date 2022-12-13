package digital.zelenev.image.image;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ImageJpaMapperImpl implements ImageJpaMapper {

    @Override
    public ImageJpaEntity toJpaImageEntity(Image image) {
        ImageJpaEntity jpaEntity = new ImageJpaEntity();
        jpaEntity.setId(UUID.randomUUID());
        jpaEntity.setImage(image.getImage());
        return jpaEntity;
    }

    @Override
    public Image toImage(ImageJpaEntity imageJpaEntity) {
        return new Image(imageJpaEntity.getImage());
    }
}
