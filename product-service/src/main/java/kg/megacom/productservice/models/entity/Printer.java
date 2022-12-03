package kg.megacom.productservice.models.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "Printer")
public class Printer {

    @Id
    private int code;

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;

    private String color;
    private String type;
    private double price;

}
