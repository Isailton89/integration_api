package com.integration.api.controller;

import com.integration.api.integration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("integration")
public class IntegrationController {
    @Autowired
    private IntegrationRepository repository;

    @GetMapping("find-all")
    public List<IntegrationData> viewIntegration(){
        return repository.findAll().stream().map(IntegrationData::new).toList();
    }

    @PostMapping("update-table")
    @Transactional
    public void register(@RequestBody List<RecordDataIntegration> dataList) {
        for (RecordDataIntegration data : dataList) {
            Integration newIntegration = new Integration(data);
            repository.save(newIntegration);
        }
    }

    @PutMapping("{id}")
    @Transactional
    public void updateTicket(@PathVariable String id,@RequestBody UpdateDataIntegration data) {
        var ticket = repository.getReferenceById(id);
        ticket.updateData(data);
    }
}
