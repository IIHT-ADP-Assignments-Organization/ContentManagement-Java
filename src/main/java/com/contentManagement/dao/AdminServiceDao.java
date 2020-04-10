package com.contentManagement.dao;

import com.contentManagement.models.Articles;
import com.contentManagement.models.Banners;
import com.contentManagement.models.Category;
import com.contentManagement.models.Contacts;
import com.contentManagement.models.Menu;
import com.contentManagement.models.Modules;

public interface AdminServiceDao {
	
	boolean login(String username,String password);
	public Menu createMenu(Menu menu);
	public Menu editMenu(int menuId);
	public Menu viewMenu(int menuId);
	boolean deletemenu(int menuId);
	public Modules createModules(Modules modules);
	public Modules editModules(int modulesId);
	public Modules viewModules(int modulesId);
	boolean deleteModules(int modulesId);
	public Articles createArticles(Articles articles);
	public Articles editArticles(int articlesId);
	public Articles viewArticles(int articlesId);
	boolean deleteArticles(int articlesId);
	public Banners createBanners(Banners banners);
	public Banners editBanners(int bannersId);
	public Banners viewBanners(int bannersId);
	boolean deleteBanners(int bannersId);
	public Category createCategory(Category category);
	public Category editCategory(int categoryId);
	public Category viewCategory(int categoryId);
	boolean deleteCategory(int categoryId);
	public Contacts createContacts(Contacts contacts);
	public Contacts editContacts(int contactsId);
	public Contacts viewContacts(int contactsId);
	boolean deleteContacts(int contactsId);
	

}
