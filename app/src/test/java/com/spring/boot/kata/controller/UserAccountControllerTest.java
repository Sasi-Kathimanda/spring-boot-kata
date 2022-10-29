package com.spring.boot.kata.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.boot.kata.model.UserAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;

@AutoConfigureMockMvc
@SpringBootTest
class UserAccountControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
    }

    @Test
    void validBasicInfoWithMissingData() throws Exception {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName("");
        String body = objectMapper.writeValueAsString(userAccount);
        mockMvc.perform(MockMvcRequestBuilders.post("/validBasicInfo")
//                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(body))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}