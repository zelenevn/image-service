package digital.zelenev.image.image;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "image")
@Data
@NoArgsConstructor
public class ImageJpaEntity {

    @Id
    private UUID id;

    @Lob
    private byte[] image;
}
