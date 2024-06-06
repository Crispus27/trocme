package com.crispus.trocme.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Entity

public class Category  extends AbstractModel{
    private String name;
    private String descriptions;
}
