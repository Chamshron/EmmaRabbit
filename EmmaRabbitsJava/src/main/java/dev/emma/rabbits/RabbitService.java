package dev.emma.rabbits;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RabbitService {
    private RabbitRepository rabbitRepository;
    public List<Rabbit> getAllRabbits(){
        return rabbitRepository.findAll();
    }
}
