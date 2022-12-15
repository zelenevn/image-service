package digital.zelenev.image.image;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ImageJpaMapper {

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    ImageJpaEntity toJpaImageEntity(Image image);

    Image toImage(ImageJpaEntity imageJpaEntity);
}
