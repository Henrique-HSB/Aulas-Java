package br.mso.aulaspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

  @GetMapping("/somar")
  public int somar(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
    return a + b;
  }
  
  @GetMapping("/subtrair")
  public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
    return a - b;
  }
}
