package ar.com.tvillanueva.euler;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EulerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EulerApplication.class).headless(false).run(args);
    }

}
