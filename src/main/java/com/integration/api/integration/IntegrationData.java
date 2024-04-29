package com.integration.api.integration;

public record IntegrationData(
        String id,
        String dateRegister,
        String contact,
        String status,
        String halfFinisher,
        String error,
        String responsible) {
    public IntegrationData(Integration integration) {
        this(integration.getId(), integration.getDateRegister(), integration.getContact(), integration.getStatus(), integration.getHalfFinisher(), integration.getError(), integration.getResponsible());
    }
}
