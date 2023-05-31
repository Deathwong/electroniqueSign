package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public record UtilisateurDto(

        @NotEmpty
        @Size(max = 50, min = 3)
        String nom,

        @NotEmpty
        @Size(max = 50, min = 3)
        String prenom,

        @NotEmpty
        @Email
        @Size(max = 255, min = 5)
        String email,

        @NotEmpty
        @Size(max = 255, min = 5)
        String motDePasse,

        @NotNull
        List<DemandeSignature> DemandeSignatures
) {
}
