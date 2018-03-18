package com.noryangjin.study.less02.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noryangjin.study.less02.diUtil.BeanTest;
import com.noryangjin.study.less02.diUtil.DiTest;
import com.noryangjin.study.less02.diUtil.JavaConfigTest;
import com.noryangjin.study.less02.diUtil.JavaConfigTest2;
import com.noryangjin.study.less02.diUtil.PojoSpringBean;


@Controller
@RequestMapping("less02/")
public class Less02Controller {

	private static final Logger logger = LoggerFactory.getLogger(Less02Controller.class);
	
	@Autowired
	PojoSpringBean pojoSpringBean;
	
	@Autowired
	JavaConfigTest2 javaConfigTest2;
	
	@GetMapping(value="pojoSpringBean")
	public String pojoSpringCall(Model model) throws Exception{
		logger.debug(pojoSpringBean.sayHello());
		model.addAttribute("sayHello", pojoSpringBean.sayHello());
		return "less02/pojoSpringBean";
	}
	
	@GetMapping(value="diSample")
	public String diSample(ModelMap model) throws Exception{
		
		/**
		 * 생성자를 통한 직접생성방법
		 */
		DiTest diTest = new DiTest();
		diTest.codeCall();
		
		/**
		 * 외부에서 생성된 객체를 통한 사용방법
		 * xml에 bean 설정 및 호출
		 */
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:spring/test-context.xml");
		BeanTest beanTest = ctx.getBean("beanTest", BeanTest.class);
		
		beanTest.callPrint();
		model.addAttribute("bean", beanTest.callString());
		
		/**
		 * 스테레오타입 애노테이션 
		 * @Configuration - bean정의를 자바 프로그램에서 실행하는 javaConfig용 어노테이션
		 */
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext("com.noryangjin.study.less02.diUtil");
		
		JavaConfigTest  jct = (JavaConfigTest)ctx2.getBean("javaConfig");
		model.addAttribute("javaConfig", jct.getComputer());
		
		return "less02/diSample";
	}
	
	@GetMapping("main")
	public String Less02Main(){
		return "less02/main";
	}
}
