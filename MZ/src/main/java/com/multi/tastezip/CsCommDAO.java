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

import com.multi.tastezip.CsPostsVO;

@Component
public class CsCommDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(CsCommVO bag) {
	int result = my.insert("CsCommVO.create", bag);
	return result;
	}
	
	public int update(CsCommVO bag) {
	int result = my.update("CsCommVO.up", bag);
	return result;
	}
	
	public int delete(CsCommVO bag) {
	int result = my.delete("CsCommVO.del", bag);
	return result;
	}
	
	// 댓글 검색 
	public CsPostsVO commList(int post_id) {
	CsPostsVO vo = my.selectOne("CsPostsVO.commList", post_id);
	System.out.println(vo);
	return vo;
	}

}