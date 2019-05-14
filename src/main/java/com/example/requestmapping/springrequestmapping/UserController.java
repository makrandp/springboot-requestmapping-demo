package com.example.requestmapping.springrequestmapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/")
	public String index()
	{
		return "Hello User From Index!";
	}
	
	@RequestMapping("/hello")
	public String helloUser()
	{
		return "Hello, User!";
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public String displayUserId(@PathVariable("id") int id)
	{
		return "User Id : " + id;
	}
	
	@GetMapping("hello/{name}")
	public String displayUserName(@PathVariable("name") String name)
	{
		return "Hello, " + name;
	}
	
	@GetMapping("/city")
	public String displayUserCount(@RequestParam("city") String city)
	{
		return "User's city is " + city;
	}
}
