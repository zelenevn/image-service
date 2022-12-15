package digital.zelenev.image.imageprocessing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ImageMessage implements Serializable {

    @JsonProperty("name")
    private String name;

    @JsonProperty("imageContent")
    private byte[] imageContent;

    @JsonProperty("contentType")
    private String contentType;

    @JsonProperty("length")
    private Long length;
}
