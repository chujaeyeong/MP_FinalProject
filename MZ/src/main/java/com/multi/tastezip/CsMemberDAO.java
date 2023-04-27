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
public class CsMemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
//	public CsMemberVO login(CsMemberVO bag) {
//		CsMemberVO vo = my.selectOne("CsMemberVO.login", bag);
//		System.out.println(vo);
//		return vo;
//	}
	
	public int login(CsMemberVO bag) {
	    int result = 0;
	    CsMemberVO vo = my.selectOne("CsMemberVO.login", bag);
	    if(vo != null) {
	        result = 1;
	    }
	    System.out.println(vo);
	    return result;
	}
	
	public int insert(CsMemberVO bag) {
		int result = my.insert("CsMemberVO.join", bag);
		return result;
	}

}