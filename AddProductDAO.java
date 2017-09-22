package com.Maven.DAO;

import org.springframework.stereotype.Service;

import com.Maven.Model.AddProduct;

@Service("AddProductDAO")
public interface AddProductDAO {
	public void addpro(AddProduct r);
	public void editpro(int i);
	public void delpro(int i);
	public void showpro();

}