package com.noryangjin.study.less02.diUtil;

import org.springframework.context.annotation.Configuration;

@Configuration("javaConfig")
public class JavaConfigTest {
	private String computer;
	
	public JavaConfigTest(){
		this("LG");
	}
	
	public JavaConfigTest(String computer){
		this.computer = computer;
	}
	
	public String getComputer(){
		return computer;
	}
}
