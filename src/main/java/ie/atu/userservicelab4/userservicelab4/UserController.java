package ie.atu.userservicelab4.userservicelab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private RegistrationService registrationService;

    @Autowired
    public void userController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/confirm-and-register")
    public Map<String, String> confirmAndRegister(@RequestBody UserDetails userDetails) {
        String confirm = registrationService.someDetails(userDetails);
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message",confirm);
        return responseMessage;
    }
}
