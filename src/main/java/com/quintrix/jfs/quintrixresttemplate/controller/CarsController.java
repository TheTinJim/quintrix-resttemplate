package com.quintrix.jfs.quintrixresttemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CarsController {


  @RequestMapping(method = RequestMethod.GET, value = "/cars")
  ResponseEntity<String> getCars() {
    RestTemplate restTemplate = new RestTemplate();
    String carResourceUrl = "http://localhost:8080/cars";
    return restTemplate.getForEntity(carResourceUrl, String.class);
  }
}

