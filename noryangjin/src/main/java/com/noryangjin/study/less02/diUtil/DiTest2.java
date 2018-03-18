package com.noryangjin.study.less02.diUtil;

import com.noryangjin.study.common.util.MathUtil;
import com.noryangjin.study.less02.service.DiService;

public class DiTest2 implements DiService{
	/**
	 * 
	 */
	private MathUtil mathUtil;
	
	/**
	 * 생성시점에 인자로 받음
	 * 이런 종속객체주입을 생성자 주입(constructor injection) 이라 한다.
	 * 중요한 것은 DiTest2 객체가 MathUtil의 구현체에 결합되지 않는다는 사실  
	 * @param mathUtil
	 */
	public DiTest2(MathUtil mathUtil){
		//mathUtil이 주입된다.
		this.mathUtil = mathUtil;
	}

	@Override
	public void codeCall() throws Exception {
		mathUtil.fnRandom(0, 6);
	}
	
}
