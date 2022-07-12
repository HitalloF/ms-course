package com.devsuperior.hrworker.resources;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.services.WorkeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkeResource {


    private static Logger Logger = LoggerFactory.getLogger(WorkeResource.class);

    @Autowired
    private Environment env;


    @Autowired
    public WorkeService service;

    @GetMapping
    public List<Worker> listWorkes(){
       return this.service.listWorkes();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> listById(@PathVariable Long id){
        Logger.info("Port = " + env.getProperty("local.server.port"));
        return this.service.getById(id);
    }


}
