package io.tutorial.spring.garageApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
     public enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW
    }

    @Id
    private Long id;
    private String model;
    private String brand;

    @Column(name = "released_year")
    private int year;
    private Color color;

    public Car() {}
    public Car(Long id, String model, String brand, int year, Color color) {
        super();
        this.model = model;
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
