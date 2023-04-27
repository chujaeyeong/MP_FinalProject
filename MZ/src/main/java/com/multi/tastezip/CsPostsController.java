package com.multi.tastezip;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CsPostsController {

	@Autowired
	CsPostsDAO dao;
	
//	@Autowired
//	CsCommDAO dao2;

	@RequestMapping("insert")
	public void insert(CsPostsVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);

		dao.insert(bag);
	}

	@RequestMapping("update")
	public void update(CsPostsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);

		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(CsPostsVO bag) {
		System.out.println("delete요청됨.");
		System.out.println(bag);

		dao.delete(bag);
	}

	// 조건별 검색
	@RequestMapping("one1")
	public void one1(int post_id, Model model) {
		System.out.println("one1요청됨.");
		CsPostsVO vo = dao.one1(post_id);
//		ArrayList<CsCommVO> commList = dao2.list(post_id);
		model.addAttribute("vo", vo);
//		model.addAttribute("commList", commList);
	}

	@RequestMapping("one2")
	public void one2(String user_id, Model model) {
		System.out.println("one2요청됨.");
		CsPostsVO vo = dao.one2(user_id);
		model.addAttribute("vo", vo);
	}

	// 카테고리별 검색
	@RequestMapping("category")
	public void category(String category, Model model) {
		System.out.println("category 검색 요청됨.");
		CsPostsVO vo = dao.category(category);
		model.addAttribute("vo", vo);
	}

	@RequestMapping("list") // ajax
	public void list(Model model) {
		List<CsPostsVO> list = dao.list();
		System.out.println(list.size()); //사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
}