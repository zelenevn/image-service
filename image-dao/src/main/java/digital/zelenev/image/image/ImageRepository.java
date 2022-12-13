package digital.zelenev.image.image;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImageRepository extends CrudRepository<ImageJpaEntity, UUID> {
}
