package com.noryangjin.study.less02.diUtil;

import com.noryangjin.study.common.util.MathUtil;
import com.noryangjin.study.less02.service.DiService;

public class DiTest implements DiService{
	/**
	 * 결합도가 높고 테스트하기 힘든코드 , 의존하는 객체, 단위테스트 작성힘듬
	 */
	private MathUtil mathUtil;
	
	//생성자
	public DiTest(){
		mathUtil = new MathUtil();
	}
	
	@Override
	public void codeCall() throws Exception {
		mathUtil.fnRandom(0, 6);
	}
	
}
