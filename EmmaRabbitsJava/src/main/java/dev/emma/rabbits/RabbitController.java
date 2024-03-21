package dev.emma.rabbits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rabbits")
public class RabbitController {
    @Autowired
    private RabbitService rabbitService;
    @GetMapping
    public ResponseEntity<List<Rabbit>> getAllRabbits(){
        return new ResponseEntity<List<Rabbit>>(rabbitService.getAllRabbits(), HttpStatus.OK);
    }
}
