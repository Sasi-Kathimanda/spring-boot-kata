package com.spring.boot.kata;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
class SpringActuatorTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReceiveActuatorEndpointSuccessfully() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/actuator")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("/localhost/actuator/")));
    }

    @Test
    void shouldReceiveNotFoundWhenHitWrongURL() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/act")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    void shouldDisplayInfoOfTheProjectWhenActuatorInfoClicked() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/actuator/info")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("\"name\":\"Spring Boot Kata\"")));
    }
}
