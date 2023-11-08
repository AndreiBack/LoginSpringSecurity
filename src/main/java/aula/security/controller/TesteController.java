package aula.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TesteController {
    @GetMapping
    public String teste(){
        return "<h1> Teste Security </h1>";
    }
    @GetMapping("/livre")
    public String testeLivre(){
        return "<h2> Teste Livre </h2>";
    }

}
