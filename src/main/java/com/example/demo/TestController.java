package com.example.demo;

import model.Personne;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class TestController {

    // 1. @RequestParam
    @GetMapping("/bonjour")
    public String bonjour(@RequestParam String nom) {
        return "Bonjour " + nom + "!";
    }

    // 2. @PathVariable
    @GetMapping("/bonjour/{nom}")
    public String bonjourPath(@PathVariable String nom) {
        return "Bonjour " + nom + "finoana";
    }

    // 3. @RequestBody
    @PostMapping("/personne")
    public String ajouterPersonne(@RequestBody Personne p) {
        return "Nom: " + p.getNom() + ", Age: " + p.getAge();
    }

    // 4. @RequestHeader
    @GetMapping("/header")
    public String lireHeader(@RequestHeader("User-Agent") String agent) {
        return "Votre navigateur est: " + agent;
    }

    // BONUS : HttpServletRequest
    @GetMapping("/request")
    public String request(HttpServletRequest request) {
        String agent = request.getHeader("User-Agent");
        return "Agent: " + agent;
    }
    @GetMapping ("/test")
    public String test (@RequestParam String noma){
        return "bonjour finoana" ;
    }
}
