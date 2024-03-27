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
    private  RabbitRepository rabbitRepository;
    @GetMapping
    public ResponseEntity<List<Rabbit>> getAllRabbits(){
        return new ResponseEntity<List<Rabbit>>(rabbitService.getAllRabbits(), HttpStatus.OK);
    }

    @GetMapping("/{ObjectId}")
    public ResponseEntity<Optional<Rabbit>> getOneRabbit(@PathVariable String name){
        return new ResponseEntity<Optional<Rabbit>>(rabbitService.getOneRabbit(name), HttpStatus.OK);
    }


    //I want to update a True/False on whether I have obtained this specific figurine, update no other values. This code needs to be improved as it is erroring for no obvious reason
    @PutMapping("/{ObjectId}")
    public ResponseEntity<Optional<Rabbit>> updateOwnedRabbit (@PathVariable String name, @RequestBody Rabbit updatedRabbit){
        Optional<Rabbit> existingRabbitOptional = rabbitService.getOneRabbit(name);

        if(existingRabbitOptional.isPresent()){
            Rabbit existingRabbit = existingRabbitOptional.get();
            existingRabbit.setOwned(updatedRabbit.getOwned());
            existingRabbit.setOdds(existingRabbit.getOdds());
            existingRabbit.setName(existingRabbit.getName());
            existingRabbit.setSeries(existingRabbit.getSeries());
            existingRabbit.setId(existingRabbit.getId());

            return new ResponseEntity<Optional<Rabbit>>(Optional.of(existingRabbit), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }



    }

}
