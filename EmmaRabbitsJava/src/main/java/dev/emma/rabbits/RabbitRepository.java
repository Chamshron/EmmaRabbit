package dev.emma.rabbits;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface RabbitRepository extends MongoRepository<Rabbit, ObjectId> {
    Optional<Rabbit> findRabbitByName(String name);
}
