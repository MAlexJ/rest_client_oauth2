package com.malex.resource_server.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class RestApiController {

  @GetMapping("/resources")
  public ResponseEntity<List<String>> resources() {
    return ResponseEntity.ok().body(List.of("A", "B", "C"));
  }
}
