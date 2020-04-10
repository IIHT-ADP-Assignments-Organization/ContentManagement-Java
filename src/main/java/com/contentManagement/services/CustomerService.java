package com.contentManagement.services;

import com.contentManagement.models.Articles;
import com.contentManagement.models.Category;

public interface CustomerService {
	
	boolean signup(String username,String password);
	public Articles createArticles(Articles articles);
	public Articles editArticles(int articlesId);
	public Articles viewArticles(int articlesId);
	boolean deleteArticles(int articlesId);
    Category searchCategory(String title);
    Articles searchArticles(String articleName);
}
