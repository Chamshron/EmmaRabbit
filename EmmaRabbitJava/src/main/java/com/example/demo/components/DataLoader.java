package com.example.demo.components;

import com.example.demo.models.Rabbit;
import com.example.demo.repository.RabbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT when tests
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    RabbitRepository rabbitRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Rabbit forest = new Rabbit("Secret Forest", "Garden Date", 15, 5);
        rabbitRepository.save(forest);

        Rabbit persimmon = new Rabbit("Secret Forest Wishful Persimmon", "Limited Edition", 33, 2);
        rabbitRepository.save(persimmon);

    }
}
