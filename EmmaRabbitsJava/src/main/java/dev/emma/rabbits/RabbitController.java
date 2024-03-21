package dev.emma.rabbits;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rabbits")
public class RabbitController {
    @GetMapping
    public ResponseEntity<String> getAllRabbits(){
        return new ResponseEntity<String>("all the rabbits", HttpStatus.OK);
    }
}
