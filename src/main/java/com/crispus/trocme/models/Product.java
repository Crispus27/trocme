package com.crispus.trocme.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@Entity
public class Product extends AbstractModel{
    public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
    
    private String name;
    private Double price;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category categorises;

    @OneToMany(mappedBy = "product")
    private List<Favorite> favorites;

    @ManyToOne
    private Brand brands;

    @OneToMany(mappedBy = "product")
    private List<Rating> ratings;
}
