package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@SpringBootApplication
@RestController
@RequestMapping("/test")
public class DemoApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {

			System.out.print("<<<<<<<<<<<<<Cleaning MongoDatabase>>>>>>>>>>>>>>");
			userRepository.deleteAll();

			User user;
			for(int i=0;i<=5;i++){
				user =	userRepository.save(new User(i,"Test",String.valueOf(i+12)));

				System.out.println("<<<<<<<<<<<<<Adding User >>>>>>>>>>>>>>");
				System.out.println("***"+user.toString()+"***");
			}

			System.out.println("<<<<<<<<<<<<<Get All  User >>>>>>>>>>>>>>");
			List<User> alluser=userRepository.findAll();
			alluser.forEach(item -> System.out.println(item));
			alluser.clear();

			System.out.println("<<<<<<<<<<<<<Find User By Name >>>>>>>>>>>>>>");
			alluser=userRepository.findByName("Test");
			alluser.forEach(item -> System.out.println(item));

			System.out.println("Executed");

		};
	}
}
