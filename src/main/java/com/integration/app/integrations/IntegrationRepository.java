package com.integration.app.integrations;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntegrationRepository extends JpaRepository<Integration, String> {
    List<Integration> findByPriority(String priority);
}

