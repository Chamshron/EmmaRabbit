package dev.emma.rabbits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RabbitService {
    @Autowired
    private RabbitRepository rabbitRepository;
    public List<Rabbit> getAllRabbits(){
        return rabbitRepository.findAll();
    }
}
