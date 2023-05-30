package com.jeff.electroniquesign.repository;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeSignatureRepository extends JpaRepository<DemandeSignature, Long> {
}
