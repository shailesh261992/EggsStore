package com.a2soft.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.a2soft.domain.exceptions.InvalidMobileNumberException;

public class TestMobileNumber {

	@Test
	public void testValidMobileNumber() throws InvalidMobileNumberException {
		new MobileNumber("7276248187");
		assertTrue(true);
	}

	@Test(expected = InvalidMobileNumberException.class)
	public void testIValidMobileNumber_lengthGreaterThan10() throws InvalidMobileNumberException {
		new MobileNumber("17276248187");
		assertTrue(true);
	}
	
	@Test(expected = InvalidMobileNumberException.class)
	public void testIValidMobileNumber_lengthLessThan10() throws InvalidMobileNumberException {
		new MobileNumber("172762481");
		assertTrue(true);
	}

	@Test(expected = InvalidMobileNumberException.class)
	public void testIValidMobileNumber_containsNonDigitChar() throws InvalidMobileNumberException {
		new MobileNumber("727624818e");
		assertTrue(true);
	}

	
}
