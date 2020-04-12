package it.gl.sbmongodb.mongocrudops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/mongo/emp")
public class ImpiegatoController {

  @GetMapping(value = "/hello")
  public String getHello() {
    return "Ciao";
  }
}
