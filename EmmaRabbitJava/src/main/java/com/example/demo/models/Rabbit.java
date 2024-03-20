package com.example.demo.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "rabbits")
public class Rabbit implements Serializable {
    @Column(name = "Emma Rabbit")
    private String name;

    @Column(name = "Dancing Party")
    private String theme;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity")
    private int quantity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Rabbit(String name, String theme, int price, int quantity){
        this.name = name;
        this.theme = theme;
        this.price = price;
        this.quantity = quantity;
    }

    public Rabbit(){

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void purchaseRabbit(){
        if (getQuantity() > 0){
            setQuantity(getQuantity()-1);
        }
        System.out.println("Sorry, out of stock!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
