package com.integration.api.integration;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "integration")
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
