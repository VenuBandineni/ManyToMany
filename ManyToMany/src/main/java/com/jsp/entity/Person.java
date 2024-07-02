package com.jsp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int personid;
 private String name;
 private String emailid;
 private String password;
 @ManyToMany(cascade = CascadeType.ALL)
 private List<Mobile> mobiles;
 public Person() {
	// TODO Auto-generated constructor stub
}
public Person(int personid, String name, String emailid, String password, List<Mobile> mobiles) {
	super();
	this.personid = personid;
	this.name = name;
	this.emailid = emailid;
	this.password = password;
	
	this.mobiles = mobiles;
}
public int getPersonid() {
	return personid;
}
public void setPersonid(int personid) {
	this.personid = personid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Mobile> getMobiles() {
	return mobiles;
}
public void setMobiles(List<Mobile> mobiles) {
	this.mobiles = mobiles;
}
@Override
public String toString() {
	return "Person [personid=" + personid + ", name=" + name + ", emailid=" + emailid + ", password=" + password
			+ ", mobiles=" + mobiles + "]";
}
 
}
