package ie.atu.userservicelab4.userservicelab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserServiceLab4Application {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceLab4Application.class, args);
    }

}
