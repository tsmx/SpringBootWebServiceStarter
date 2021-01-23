package com.example.app;

import com.example.utils.SimpleMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomePathTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHomePathRespone() throws Exception {
        String response
                = this.restTemplate.getForObject("http://localhost:" + port + "/",
                        String.class);
        assertThat(response).isNotNull();
        ObjectMapper om = new ObjectMapper();
        SimpleMessage responseMessage = om.readValue(response, SimpleMessage.class);
        assertThat(responseMessage).isNotNull();
        assertThat(responseMessage.getMessage()).isEqualTo("Hello Spring Boot World!");
    }
}
