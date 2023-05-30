package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.CodeSignature;
import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import com.jeff.electroniquesign.domain.entity.Signature;
import jakarta.validation.constraints.*;

import java.util.List;

public record SignataireDto(

        @NotEmpty
        @Min(value = 3)
        @Max(value = 50)
        String nom,

        @NotEmpty
        @Min(value = 3)
        @Max(value = 50)
        String prenom,

        @NotEmpty
        @Email
        @Min(value = 5)
        @Max(value = 255)
        String email,

        @NotEmpty
        @Max(value = 20)
        @Pattern(regexp = """
                /\\b0[1-9](?:[-.\\s]?\\d{2}){4}\\b|\\b0[1-9](?:[-.\\s]?\\d{8})\\b|\\b0[1-9](?:[-.\\s]?\\d{1}[-.\\s]
                 ?\\d{2}){3}\\b
                 /gm""")
        String telephone,

        @NotNull
        List<Signature> signatures,

        @NotNull
        List<CodeSignature> codeSignatures,

        @NotNull
        List<DemandeSignature> DemandeSignatures
) {
}
