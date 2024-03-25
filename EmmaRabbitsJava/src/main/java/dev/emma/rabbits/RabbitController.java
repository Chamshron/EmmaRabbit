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

    @GetMapping("/{name}")
    public ResponseEntity<Optional<Rabbit>> getOneRabbit(@PathVariable String name){
        return new ResponseEntity<Optional<Rabbit>>(rabbitService.getOneRabbit(name), HttpStatus.OK);
    }


    //I want to update a True/False on whether I have obtained this specific figurine
    @PutMapping("/{name}")
    public ResponseEntity<Rabbit> updateOneRabbit(@PathVariable String name, @RequestBody Rabbit updatedRabbit){
        Rabbit existingRabbit = rabbitService.getRabbitByName(name);

        existingRabbit.setName(updatedRabbit.getName());
        existingRabbit.setOdds(updatedRabbit.getOdds());
    }

}
