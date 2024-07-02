package com.jsp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int mobileid;
private String mobilename;
private double mobileprice;
@ManyToMany(cascade =CascadeType.ALL)
private List<Person> persons;
public Mobile() {
	// TODO Auto-generated constructor stub
}
public Mobile(int mobileid, String mobilename, double mobileprice, List<Person> persons) {
	super();
	this.mobileid = mobileid;
	this.mobilename = mobilename;
	this.mobileprice = mobileprice;
	this.persons = persons;
}
public int getMobileid() {
	return mobileid;
}
public void setMobileid(int mobileid) {
	this.mobileid = mobileid;
}
public String getMobilename() {
	return mobilename;
}
public void setMobilename(String mobilename) {
	this.mobilename = mobilename;
}
public double getMobileprice() {
	return mobileprice;
}
public void setMobileprice(double mobileprice) {
	this.mobileprice = mobileprice;
}
public List<Person> getPersons() {
	return persons;
}
public void setPersons(List<Person> persons) {
	this.persons = persons;
}
@Override
public String toString() {
	return "Mobile [mobileid=" + mobileid + ", mobilename=" + mobilename + ", mobileprice=" + mobileprice + ", persons="
			+ persons + "]";
}

}
