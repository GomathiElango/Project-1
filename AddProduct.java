package com.Maven.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddProduct {

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int pid;
	@Column
	String pname;
	@Column
	String brand;
	@Column
	int pprice;
	@Column
	String pdesc;
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname; 
	}

	public String getbrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

}