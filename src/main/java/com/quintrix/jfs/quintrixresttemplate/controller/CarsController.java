package com.quintrix.jfs.quintrixresttemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.quintrix.jfs.quintrixresttemplate.models.Car;

@RestController
public class CarsController {


  @RequestMapping(method = RequestMethod.GET, value = "/cars")
  ResponseEntity<String> getCars() {
    RestTemplate restTemplate = new RestTemplate();
    String carResourceUrl = "http://localhost:8080/cars";
    return restTemplate.getForEntity(carResourceUrl, String.class);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/cars")
  ResponseEntity<String> addCar(Car car) {
    RestTemplate restTemplate = new RestTemplate();
    String carResourceUrl = "http://localhost:8080/cars";

    return restTemplate.postForEntity(carResourceUrl, car, null);
  }
}

