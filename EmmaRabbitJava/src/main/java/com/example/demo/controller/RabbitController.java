package com.example.demo.controller;

import com.example.demo.models.Rabbit;
import com.example.demo.repository.RabbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RabbitController {
    @Autowired
    RabbitRepository rabbitRepository;

    @GetMapping(value = "/rabbits")
    public ResponseEntity<List<Rabbit>> getAllRabbits(){
        return new ResponseEntity<>(rabbitRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/rabbits/{id}")
    public ResponseEntity getRabbit(@PathVariable Long id){
        return new ResponseEntity<>(rabbitRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/rabbits")
    public ResponseEntity<Rabbit> postPirate(@RequestBody Rabbit rabbit){
        rabbitRepository.save(rabbit);
        return new ResponseEntity<>(rabbit, HttpStatus.OK);
    }
}
