package com.noryangjin.study.less02.diUtil;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PojoSpringBean {
	public String sayHello() {
		//이것이 실제로 필요한 전부다.
		return "Hello World";
	}
}
