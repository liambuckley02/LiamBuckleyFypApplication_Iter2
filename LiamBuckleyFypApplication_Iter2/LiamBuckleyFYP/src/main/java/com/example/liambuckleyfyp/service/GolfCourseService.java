package com.example.liambuckleyfyp.service;

import com.example.liambuckleyfyp.model.GolfCourse;
import com.example.liambuckleyfyp.repository.GolfCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GolfCourseService {

    @Autowired
    private GolfCourseRepository golfCourseRepository;

    public List<GolfCourse> getAllGolfCourses() {
        return golfCourseRepository.findAll();
    }

    public GolfCourse getGolfCourseById(Long id) {
        return golfCourseRepository.findById(id).orElse(null);
    }

    public GolfCourse saveGolfCourse(GolfCourse golfCourse) {
        return golfCourseRepository.save(golfCourse);
    }

    public void deleteGolfCourse(Long id) {
        golfCourseRepository.deleteById(id);
    }
}