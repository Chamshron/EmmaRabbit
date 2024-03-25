package dev.emma.rabbits;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ObjectInput;
import java.util.List;
import java.util.Optional;

@Service
public class RabbitService {
    @Autowired
    private RabbitRepository rabbitRepository;
    public List<Rabbit> getAllRabbits(){
        return rabbitRepository.findAll();
    }

    public Optional<Rabbit> getOneRabbit(String name){
        return rabbitRepository.findRabbitByName(name);
    };

    public Rabbit getRabbitByName(String name){ return rabbitRepository.findByNameRabbit(name);};
}
