package dev.emma.rabbits;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RabbitRepository extends MongoRepository<Rabbit, ObjectId> {
}
