package com.melissa.cursomichellibrito.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

//Anotações para que essa classe seja uma entidade no banco de dados:
@Entity
@Table(name = "TB-PRODUCTS")

public class ProductModel extends RepresentationModel implements Serializable {
    private static final long serialVerisonUID = 1L;
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;
    
    
    public UUID getIdProduct() {
        return idProduct;
    }
    
    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public BigDecimal getValue() {
        return value;
    }
    
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
