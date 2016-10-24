package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.PersonDAOImple;
import com.spring.model.Person;

@Controller

public class PersonController {
	
	@Autowired
	private PersonDAOImple personDAOImple;
	@RequestMapping("/training")
	public String getAllPerson(Model model){
		List<Person> persons = personDAOImple.getPersons();
		model.addAttribute("personList", persons);
		return "personlist";
	}
	
}
