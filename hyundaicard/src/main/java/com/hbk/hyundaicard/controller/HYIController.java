package com.hbk.hyundaicard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //어노테이션 주석 당신을 콘트롤러로 입명합니다
public class HYIController {
	
	@GetMapping("/")//시작화면
	public String home() {
//홈이라는 함수는 web-inf에서 views폴더를 찾아 home.jsp를 뷰로 보여준다
		return "home";//src/webapp/WEB-INF/views
	}/*메서드는 리턴값을 실행하고 종료된다*/
	
	
	@GetMapping("/create") //U니폼 R소스 Lㅗ케이터설정
	public String create() {
		return "create";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
