package com.noryangjin.study.less02.diUtil;

import java.util.List;

import com.noryangjin.study.less02.service.JavaConfigService;


public class JavaConfigComputer implements JavaConfigService{
	private List<String> name;
	
	public JavaConfigComputer(List<String> name){
		this.name = name;
	}
	
	@Override
	public void info(){
		for(String model : name){
			System.out.println(model + ",");
		}
	}
}
