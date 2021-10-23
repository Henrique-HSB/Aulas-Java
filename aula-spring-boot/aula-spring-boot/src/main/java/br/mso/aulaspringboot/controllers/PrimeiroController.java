package br.mso.aulaspringboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {
  
  // Não posso ter um método com o mesmo nome, mas as urls podem ser iguais
  
  @GetMapping(path = "/ola")
  public String ola() {
    return "Boa noite pessoal! Aula de Spring Boot!";
  }
  
  @PostMapping(path = "/ola2")
  public String saudacao() {
    return "Rota em método POST";
  }
}
