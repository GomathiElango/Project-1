package com.Maven.controller;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

		
	import com.Maven.DAO.AddProductDAO;
	import com.Maven.Model.AddProduct;
	

	@Controller("addproductcontroller")
	public class AddProductController 
	{
		
		@Autowired
		AddProductDAO adao;
		
		
			

		@RequestMapping(value="AddProduct", method=RequestMethod.GET)
		public ModelAndView getLogin(@ModelAttribute("AddProduct")AddProduct addproduct)
		{
				System.out.println("AddProduct");
				ModelAndView model=new ModelAndView("AddProduct");
				return model;
		}
		
		
		@RequestMapping(value="AddProduct", method=RequestMethod.POST)
		public ModelAndView Success(AddProduct add, Model m)
		{
				adao.addpro(add);
				ModelAndView model=new ModelAndView("ViewProduct","AddProduct", new AddProduct());
				return model;
		}
			
	}
		

