package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.Person;

@Repository
public class PersonDAOImple implements PersonDAO{
	
	List<Person> persons;
	
	public PersonDAOImple() {
		persons = new ArrayList<Person>();
		Person person = new Person();
		person.setId(101);
		person.setFirstName("Jitendra");
		person.setLastName("Trivedia");
		person.setContactNumber(89836276);
		person.setAddress("pune");
		person.setAdhaarNo(12345);
		
		persons.add(person);
		
		Person person1 = new Person();
		person1.setId(102);
		person1.setFirstName("Jiten");
		person1.setLastName("Triia");
		person1.setContactNumber(89836276);
		person1.setAddress("pune");
		person1.setAdhaarNo(12345);
		
		persons.add(person1);
		
		Person person2 = new Person();
		person2.setId(101);
		person2.setFirstName("Jitendra");
		person2.setLastName("Trivedia");
		person2.setContactNumber(89836276);
		person2.setAddress("pune");
		person2.setAdhaarNo(12345);
		
		persons.add(person2);
		}
	
	@Override
	public Person getPersonByID(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPersons() {
		return persons;
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		
	}

}
