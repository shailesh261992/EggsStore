package com.a2soft.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.a2soft.domain.exceptions.InvalidEmailIdException;

public class TestEmailID {

	@Test
	public void testForValidEmailID() throws InvalidEmailIdException {
		new EmailID("shailesh261992@gmail.com");
		assertTrue(true);
	}

	@Test(expected = InvalidEmailIdException.class)
	public void testForInValidEmailID() throws InvalidEmailIdException {
		new EmailID("adb$@g");
		assertTrue(true);
	}

	@Test
	public void testForValidEmailID_UserName() throws InvalidEmailIdException {
		EmailID emailID = new EmailID("shailesh261992@gmail.com");
		assertEquals("shailesh261992", emailID.getUserName());

	}

	@Test
	public void testForValidEmailID_DomainName() throws InvalidEmailIdException {
		EmailID emailID = new EmailID("shailesh261992@gmail.com");
		assertEquals("gmail.com", emailID.getDomainName());
	}

}
