package com.crispus.trocme.models;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@Entity
public class Brand extends AbstractModel{
    private String name;
    private String category;
    private String descriptions;

}
