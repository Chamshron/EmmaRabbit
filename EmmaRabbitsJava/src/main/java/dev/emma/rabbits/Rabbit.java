package dev.emma.rabbits;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="rabbits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rabbit {
    private ObjectId id;
    private String series;
    private String name;
    private String odds;


}
