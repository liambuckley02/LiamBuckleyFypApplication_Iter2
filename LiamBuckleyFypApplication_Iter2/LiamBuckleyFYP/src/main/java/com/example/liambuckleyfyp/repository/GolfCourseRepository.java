package com.example.liambuckleyfyp.repository;

import com.example.liambuckleyfyp.model.GolfCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GolfCourseRepository extends JpaRepository<GolfCourse, Long> {
}