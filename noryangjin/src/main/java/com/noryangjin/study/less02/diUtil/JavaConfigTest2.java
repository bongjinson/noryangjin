package com.noryangjin.study.less02.diUtil;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.noryangjin.study.less02.service.JavaConfigService;


@Configuration
public class JavaConfigTest2 {
	
	@Bean
	public JavaConfigService computer(){
		
		List<String> modelName = new ArrayList<String>();
        modelName.add("k3");
        modelName.add("k5");
        modelName.add("k7");
        modelName.add("스포티지");
        modelName.add("카니발");
        modelName.add("카렌스");
        modelName.add("쏘렌토");
		
		return new JavaConfigComputer(modelName);
	}
	
	@Bean
	public JavaConfigService moniter(){
		
		List<String> modelName = new ArrayList<String>();
		modelName.add("싼타페");
		modelName.add("그랜져");
		modelName.add("아반떼");
		
		return new JavaConfigComputer(modelName);
	}
	
}
