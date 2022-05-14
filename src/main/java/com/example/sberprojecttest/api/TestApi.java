package com.example.sberprojecttest.api;

import com.example.sberprojecttest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.ResourceBundle;

@RestController
public class TestApi {

    @Autowired
    private ResourceBundle bundle;

    @GetMapping("/lalala")
    public User test() {
        User user = new User();
        user.setName("Tom");
        user.setLastName("Kruz");
        user.setAge(18);
        user.setPhoneNumber(892211);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom", "foo");
        System.out.println(bundle.getString("key"));
        return user.changeName("Mikel");
    }
}