package com.jeff.electroniquesign.controler;

import com.jeff.electroniquesign.domain.dto.DemandeSignatureDto;
import com.jeff.electroniquesign.domain.response.ApiResponse;
import com.jeff.electroniquesign.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demandeSignature")
public class DemandeSignatureController {

    @PostMapping
    ResponseEntity<ApiResponse> creerDemandeSignature(@Validated @RequestBody DemandeSignatureDto demandeSignatureDto,
                                                      BindingResult bindingResult) {
        // Gestion des erreurs de validation
        if (bindingResult.hasErrors()) {
            throw new ConstraintViolationException(bindingResult);
        }
        
        String helloStephan = "Hello Stephan, How are you ?";
        return ResponseEntity.ok().body(new ApiResponse(helloStephan));
    }
}