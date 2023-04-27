package com.multi.tastezip;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class CsMemberController {
	
	@Autowired
	CsMemberDAO dao;
	
	@RequestMapping("login")
	public String login(CsMemberVO bag, HttpSession session) {
		System.out.println(bag);
		//dao를 이용해서 db처리할 예정.
		//views아래로 넘어가게 되어있음.
		//views아래 login.jsp를 호출하게 됨.
		int result = dao.login(bag);//1, 0
		if(result == 1) {
			//로그인이 성공하면, 세션을 잡아두자
			session.setAttribute("user_id", bag.getUser_id());
			return "login"; //views아래 파일이름.jsp
		}else {
			//views아래가 아니고, webapp아래
			//mainIndex로 가고 싶은 경우!
			return "redirect:1_mainIndex.jsp";
		}
	}
	
	@RequestMapping("join")
	public void join(CsMemberVO bag) {
		System.out.println("join요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);
	}

}