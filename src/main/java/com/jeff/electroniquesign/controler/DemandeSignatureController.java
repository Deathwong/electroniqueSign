package com.jeff.electroniquesign.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/electroniquesign")
public class DemandeSignatureController {

    @GetMapping("/demandesignature")
    String consulterDemandeSignature() {
        return "Hello Stephan";
    }
}
