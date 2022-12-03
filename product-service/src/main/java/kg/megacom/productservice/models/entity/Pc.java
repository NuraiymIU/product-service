package kg.megacom.productservice.models.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "PC")
public class Pc {

    @Id
    private int code;

    @ManyToOne
    @JoinColumn(name="model")
    private Product product;

    private int speed;
    private int ram;
    private double hd;
    private String cd;
    private double price;
}
