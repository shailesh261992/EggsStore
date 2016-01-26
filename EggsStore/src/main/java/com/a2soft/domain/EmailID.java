package com.a2soft.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.a2soft.domain.exceptions.InvalidEmailIdException;

public class EmailID {
	private String emailId;
	private static final String emailIdRegex;
	private static final Pattern emailIdPattern;
	private Matcher matcher;

	static {
		emailIdRegex = "^([_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*)@([A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,}))$";
		emailIdPattern = Pattern.compile(emailIdRegex);
	}

	public EmailID(String emailID) throws InvalidEmailIdException {
		this.matcher = emailIdPattern.matcher(emailID);
		if (!matcher.matches()) {
			throw new InvalidEmailIdException("EmailID is not Valid " + emailID);
		}
		this.emailId = emailID;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getUserName() {
		return matcher.group(1);
	}

	public String getDomainName() {
		return matcher.group(3);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailID other = (EmailID) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmailID [emailId=" + emailId + "]";
	}

}
