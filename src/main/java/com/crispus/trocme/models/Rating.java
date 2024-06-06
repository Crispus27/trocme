package com.crispus.trocme.models;

import com.google.appengine.repackaged.org.joda.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Rating {
    private String ratingId;
    private Long raterUserId;
    private Long ratedUserId;
    private Integer ratingValue;
    private String comments;
    private LocalDateTime ratingDate;
    private Long ratedItemId;
    private String ratingType;
    private String ratingStatus;
}
