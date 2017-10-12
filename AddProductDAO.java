package com.Maven.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Maven.Model.AddProduct;

@Service("addproductDAO")
public interface AddProductDAO {
	public void addpro(AddProduct a);
	public void editpro(int i);
	public void delpro(int i);
	public void showpro();
	public List<AddProduct> getProducts();
	public AddProduct single_object(int pid);
	public void edit_list(AddProduct adp);
	public void deleteRow(int pid);

	

}
