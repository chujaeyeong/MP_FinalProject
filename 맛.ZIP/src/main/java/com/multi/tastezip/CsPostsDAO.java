package com.multi.tastezip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CsPostsDAO {

	@Autowired
	SqlSessionTemplate my;

	public int insert(CsPostsVO bag) {
		int result = my.insert("CsPostsVO.create", bag);
		return result;
	}

	public int update(CsPostsVO bag) {
		int result = my.update("CsPostsVO.up", bag);
		return result;
	}

	public int delete(CsPostsVO bag) {
		int result = my.delete("CsPostsVO.del", bag);
		return result;
	}

	
	// 조건별 검색
	public CsPostsVO one1(int post_id) {
		CsPostsVO vo = my.selectOne("CsPostsVO.one1", post_id);
		System.out.println(vo);
		return vo;
	}
	
	public CsPostsVO one2(String user_id) {
		CsPostsVO vo = my.selectOne("CsPostsVO.one2", user_id);
		System.out.println(vo);
		return vo;
	}
	
	
	// 카테고리 전체 검색 
	public CsPostsVO category(String category) {
		CsPostsVO vo = my.selectOne("CsPostsVO.category", category);
		System.out.println(vo);
		return vo;
	}
	
	
	// 전체 리스트 검색 
	public List<CsPostsVO> list() {
		List<CsPostsVO> list = my.selectList("CsPostsVO.all");
		System.out.println(list.size());
		return list;
	}

}