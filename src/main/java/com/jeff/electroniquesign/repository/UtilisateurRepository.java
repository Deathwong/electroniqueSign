package com.jeff.electroniquesign.repository;

import com.jeff.electroniquesign.domain.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
