package com.integration.app.integrations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("integration")
public class IntegrationController {
    @Autowired
    private IntegrationRepository repository;

    @GetMapping("/list-integration")
    public List<Integration> list() {
        return this.repository.findAll();
    }

    @PostMapping("/add-integration")
    @Transactional
    public Integration create(@RequestBody Integration integration) {
        return this.repository.save(integration);
    }
}
