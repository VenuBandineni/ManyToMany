package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Mobile;
import com.jsp.entity.Person;
@Component
public class DaoImpl  implements Dao{

	@Autowired
	EntityManagerFactory factory;
	@Autowired
	EntityManager manager;
	@Autowired
	EntityTransaction transaction;
	@Override
	public void insertPersonDetails() {
		
		transaction.begin();
		Person person=new Person();
		person.setName("venu");
		person.setEmailid("venu@gmail.com");
		person.setPassword("12345");
		
		
		
		Person person1=new Person();
		person1.setName("venu omesh");
		person1.setEmailid("venuomesh@gmail.com");
		person1.setPassword("14353");
		
		
		Mobile mobile=new Mobile();
		mobile.setMobilename("vivo");
		mobile.setMobileprice(23000);
		
		
		Mobile mobile1=new Mobile();
		mobile1.setMobilename("vivoY31");
		mobile1.setMobileprice(25000);
		
		
		List<Person> p=new ArrayList<Person>();
		p.add(person);
		p.add(person1);
		
		List<Mobile> mb=new ArrayList<Mobile>();
		mb.add(mobile);
		mb.add(mobile1);
		
		person.setMobiles(mb);
		manager.persist(person);
		manager.persist(person1);
		
		mobile.setPersons(p);
		
		
		System.out.println("Inserted ");
		
		transaction.commit();
		
		manager.close();
		factory.close();
		
	}

}
