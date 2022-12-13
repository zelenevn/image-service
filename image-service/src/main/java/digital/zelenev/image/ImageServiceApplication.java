package digital.zelenev.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageServiceApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ImageServiceApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
