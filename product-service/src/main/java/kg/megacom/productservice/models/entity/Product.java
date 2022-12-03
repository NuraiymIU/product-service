package kg.megacom.productservice.models.entity;

import kg.megacom.productservice.models.enums.Type;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Product")
public class Product {

    @Id
    private String model;

    private String maker;

    @Enumerated(EnumType.STRING)
    private Type type;
}
