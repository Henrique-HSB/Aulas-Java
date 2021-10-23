package br.mso.aulaspringboot.controllers;

import br.mso.aulaspringboot.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  
  // localhost:8080/clientes/qualquer
  @GetMapping(path = "/qualquer")
  public Cliente obterCliente() {
    
    return new Cliente(3, "Maria Silva", "123.456.789-00");
  }
  
  // localhost:8080/clientes/2
  @GetMapping("/{id}")
  public Cliente obterClientePorId(@PathVariable int id) {
    return new Cliente(id, "Ana", "111.222.333-00");
  }
  
  // localhost:8080/clientes
  @GetMapping
  public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
    return new Cliente(id, "Joao", "888.888.888-99");
  }
}
