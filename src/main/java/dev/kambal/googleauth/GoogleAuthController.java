package dev.kambal.googleauth;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/google-auth/")
public class GoogleAuthController {

    @Autowired
    private GoogleClientSecrets clientSecrets;

    @Autowired
    private GoogleAuthorizationCodeFlow flow;

    @PostMapping("/api/v1/checkUser")
    public User checkUser(@RequestBody User newUser){
        User loginTestUser = new User(newUser.eMail, newUser.password);
        return loginTestUser;
    }
}
