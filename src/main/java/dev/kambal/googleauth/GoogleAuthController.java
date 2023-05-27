package dev.kambal.googleauth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GoogleAuthController {

    @PostMapping("/api/v1/checkUser")
    public User checkUser(@RequestBody User newUser){
        User loginTestUser = new User(newUser.eMail, newUser.password);
        return loginTestUser;
    }
}
