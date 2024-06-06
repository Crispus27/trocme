package com.crispus.trocme.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.google.appengine.repackaged.org.joda.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractModel {
    @Id
    @GeneratedValue
    private Integer id;


    @CreatedDate
    @Column(
            name = "createDate",
            nullable = false,
            updatable = false
    )
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(name = "lastModifiedDate")
    private LocalDateTime lastUpdated;
}
