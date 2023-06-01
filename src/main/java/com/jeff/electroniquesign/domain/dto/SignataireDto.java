package com.jeff.electroniquesign.domain.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public record SignataireDto(

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
        @Size(max = 20)
        @Pattern(regexp = "\\b(?:\\+?\\d{1,3}[-.\\s]?)?(?:\\(?)0[67]\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\b")
        String telephone,

        List<@Valid SignatureDto> signatures,

        List<@Valid CodeSignatureDto> codeSignatures,

        List<@Valid DemandeSignatureDto> DemandeSignatures
) {
}
