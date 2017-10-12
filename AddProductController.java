package com.Maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Maven.DAO.AddProductDAO;
import com.Maven.Model.AddProduct;
@Controller
public class AddProductController {
	

	    @Autowired
	    AddProductDAO pdao;
	   
	   
	              

	    @RequestMapping(value="AddProduct", method=RequestMethod.GET)
	    public ModelAndView getLogin(@ModelAttribute("AddProduct")AddProduct Addproduct)
	    {
	                          System.out.println("AddProduct");
	                          ModelAndView model=new ModelAndView("AddProduct");
	                          return model;
	    }
	   
	   
	    @RequestMapping(value="AddProduct", method=RequestMethod.POST)
	    public ModelAndView Success(AddProduct add, Model m)
	    {
	                          pdao.addpro(add);
	                          ModelAndView model=new ModelAndView("View","AddProduct", new AddProduct());
	                          return model;
	    }
	              



@RequestMapping(value="View")
public ModelAndView listOfTeams() {
 //AddProduct addp=new AddProduct();
    ModelAndView modelAndView = new ModelAndView("View");
     	        List<AddProduct> teams = pdao.getProducts();
     	        System.out.println("obj*******:"+teams);
    modelAndView.addObject("lists", teams);
    	        return modelAndView;
}

@RequestMapping("edit/{pid}")  
public ModelAndView editUser(@PathVariable int pid) {  
 AddProduct apobj = pdao.single_object(pid);  
 return new ModelAndView("edit", "command",apobj );  
}  

@RequestMapping(value="edit/update",method=RequestMethod.POST)  
public ModelAndView updateUser(@ModelAttribute("apobj") AddProduct adp) {  
 pdao.edit_list(adp);  
 return new ModelAndView("editsuccess");  
}  

@RequestMapping(value="/delete/{pid}",method=RequestMethod.POST)  
public ModelAndView deleteUser(@PathVariable int pid) {  
 pdao.deleteRow(pid);  
 return new ModelAndView("View");  
} 
}