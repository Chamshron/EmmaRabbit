package dev.emma.rabbits;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="rabbits")
public class Rabbit {
    private ObjectId id;
    private String series;
    private String name;
    private String odds;

    public Rabbit(ObjectId id, String series, String name, String odds) {
        this.id = id;
        this.series = series;
        this.name = name;
        this.odds = odds;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }
}
