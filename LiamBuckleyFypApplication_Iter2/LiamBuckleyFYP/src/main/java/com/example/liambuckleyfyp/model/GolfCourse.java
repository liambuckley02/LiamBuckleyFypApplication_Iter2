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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Integer getHoles() {
        return holes;
    }

    public void setHoles(Integer holes) {
        this.holes = holes;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getGreenFee() {
        return greenFee;
    }

    public void setGreenFee(Double greenFee) {
        this.greenFee = greenFee;
    }
}