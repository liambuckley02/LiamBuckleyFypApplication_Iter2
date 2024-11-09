// `src/main/java/com/example/liambuckleyfyp/model/GolfCourse.java`
package com.example.liambuckleyfyp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;


@Entity
@Table(name = "golfcourse")
public class GolfCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    private String description;

    @Column(nullable = false)
    private String contactInfo;

    private Integer holes;

    private Double rating;

    private Double greenFee;

    // Getters and setters
}