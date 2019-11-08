package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.ContactRepository;
import com.example.entities.Contact;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args)  {
		SpringApplication.run(Demo1Application.class, args);
	}

	
	  @Override public void run(String... args) throws Exception {
		  
		  DateFormat df = new SimpleDateFormat("dd/MM/yyy");
	  
		  //contactRepository.save(new Contact("Ali","Mohamed",df.parse("10/09/2019"),"raed@yahoo.com",(long)0606060606 ,"ali.jpg")); //long example  
		 //contactRepository.save(new Contact("mohammed", "raed", df.parse("12/4/1990"), "raed@gmail.com", 900008484L, "photo.png"));
		  //contactRepository.save(new Contact("Ali", "Tahani", df.parse("12/4/1990"), "raed@gmail.com", 900008484L, "photo.png"));
		  //contactRepository.save(new Contact("Sahar", "Omar", df.parse("12/4/1990"), "raed@gmail.com", 900008484L, "photo.png"));
					
 
		  
		  contactRepository.findAll().forEach(c ->{ 
			  System.out.println(c.getNom()); 
			  });
		  
	  }
	 
	 

}
