package com.contentManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contentManagement.models.Articles;
import com.contentManagement.models.Banners;
import com.contentManagement.models.Category;
import com.contentManagement.models.Contacts;
import com.contentManagement.models.Menu;
import com.contentManagement.models.Modules;

@Component
@Service("adminService")
public class AdminServiceDaoImpl implements AdminServiceDao {

	@Autowired
	@Transactional
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Menu createMenu(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Menu editMenu(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Menu viewMenu(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deletemenu(int menuId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Modules createModules(Modules modules) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Modules editModules(int modulesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Modules viewModules(int modulesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteModules(int modulesId) {
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
	public Banners createBanners(Banners banners) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Banners editBanners(int bannersId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Banners viewBanners(int bannersId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteBanners(int bannersId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Category editCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Category viewCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Contacts createContacts(Contacts contacts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Contacts editContacts(int contactsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Contacts viewContacts(int contactsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteContacts(int contactsId) {
		// TODO Auto-generated method stub
		return false;
	}

}
