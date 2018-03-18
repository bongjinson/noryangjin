package com.noryangjin.study.less02.service;

import java.util.Map;


public interface ComponentService {
	/**
	 * 마우스
	 * @param map
	 * @throws Exception
	 */
	public void mouse(Map<String, String> map) throws Exception; 
	
	/**
	 * 모니터
	 * @param map
	 * @throws Exception
	 */
	public void moniter(Map<String, String> map) throws Exception; 
	/**
	 * 키보드
	 * @param map
	 * @throws Exception
	 */
	public void keyboard(Map<String, String> map) throws Exception; 
}
