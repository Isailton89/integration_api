package com.integration.app.integrations;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntegrationRepository extends JpaRepository<Integration, String> {
    Page<IntegrationList> findByPriority(String priority, Pageable pageable);
}

