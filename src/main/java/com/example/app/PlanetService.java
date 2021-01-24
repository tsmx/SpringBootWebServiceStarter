package com.example.app;

import com.example.dto.PlanetDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class PlanetService {

    private final RestTemplate restTemplate;
    
    private static final Logger log = LoggerFactory.getLogger(PlanetService.class);

    @Autowired
    public PlanetService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @RequestMapping(path = "/planet/{name}", method = RequestMethod.GET)
    public ResponseEntity<PlanetDto> getPlanetData(@PathVariable String name) {
        log.info("Request for planet: " + name);
        try {
            PlanetDto planet = this.restTemplate
                    .getForObject("https://api.le-systeme-solaire.net/rest.php/bodies/" + name, PlanetDto.class);
            log.info("Planet " + name + " found, returning information.");
            return new ResponseEntity<>(planet, HttpStatus.OK);
        } catch (RestClientException ex) {
            log.error("Could not get information for planet " + name + ": " + ex.getMessage());
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
