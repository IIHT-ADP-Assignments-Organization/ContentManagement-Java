package com.contentManagement.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.contentManagement.common.UserAlreadyExistException;
import com.contentManagement.models.Articles;
import com.contentManagement.models.Customer;
import com.contentManagement.services.CustomerService;

import junit.framework.Assert;

public class TestException {
	
	
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	 Customer customer = new Customer();
		customer.setUsername("john");
		customer.setPassword("john@1234");
		customer.setMobileNo(123456775);
		customer.setEmail("john@gmail.com");
		
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		customerservice.signup(customer.getUsername(),customer.getPassword());
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	

	@Test
    public void testForArticles() throws ArticlesAlreadyExistException 
    {
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
		customerservice.createArticles(articles);
Assert.assertEquals(ArticlesAlreadyExistException.message," articles already exists");
    }
	
	

}
