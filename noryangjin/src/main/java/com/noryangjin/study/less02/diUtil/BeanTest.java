package com.noryangjin.study.less02.diUtil;

public class BeanTest {
	
	private String computer;
	private String mouse;
	private String keyboard;
	private String moniter;
	
	public BeanTest(String computer, String mouse, String keyboard, String moniter){
		this.computer = computer;
		this.mouse = mouse;
		this.keyboard = keyboard;
		this.moniter = moniter;
	}

	public void callPrint(){
		System.out.println(computer);
		System.out.println(mouse);
		System.out.println(keyboard);
		System.out.println(moniter);
	}
	
	public String callString(){
		return computer +" / "+ mouse +" / "+keyboard +" / "+moniter;
	}
	
	public String getComputer() {
		return computer;
	}

	public String getMouse() {
		return mouse;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public String getMoniter() {
		return moniter;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public void setMoniter(String moniter) {
		this.moniter = moniter;
	}
	
}
