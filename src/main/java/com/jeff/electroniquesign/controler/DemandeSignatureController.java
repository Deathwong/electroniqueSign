package com.jeff.electroniquesign.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demandesignature")
public class DemandeSignatureController {

    @GetMapping
    String creerDemandeSignature() {
        return "Hello Stephan";
    }
}
