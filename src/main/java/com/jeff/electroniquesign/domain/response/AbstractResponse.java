package com.jeff.electroniquesign.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AbstractResponse {
    private Integer statut;
    private Instant date;
    private String message;
}
