package com.Maven.ServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Maven.DAO.AddProductDAO;
import com.Maven.Model.AddProduct;


@Service
public class AddProductImpl implements AddProductDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public void addpro(AddProduct add)
	{
		System.out.println("AddProduct DAO");
		System.out.println(add.getPname());
		//UserCredential uc=new UserCredential();
		//uc.setUsername(r.getUsername());
		//uc.setPassword(r.getPassword());
		
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(add);
		//session.save(uc);
		tx.commit();
		session.flush();
		session.close();
		} 
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}		
	}
	public void editpro(int i) {
		// TODO Auto-generated method stub
		
	}
	public void delpro(int i) {
		// TODO Auto-generated method stub
		
	}
	public void showpro() {
		// TODO Auto-generated method stub
		
	}
	
}