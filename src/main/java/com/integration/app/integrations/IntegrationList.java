package com.integration.app.integrations;

public record IntegrationList(
        String id,
        String status,
        String halfFinisher,
        String error,
        String priority) {
    public IntegrationList(Integration integration) {
        this(integration.getId(), integration.getStatus(), integration.getHalfFinisher(), integration.getError(), integration.getPriority());
    }
}
