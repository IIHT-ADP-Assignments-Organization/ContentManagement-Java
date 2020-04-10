package com.contentManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contentManagement.models.Articles;
import com.contentManagement.models.Category;

@Component
@Service("customerService")
public class CustomerServiceDaoImpl implements CustomerServiceDao {

	@Autowired
	@Transactional
	public boolean signup(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Articles createArticles(Articles articles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Articles editArticles(int articlesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Articles viewArticles(int articlesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteArticles(int articlesId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Category searchCategory(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Articles searchArticles(String articleName) {
		// TODO Auto-generated method stub
		return null;
	}

}
