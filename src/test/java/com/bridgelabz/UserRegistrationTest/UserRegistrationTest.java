package com.bridgelabz.UserRegistrationTest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple UserRegistration.
 */
public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Akash");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Ak@sh");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Ak");
		Assert.assertEquals(false,result);
	}
	
}