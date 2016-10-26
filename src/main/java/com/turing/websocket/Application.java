package com.turing.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Application {
	@RequestMapping("/")
	public String index(){
		System.out.println("启动了");
		return "socket.html";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
