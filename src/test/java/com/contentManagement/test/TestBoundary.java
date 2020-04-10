package com.contentManagement.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.contentManagement.models.Customer;



public class TestBoundary {
	
	 @Test
	    public void testpasswordLength()
	    {
		 Customer customer = new Customer();
			customer.setUsername("john");
			customer.setPassword("john@1234");
			customer.setMobileNo(123456775);
			customer.setEmail("john@gmail.com");
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getPassword().length());


	    }
	 
	 @Test
	    public void testPhoneNumberLength()
	    {
		 Customer customer = new Customer();
			customer.setUsername("john");
			customer.setPassword("john@1234");
			customer.setMobileNo(123456775);
			customer.setEmail("john@gmail.com");
	        long MobileNumberLength=10;
	        
	    assertEquals( MobileNumberLength,customer.getMobileNo());


	    }
	 
	 @Test
	    public void testEmailLength()
	    {
		 Customer customer = new Customer();
			customer.setUsername("john");
			customer.setPassword("john@1234");
			customer.setMobileNo(123456775);
			customer.setEmail("john@gmail.com");
	        		
	        int emailLength=10;
	assertEquals(emailLength,customer.getEmail().length());

	    }

}
