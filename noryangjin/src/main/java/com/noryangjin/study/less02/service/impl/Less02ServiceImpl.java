package com.noryangjin.study.less02.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noryangjin.study.less02.dao.Less02DAO;
import com.noryangjin.study.less02.service.Less02Service;

@Service("less02Service")
public class Less02ServiceImpl implements Less02Service{

	@Autowired
	Less02DAO less02DAO;
	
	@Override
	public void findLess02Info() {
		// TODO Auto-generated method stub
		
	}
	
}
