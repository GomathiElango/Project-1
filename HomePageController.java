package com.Maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("HomePageController")
public class HomePageController {

	@RequestMapping(value="signup")
	public String register()
	{
		System.out.println("signup");
		return "signup";
	}
}
@Controller("AboutController")
class AboutController {

	@RequestMapping(value="about")
	public String details()
	{
		System.out.println("About");
		return "about";
	}
}

@Controller("ContactController")
 class ContactController {

	@RequestMapping(value="contact")
	public String address()
	{
		System.out.println("contact");
		return "contact";
	}
}

@Controller("LoginController")
class LoginController {

	@RequestMapping(value="login")
	public String account()
	{
		System.out.println("login");
		return "login";
	}
}


@Controller("ProductController")
class ProductController
{
	@RequestMapping(value="AddProduct")
	public String account()
	{
		System.out.println("AddProduct");
		return "AddProduct";
	}
}
