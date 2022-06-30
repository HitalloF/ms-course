package com.devsuperior.hrworker.services;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkeService {

    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> listWorkes(){
        return this.workerRepository.findAll();
    }

    public ResponseEntity<Worker> getById(Long id){
        Optional<Worker> workerId = this.workerRepository.findById(id);
        if(workerId.isPresent()){
            return new ResponseEntity<Worker>(workerId.get(), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
