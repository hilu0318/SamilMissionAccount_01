package com.samil.sma.core.usr.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/*
 * auther		: hilu0318
 * logicalName	: 사용자기본 
 * fullPath		: com.samil.sma.core.usr.dao.UsrBasic
 */
@Repository
public class UsrBasic {
	
	private static String namespace = "MS_USR001";
	
	@Inject
	private SqlSession sqlSession;
	
	/*
	 * logicalName	: 사용자기본조회 
	 * inparam		: Map<String, Object>
	 * outparam		: Map<String, Object>
	 */
	public Map<String, Object> iqryUsrBasic(Map<String, Object> iDtat){
		return sqlSession.selectOne(getNamespaceId("iqryUsrBasic"));
	}
	
	/*
	 * logicalName	:  
	 * inparam		: String
	 * outparam		: String
	 */
	private String getNamespaceId(String queryId) {
		return namespace + "." + queryId;
	}
}
