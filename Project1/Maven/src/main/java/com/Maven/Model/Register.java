package com.Maven.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Register 
{
	
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
@Column
int id;
@Column
String name;
@Column
String email;
@Column
String password;
@Transient
String confirmpassword;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public void setconfirmpassword(String confirmpassword)
{
	this.confirmpassword=confirmpassword;
	
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}


