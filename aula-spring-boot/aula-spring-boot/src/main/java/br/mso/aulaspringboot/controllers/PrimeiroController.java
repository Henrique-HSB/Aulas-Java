package br.mso.aulaspringboot.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController{

    @RequestMapping
    public String ola(){
        return "Boa noite gente, borá estudar!!!";
    }
}
