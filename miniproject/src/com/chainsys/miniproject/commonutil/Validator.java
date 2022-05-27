package com.chainsys.miniproject.commonutil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static boolean checkStringForParseInt(String data) throws InvalidInputDataException {
		boolean result = false;
		String p = "^[0-9]+$";
		Pattern patt = Pattern.compile(p);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("please enter Integer");
		return result;
	}

	public static boolean CheckNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		if (data < 0) {
			throw new InvalidInputDataException(" enter number greater than zero");
		}
		return false;

	}

	public static void checklengthOfString(String data) throws InvalidInputDataException {

		int len = data.length();
		if (len < 15 && len > 3)
			;
		else
			throw new InvalidInputDataException("length of string is not valid");

	}

	public static void checkStringOnly(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[a-zA-Z]+(\\\\s[a-zA-Z]+)?$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException(" enter character");
	}

	public static void CheckNumberForGreaterThanZero(float data) throws InvalidInputDataException {
		if (data < 0)
			throw new InvalidInputDataException("please enter value greater than zero");

	}

	public static void checkEmail(String data) throws InvalidInputDataException {
		boolean result = false;
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern patt = Pattern.compile(regexPattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("your email does not have special character and format");
	}

	public static void checkJobId(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[a-zA-Z0-9]([.-](?![.-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("wrong pattern for job id");
	}

	public static void checkPhone(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[0-9]{10}$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException(" enter 10 digit: ");
	}
}