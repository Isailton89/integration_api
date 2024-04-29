package com.integration.api.integration;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Integration")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
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

    public Integration(RecordDataIntegration data) {
        this.id = data.id();
        this.dateRegister = data.dateRegister();
        this.contact = data.contact();
        this.status = data.status();
        this.halfFinisher = data.halfFinisher();
        this.error = data.error();
        this.responsible = data.responsible();
    }

    public void updateData(UpdateDataIntegration data) {
        if (data.responsible() != null) {
            this.responsible = data.responsible();
        }
        this.isIntegrated = data.isIntegrated();
    }
}
