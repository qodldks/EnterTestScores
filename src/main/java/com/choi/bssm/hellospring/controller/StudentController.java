package com.choi.bssm.hellospring.controller;

import com.choi.bssm.hellospring.domain.Student;
import com.choi.bssm.hellospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping("/students/new")
    public String createForm(){
        return "students/createStudentForm";
    }

    @PostMapping("/students/newew")
    public String create(StudentForm form){
        Student student = new Student();
        student.setId(form.getId());
        student.setName(form.getName());

        service.edit(student);
        return "redirect:/";
    }
}
