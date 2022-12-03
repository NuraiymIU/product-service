package kg.megacom.productservice.models.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "Laptop")
public class Laptop {

    @Id
    private int code;

    @ManyToOne
    @JoinColumn(name="model")
    private Product product;

    private int speed;
    private int ram;
    private double hd;
    private double price;
    private int screen;

}
