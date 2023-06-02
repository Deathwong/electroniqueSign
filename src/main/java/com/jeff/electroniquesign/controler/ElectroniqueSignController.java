package com.jeff.electroniquesign.controler;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/electroniquesign")
@AllArgsConstructor
public class ElectroniqueSignController {


    @GetMapping("/demandesignature")
    String consulterDemandeSignature() {
        return "string";
    }
}
