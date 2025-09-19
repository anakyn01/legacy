package com.hbk.hyundaicard.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hbk.hyundaicard.dao.BookDAO;

public class BookServiceImpl implements BookService{

	@Autowired
	BookDAO bookDao;
	
	@Override //클래스 재정의
	public String create(Map<String, Object> map) {
		int affectRowCount = this.bookDao.insert(map);
		
		if(affectRowCount == 1) {
			return map.get("book_id").toString();
		}		
		return null;
	}
}
