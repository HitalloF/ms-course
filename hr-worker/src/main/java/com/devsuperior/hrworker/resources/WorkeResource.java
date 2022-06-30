package com.devsuperior.hrworker.resources;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.services.WorkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkeResource {

    @Autowired
    public WorkeService service;

    @GetMapping
    public List<Worker> listWorkes(){
       return this.service.listWorkes();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> listById(@PathVariable Long id){
        return this.service.getById(id);
    }


}
