package com.jeff.electroniquesign.controler;

import com.jeff.electroniquesign.domain.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demandeSignature")
public class DemandeSignatureController {

    @PostMapping
    ResponseEntity<ApiResponse> creerDemandeSignature() {
        String helloStephan = "Hello Stephan, How are you ?";
        return ResponseEntity.ok().body(new ApiResponse(helloStephan));
    }
}
