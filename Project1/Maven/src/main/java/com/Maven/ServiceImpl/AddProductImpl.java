package com.Maven.ServiceImpl;

import org.hibernate.Transaction;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Maven.Model.AddProduct;
import com.Maven.DAO.AddProductDAO;

@Service
public class AddProductImpl implements AddProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	

	public void addpro(AddProduct pro) {
		//System.out.println("Product DAO");
		//System.out.println(pro.getpname());
		//UserCredential uc=new UserCredential();
		//uc.setUsername(r.getUsername());
		//uc.setPassword(r.getPassword());
		
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(pro);
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


		public List<AddProduct> getProducts() {
	    	Session session =sessionFactory.openSession();
	    	 Transaction transaction =  session.beginTransaction();
	    	List<AddProduct> productList=null;
 	        try {
 	        productList= session.createQuery("from AddProduct").list();
      	    transaction.commit();                 
           }
          catch (Exception e) {
          transaction.rollback();
          e.printStackTrace();
	       }
 	       session.flush();
 	     session.close();
 	     System.out.println("********"+productList);
		 return productList;
	    }



public void edit_list(AddProduct adp){
	   Session session =sessionFactory.openSession();
	  // System.out.println("edit session"+session);
 	 Transaction transaction =  session.beginTransaction();
 	List<AddProduct> editlist=null;
    try {
	    //int id=adp.getpid();
    	   int pid=adp.getPid();
	   // System.out.println("id******"+id);
        editlist=  session.createQuery("from AddProduct where pid=:pid").setParameter("pid",pid).list();
	    System.out.println("editlist *********"+editlist);
        		     		       
        editlist.get(0).setPid(adp.getPid());
        editlist.get(0).setPname(adp.getPname());
        editlist.get(0).setPdesc(adp.getPdesc());
        editlist.get(0).setPprice(adp.getPprice());
        editlist.get(0).setAvail(adp.getAvail());
        editlist.get(0).setBrand(adp.getBrand());

        session.saveOrUpdate(editlist.get(0));
        transaction.commit();
       }
    catch (Exception e) {
        transaction.rollback();
        e.printStackTrace();
	       }  
      session.close();
 }

public AddProduct single_object(int pid)
{
   Session session =sessionFactory.openSession();
  // System.out.println("single object session"+session);
   Transaction transaction =  session.beginTransaction();
   List<AddProduct> b4=null;
 	try
     {
 	//String query=.list();
 	//System.out.println(query);
     b4 =  session.createQuery("from AddProduct where pid= :pid").setParameter("pid",pid).list();
    System.out.println("*****"+b4.get(0));
     transaction.commit();
     session.close();
                 
 }        
 catch (Exception e) 
 {
    transaction.rollback();
    e.printStackTrace();
 }
    return b4.get(0);
}



public void deleteRow(int pid) {  
	   Session session =sessionFactory.openSession();
	   Transaction transaction =  session.beginTransaction();
    List<AddProduct> del=null;
    try{
 	 del=session.createQuery("from AddProduct where pid=:pid").setParameter("pid", pid).list();
       session.delete(del.get(0));
       transaction.commit();
       session.close();
  
    }
catch(Exception e){
   transaction.rollback();
   e.printStackTrace();
}
}
}