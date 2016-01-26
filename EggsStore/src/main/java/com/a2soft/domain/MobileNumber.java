package com.a2soft.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.a2soft.domain.exceptions.InvalidMobileNumberException;

public class MobileNumber {

	private String mobileNumber;

	private static final String mobileNumberRegex;
	private static final Pattern mobileNumberPattern;

	static {
		mobileNumberRegex = "^\\d{10}$";
		mobileNumberPattern = Pattern.compile(mobileNumberRegex);
	}

	public MobileNumber(String mobileNumber) throws InvalidMobileNumberException {
		Matcher matcher = mobileNumberPattern.matcher(mobileNumber);
		if (!matcher.matches()) {
			throw new InvalidMobileNumberException("Invalid mobile number " + mobileNumber);
		}
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "MobileNumber [mobileNumber=" + mobileNumber + "]";
	}

}
