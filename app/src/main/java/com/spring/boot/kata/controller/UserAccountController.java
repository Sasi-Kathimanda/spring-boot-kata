package com.spring.boot.kata.controller;

import com.spring.boot.kata.model.UserAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class UserAccountController {

    @RequestMapping(value= "/saveBasicInfo" , method = RequestMethod.POST)
    public void saveBasicInfo(@Valid UserAccount userAccount , BindingResult result) {
        if(result.hasErrors()) {
            log.error(result.getAllErrors().toString());
        }
        System.out.println("userAccount = " + userAccount);
    }
}
