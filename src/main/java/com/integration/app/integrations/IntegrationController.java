package com.integration.app.integrations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping("/list-integration-filter")
    public Page<IntegrationList> listPriority(@RequestParam("priority") String priority, @PageableDefault(size = 5) Pageable pageable) {
        return repository.findByPriority(priority, pageable);
    }

    @PostMapping("/add-integration")
    @Transactional
    public List<Integration> create(@RequestBody List<Integration> integrations) {
        return this.repository.saveAll(integrations);
    }

    @PutMapping("/update-integration")
    @Transactional
    public void updateCard(@RequestBody IntegrationUpdateData data) {
        var integration = repository.getReferenceById(data.id());
        integration.updateIntegration(data);
    }

    @DeleteMapping("/delete-integration/{id}")
    @Transactional
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
