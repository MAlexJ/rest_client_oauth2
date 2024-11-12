package com.malex.client_server.controller;

import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/resources")
public class RestApiController {

  private final RestClient restClient;

  public RestApiController(RestClient restClient) {
    this.restClient = restClient;
  }

  @GetMapping
  public ResponseEntity<List<String>> resources() {
    List<String> list =
        restClient
            .get()
            .uri("http://localhost:8081/v1/api/resources")
            .retrieve()
            .body(new ParameterizedTypeReference<List<String>>() {});
    return ResponseEntity.ok(list);
  }
}
