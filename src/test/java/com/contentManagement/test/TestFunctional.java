package com.contentManagement.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.contentManagement.models.Admin;
import com.contentManagement.models.Articles;
import com.contentManagement.models.Banners;
import com.contentManagement.models.Category;
import com.contentManagement.models.Contacts;
import com.contentManagement.models.Customer;
import com.contentManagement.models.Menu;
import com.contentManagement.models.Modules;
import com.contentManagement.services.AdminService;
import com.contentManagement.services.CustomerService;


public class TestFunctional {
	
	@Test
	public void createUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Menu menu = new Menu();
		menu.setMenuId(1);
		menu.setTitle("Category");
		menu.setDescription("displays all categories");
		menu.setMenuType("Main Menu");
		menu.setDescription("public");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Menu result = adminservice.createMenu(menu);
		assertNotNull(result);
		
						
	}
	@Test
	public void editMenu() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Menu menu = new Menu();
		menu.setMenuId(1);
		menu.setTitle("Category");
		menu.setDescription("displays all categories");
		menu.setMenuType("Main Menu");
		menu.setDescription("public");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Menu result = adminservice.editMenu(menu.getMenuId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void viewMenu() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Menu menu = new Menu();
		menu.setMenuId(1);
		menu.setTitle("Category");
		menu.setDescription("displays all categories");
		menu.setMenuType("Main Menu");
		menu.setDescription("public");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Menu result = adminservice.viewMenu(menu.getMenuId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void deleteMenu() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Menu menu = new Menu();
		menu.setMenuId(1);
		menu.setTitle("Category");
		menu.setDescription("displays all categories");
		menu.setMenuType("Main Menu");
		menu.setDescription("public");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deletemenu(menu.getMenuId());
		 assertSame(1,result);
		
						
	}
	
	@Test
	public void createModules() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Modules modules = new Modules();
		modules.setModulesId(1);
		modules.setTitle("Banners");
		modules.setShowTitle(true);
		modules.setPosition("left");
		modules.setStatus("published");
		modules.setLanguage("kannada");
		modules.setAccess("public");
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Modules result = adminservice.createModules(modules);
		assertNotNull(result);	
						
	}

	@Test
	public void editModules() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Modules modules = new Modules();
		modules.setModulesId(1);
		modules.setTitle("Banners");
		modules.setShowTitle(true);
		modules.setPosition("left");
		modules.setStatus("published");
		modules.setLanguage("kannada");
		modules.setAccess("public");
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Modules result = adminservice.editModules(modules.getModulesId());
		assertNotNull(result);	
						
	}

	@Test
	public void viewModules() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Modules modules = new Modules();
		modules.setModulesId(1);
		modules.setTitle("Banners");
		modules.setShowTitle(true);
		modules.setPosition("left");
		modules.setStatus("published");
		modules.setLanguage("kannada");
		modules.setAccess("public");
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Modules result = adminservice.viewModules(modules.getModulesId());
		assertNotNull(result);	
						
	}

	@Test
	public void deleteModules() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Modules modules = new Modules();
		modules.setModulesId(1);
		modules.setTitle("Banners");
		modules.setShowTitle(true);
		modules.setPosition("left");
		modules.setStatus("published");
		modules.setLanguage("kannada");
		modules.setAccess("public");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteModules(modules.getModulesId());
		 assertSame(1,result);
		
						
	}
	
	@Test
	public void createArticle() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Articles result = adminservice.createArticles(articles);
		assertNotNull(result);	
						
	}
	
	@Test
	public void editArticles() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Articles result = adminservice.editArticles(articles.getArticleId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void viewArticles() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Articles result = adminservice.viewArticles(articles.getArticleId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void deleteArticles() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("politician-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteArticles(articles.getArticleId());
		 assertSame(1,result);	
						
	}
	
	@Test
	public void createArticleByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Articles result = customerservice.createArticles(articles);
		assertNotNull(result);	
						
	}
	
	@Test
	public void editArticleByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Articles result = customerservice.editArticles(articles.getArticleId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void viewArticleByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Articles result = customerservice.viewArticles(articles.getArticleId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void deleteArticleByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		boolean result = customerservice.deleteArticles(articles.getArticleId());
		assertSame(1,result);	
						
	}
	
	@Test
	public void createBanners() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Banners banners = new Banners();
		banners.setBannerId(1);
		banners.setDescription("it is a nice platform to learn new technology");
		banners.setName("Technology");
		banners.setAltText("The best portal to learn technology");
		banners.setWidth("230");
		banners.setHeight("350");
		banners.setType("main banner");
		banners.setImage("https://banner.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Banners result = adminservice.createBanners(banners);
		assertNotNull(result);	
						
	}
	
	@Test
	public void editBanners() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Banners banners = new Banners();
		banners.setBannerId(1);
		banners.setDescription("it is a nice platform to learn new technology");
		banners.setName("Technology");
		banners.setAltText("The best portal to learn technology");
		banners.setWidth("230");
		banners.setHeight("350");
		banners.setType("main banner");
		banners.setImage("https://banner.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Banners result = adminservice.editBanners(banners.getBannerId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void viewBanners() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Banners banners = new Banners();
		banners.setBannerId(1);
		banners.setDescription("it is a nice platform to learn new technology");
		banners.setName("Technology");
		banners.setAltText("The best portal to learn technology");
		banners.setWidth("230");
		banners.setHeight("350");
		banners.setType("main banner");
		banners.setImage("https://banner.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Banners result = adminservice.viewBanners(banners.getBannerId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void deleteBanners() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Banners banners = new Banners();
		banners.setBannerId(1);
		banners.setDescription("it is a nice platform to learn new technology");
		banners.setName("Technology");
		banners.setAltText("The best portal to learn technology");
		banners.setWidth("230");
		banners.setHeight("350");
		banners.setType("main banner");
		banners.setImage("https://banner.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteBanners(banners.getBannerId());
		assertSame(1,result);	
						
	}
	
	@Test
	public void createCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(1);
		category.setTitle("books");
		category.setDescription("all category books are there");
		category.setTags("mythology books0");
		category.setAccess("published");
		category.setParentCategory("null");
		category.setImage("https://category.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Category result = adminservice.createCategory(category);
		assertNotNull(result);	
						
	}
	
	@Test
	public void editCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(1);
		category.setTitle("books");
		category.setDescription("all category books are there");
		category.setTags("mythology books0");
		category.setAccess("published");
		category.setParentCategory("null");
		category.setImage("https://category.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Category result = adminservice.editCategory(category.getCategoryId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void viewCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(1);
		category.setTitle("books");
		category.setDescription("all category books are there");
		category.setTags("mythology books0");
		category.setAccess("published");
		category.setParentCategory("null");
		category.setImage("https://category.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Category result = adminservice.viewCategory(category.getCategoryId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void deleteCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(1);
		category.setTitle("books");
		category.setDescription("all category books are there");
		category.setTags("mythology books0");
		category.setAccess("published");
		category.setParentCategory("null");
		category.setImage("https://category.jpeg");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteCategory(category.getCategoryId());
		assertSame(1,result);
						
	}
	
	@Test
	public void createContacts() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Contacts contacts = new Contacts();
		contacts.setLinkedUser("john.linkedln1234");
		contacts.setImage("https://userimage.jpeg");
		contacts.setTelephone(844234567);
		contacts.setMobile(925463782);
		contacts.setFax(12345);
		
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Contacts result = adminservice.createContacts(contacts);
		assertNotNull(result);	
						
	}
	
	@Test
	public void editContacts() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Contacts contacts = new Contacts();
		contacts.setContactsId(1);
		contacts.setLinkedUser("john.linkedln1234");
		contacts.setImage("https://userimage.jpeg");
		contacts.setTelephone(844234567);
		contacts.setMobile(925463782);
		contacts.setFax(12345);
		
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Contacts result = adminservice.editContacts(contacts.getContactsId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void viewContacts() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Contacts contacts = new Contacts();
		contacts.setContactsId(1);
		contacts.setLinkedUser("john.linkedln1234");
		contacts.setImage("https://userimage.jpeg");
		contacts.setTelephone(844234567);
		contacts.setMobile(925463782);
		contacts.setFax(12345);
		
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Contacts result = adminservice.viewContacts(contacts.getContactsId());
		assertNotNull(result);	
						
	}
	
	@Test
	public void deleteContacts() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Contacts contacts = new Contacts();
		contacts.setContactsId(1);
		contacts.setLinkedUser("john.linkedln1234");
		contacts.setImage("https://userimage.jpeg");
		contacts.setTelephone(844234567);
		contacts.setMobile(925463782);
		contacts.setFax(12345);
		
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteContacts(contacts.getContactsId());
		assertSame(1,result);
						
	}
	
	@Test
	public void searchCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(1);
		category.setTitle("books");
		category.setDescription("all category books are there");
		category.setTags("mythology books0");
		category.setAccess("published");
		category.setParentCategory("null");
		category.setImage("https://category.jpeg");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Category result = customerservice.searchCategory(category.getTitle());
		assertNotNull(result);	
						
	}
	
	@Test
	public void searchArticles() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Articles articles = new Articles();
		articles.setArticleId(1);
		articles.setTitle("Data mining");
		articles.setDescription("Data mining is one of the most usefull technique used for enterpreneurs and researchers ");
		articles.setCategory("Data science");
		articles.setFeatured("featured");
		articles.setLanguage("english");
		articles.setStatus("published");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Articles result = customerservice.searchArticles(articles.getTitle());
		assertNotNull(result);	
						
	}
	@Test
	public void testSignUp()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");

		Customer customer = new Customer();
		customer.setUsername("john");
		customer.setPassword("john@1234");
		customer.setMobileNo(123456775);
		customer.setEmail("john@gmail.com");
		
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		boolean customerfromdb =customerservice.signup(customer.getUsername(),customer.getPassword());
		assertSame(customer,customerfromdb);
	}
	
	@Test
	public void testLogin()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	Admin admin = new Admin();
		admin.setUsername("Ram");
		admin.setPassword("ram1234");
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean adminfromdb = adminservice.login(admin.getUsername(),admin.getPassword());
		assertSame(true,adminfromdb);
	}
	
}
