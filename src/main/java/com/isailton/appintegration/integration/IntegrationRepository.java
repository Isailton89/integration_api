package com.isailton.appintegration.integration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegrationRepository extends JpaRepository<Integration, String> {
}