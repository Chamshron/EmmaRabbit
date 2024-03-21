package dev.emma.rabbits;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rabbits")
public class RabbitController {
    @Autowired
    private RabbitService rabbitService;
    @GetMapping
    public ResponseEntity<List<Rabbit>> getAllRabbits(){
        return new ResponseEntity<List<Rabbit>>(rabbitService.getAllRabbits(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Rabbit>> getOneRabbit(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Rabbit>>(rabbitService.getOneRabbit(id), HttpStatus.OK);
    }
}
