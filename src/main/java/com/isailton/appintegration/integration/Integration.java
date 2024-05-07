package com.isailton.appintegration.integration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "integrations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Integration {
    @Id
    private String id;
    private String dateRegister;
    private String contact;
    private String status;
    private String halfFinisher;
    private String error;
    private String responsible;
    private boolean isIntegrated;
}
