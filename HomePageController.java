package com.Maven.controller;
import org.springframework.stereotype.Controller;



	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller("HomePageController")

	public class HomePageController {

	@RequestMapping(value="Register")
	public String account()  
	{
		System.out.println("Register");
		return "Register";
	}

			@RequestMapping(value="AboutUs")
			public String details1()  
			{
				System.out.println("AboutUs");
				return "AboutUs";
			}

		@RequestMapping(value="contact")
		public String Contact()  
		{
			System.out.println("contact");
			return "contact";
		}
		
			@RequestMapping(value="login")
			public String log()  
			{
				System.out.println("login");
				return "login";
			}

	
			@RequestMapping(value="AdminLogin")
			public String details11()  
			{
				System.out.println("AdminLogin");
				return "AdminLogin";
			}

			@RequestMapping(value="AddProduct")
			public String details()  
			{
				System.out.println("AddProduct");
				return "AddProduct";
			}
	}
	

