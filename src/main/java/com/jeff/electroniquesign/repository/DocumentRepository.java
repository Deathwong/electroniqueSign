package com.jeff.electroniquesign.repository;

import com.jeff.electroniquesign.domain.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
