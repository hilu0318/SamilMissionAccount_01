package com.samil.sma.core.usr.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * auther		: hilu0318
 * logicalName	: 로그인
 * fullPath		: com.samil.sma.core.usr.controller.Login
 */
@Controller
public class Login {
	
	/*
	 * URL			: /
	 * logicalName	: 로그인화면호출(GET)
	 * veiwPath		: /views/USR/login.jsp
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loadLoginViewGet(Locale locale, Model model) {
		/*
		 * TO-DO
		 * 세션정보 확인 후 메인페이지 or 로그인페이지 호출.
		 */
		
		return "USR/login";
	}
	
	/*
	 * URL			: /login
	 * logicalName	: 로그인정보조회(POST)
	 * veiwPath		: /views/USR/loginBridge.jsp
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String iqryLoginInfoPost(Locale locale, Model model) {
		/*
		 * TO-DO
		 * 고객정보 조회 후 세션정보 등록.
		 * 브릿지 페이지 연결.
		 */
		
		return "USR/loginBridge";
	}
	
}
