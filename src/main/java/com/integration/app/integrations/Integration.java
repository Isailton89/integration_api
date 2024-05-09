package com.integration.app.integrations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String priority;

    public void updateIntegration(IntegrationUpdateData data) {
        this.isIntegrated = data.isIntegrated();
        this.responsible = data.responsible();
    }
}
