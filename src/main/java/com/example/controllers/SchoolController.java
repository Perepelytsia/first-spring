package com.example.controllers;

/**
 *
 * @author sith
 */
import com.example.models.Student;
import com.example.repo.StudentRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SchoolController {
    
    final String studentId = "Eng2015001";
    
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/student")
    public String schoolMain(Model model) {
        this.getStudent(model);
        return "school-main";
    }
    
    @PostMapping("/student")
    public String schoolAdd(@RequestParam String name, @RequestParam int grade, Model model) {
        Student student = this.createStudent(name, grade);
        studentRepository.save(student);
        return "redirect:/student";
    }
    
    @GetMapping("/student/update")
    public String schoolUpdate(Model model) {
        this.getStudent(model);
        return "school-update";
    }
    
    private void getStudent(Model model)
    {
        Student student;
        // HGETALL Student:Eng2015001
        Optional<Student> wrapData = studentRepository.findById(this.studentId);
        if (wrapData.isPresent()) {
            student = wrapData.get();
        } else {
            student = this.createStudent("Bob", 8);
        }
        model.addAttribute("student", student);
    }
    
    private Student createStudent(String name, int grade)
    {
        return new Student(this.studentId, name, Student.Gender.MALE, grade);
    }
}
