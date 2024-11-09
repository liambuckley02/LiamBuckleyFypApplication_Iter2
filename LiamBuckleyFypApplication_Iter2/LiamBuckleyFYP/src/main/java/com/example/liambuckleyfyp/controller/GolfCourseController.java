// `src/main/java/com/example/liambuckleyfyp/controller/GolfCourseController.java`
// `src/main/java/com/example/liambuckleyfyp/controller/GolfCourseController.java`
package com.example.liambuckleyfyp.controller;
import jakarta.servlet.http.HttpSession;
import com.example.liambuckleyfyp.model.GolfCourse;
import com.example.liambuckleyfyp.service.GolfCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GolfCourseController {

    @Autowired
    private GolfCourseService golfCourseService;

    @GetMapping("/golfcourses")
    public String getAllGolfCourses(Model model, HttpSession session) {
        List<GolfCourse> golfCourses = golfCourseService.getAllGolfCourses();
        model.addAttribute("golfCourses", golfCourses);
        String userLogin = (String) session.getAttribute("userLogin");
        model.addAttribute("userLogin", userLogin);
        return "golfcourse_list";
    }
}