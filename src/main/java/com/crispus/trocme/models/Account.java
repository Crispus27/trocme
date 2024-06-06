package com.crispus.trocme.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@Entity
public class Account extends AbstractModel{

}
