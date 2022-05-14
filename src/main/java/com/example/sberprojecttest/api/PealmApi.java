package com.example.sberprojecttest.api;

import com.example.sberprojecttest.exception.FisrtException;
import com.example.sberprojecttest.model.User;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Api
public interface PealmApi {

    @RequestMapping("/user/{id}")
    default ResponseEntity<User> testUserGet(@PathVariable("id") int id) throws FisrtException {

        System.out.println(id);
        User user = new User();
        user.setName("Tom");
        user.setLastName("Kruz");
        user.setAge(18);
        user.setPhoneNumber(892211);

        return new ResponseEntity<>(user, HttpStatus.OK);

    }
}
