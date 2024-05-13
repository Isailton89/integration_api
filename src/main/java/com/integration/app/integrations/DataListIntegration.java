package com.integration.app.integrations;

public record DataListIntegration(String id, String dateRegister, String contact, String status, String halfFinisher, String error, String responsible, boolean isIntegrated, String priority) {

    public DataListIntegration(Integration integration) {
        this(integration.getId(), integration.getDateRegister(), integration.getContact(), integration.getStatus(), integration.getHalfFinisher(), integration.getError(), integration.getResponsible(), integration.isIntegrated(), integration.getPriority());
    }
}
