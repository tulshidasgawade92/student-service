package com.microservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public String getStudents(@PathVariable String schoolname) {
   
        return "Tulshidas";
    }
	
	@RequestMapping(value="/zuulTest", method=RequestMethod.GET)
	public String zuulTest() {
		return "zuulTest";
	}
}
