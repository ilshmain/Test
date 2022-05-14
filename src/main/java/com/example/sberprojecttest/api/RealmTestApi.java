package com.example.sberprojecttest.api;

import com.example.sberprojecttest.exception.FisrtException;
import com.example.sberprojecttest.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/test")
public class RealmTestApi implements PealmApi{

    @Override
    public ResponseEntity<User> testUserGet(@PathVariable("id") int id) {

        if (id != 1)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Page not found");
        System.out.println(id + 1);
        User user = new User();
        user.setName("Tom");
        user.setLastName("Kruz");
        user.setAge(18);
        user.setPhoneNumber(892211);
        return ResponseEntity.ok(new User().changeName("Yes"));
    }
}