package com.noryangjin.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Less02Controller {

	@GetMapping("less02Main")
	public String Less02Main(){
		return "less02/main";
	}
}
