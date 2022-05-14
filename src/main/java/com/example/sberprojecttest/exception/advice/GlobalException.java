package com.example.sberprojecttest.exception.advice;

import com.example.sberprojecttest.exception.FisrtException;
import com.example.sberprojecttest.exception.response.LandingNotFoundResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

//@ControllerAdvice
//public class GlobalException {
//
//    @ExceptionHandler(FisrtException.class)
//    public ResponseEntity<LandingNotFoundResponse> handleException(FisrtException e) {
//        LandingNotFoundResponse response = new LandingNotFoundResponse(e.getMessage());
//        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//    }
//}

@Slf4j
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<LandingNotFoundResponse> handleException(ResponseStatusException ex) {

        if (HttpStatus.NOT_FOUND.equals(ex.getStatus())) {
            System.out.println("kuku");
            HttpStatus i = ex.getStatus();
            System.out.println(i.value());
            System.out.println(i.getReasonPhrase());
            System.out.println(i.toString());
            System.out.println(String.valueOf(ex.getStatus()));
            System.out.println(ex.getMessage());
            log.debug(ex.getMessage(), ex);
        } else {
            System.out.println("lala");
            log.error(ex.getMessage(), ex);
        }
        LandingNotFoundResponse landingNotFoundResponse = new LandingNotFoundResponse(ex.getMessage());
        return new ResponseEntity<>(landingNotFoundResponse, HttpStatus.NOT_FOUND);
    }
}
