package ie.atu.userservicelab4.userservicelab4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "http://localhost:8082")
public class RegistrationService {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails) {
        return null;
    }
}
