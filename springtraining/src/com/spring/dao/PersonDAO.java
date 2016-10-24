package com.spring.dao;

import java.util.List;

import com.spring.model.Person;

public interface PersonDAO {
	public Person getPersonByID(int personId);
	public List<Person> getPersons();
	public void addPerson(Person person);
	public void deletePerson(int personId);
}
