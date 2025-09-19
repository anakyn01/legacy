package com.hbk.hyundaicard.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //이클래스가 데이터베이스관련 역활(DAO)을 하는 컴포넌트
public class BookDAO {

	@Autowired //싱글톤 (한번 만들고 언제든 재사용)
	SqlSessionTemplate sqlSessionTemplate;
	//Spring에 의존성 주입(dependency Injection)기능을 사용해서 SqlSessionTemplate
	
	//insert
	public int insertBook(Map<String, Object> param) {
		return this.sqlSessionTemplate.insert("book.insert", param);
	}
	/*book.insert <insert id="insert">와 연결됨  param은 HashMap또는 DTO객체가 될수있다*/
	
	
	
	
	
	
	
}
