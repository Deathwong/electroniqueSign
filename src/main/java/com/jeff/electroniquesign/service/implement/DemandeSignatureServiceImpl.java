package com.jeff.electroniquesign.service.implement;

import com.jeff.electroniquesign.repository.DemandeSignatureRepository;
import com.jeff.electroniquesign.service.DemandeSignatureService;
import com.jeff.electroniquesign.utils.Constant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
@AllArgsConstructor
public class DemandeSignatureServiceImpl implements DemandeSignatureService {

    private final DemandeSignatureRepository demandeSignatureRepository;

    public void creerDemandeSignature(Long idUtilisateur, Long idSignataire) {

        String statut = Constant.OK_STATUT_EN_ATTENTE_MESSAGE;
        Instant dateDemande = Instant.now();
        LocalDate dateExpiration = dateDemande.atZone(ZoneId.systemDefault()).toLocalDate();
    }
}