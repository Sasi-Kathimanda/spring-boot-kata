package com.spring.boot.kata.controller;

import com.spring.boot.kata.model.UserAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class UserAccountController {

//    @RequestMapping(value= "/validBasicInfo" , method = RequestMethod.POST)
    @PostMapping(value = "/validBasicInfo")
    public ResponseEntity<String> validBasicInfo(@Valid @RequestBody UserAccount userAccount ) {
        return ResponseEntity.ok("valid");
    }
}
