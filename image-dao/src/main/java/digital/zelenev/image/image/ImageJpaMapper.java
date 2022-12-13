package digital.zelenev.image.image;

public interface ImageJpaMapper {

    ImageJpaEntity toJpaImageEntity(Image image);

    Image toImage(ImageJpaEntity imageJpaEntity);
}
