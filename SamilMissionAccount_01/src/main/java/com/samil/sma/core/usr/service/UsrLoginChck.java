package com.samil.sma.core.usr.service;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.samil.sma.core.usr.dao.UsrBasic;

/*
 * auther		: hilu0318
 * logicalName	: 사용자로그인확인 
 * fullPath		: com.samil.sma.core.usr.service.UsrLoginChck
 */
@Service
public class UsrLoginChck {
	
	@Inject
	private UsrBasic usrBasicDao;
	
	public Map<String, Object> iqryUsrLoginInfo(Map<String, Object> iData){
		
		//변수 초기
		Map<String, Object> rData = new HashMap<String, Object>();
		
		//######################################
		//사용자기본조회
		//######################################
		rData = usrBasicDao.iqryUsrBasic(iData);
		
		return rData;
	}
}
