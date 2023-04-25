package edu.kh.comm.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	/*
	 * http://localhost/8080/comm/main <- 목표경로
	 * 
	 */
	
	@RequestMapping("/main")
	public String mainForward() {
		return "common/main";
	}
	
	
}
