package com.bttp.pojo;

import java.util.regex.*;

public class ValidateSouthAfricanID {

	public static boolean isValidIDNumber(String idNumber) {
		String regExpression = "([0-9][0-9])((?:[0][1-9])|(?:[1][0-2]))((?:[0-2][0-9])|(?:[3][0-1]))([0-9])([0-9]{3})([0-9])([0-9])([0-9])";
		Pattern pattern = Pattern.compile(regExpression);

		Matcher matcher = pattern.matcher(idNumber);

		if (matcher.matches()) {

			int tot1 = 0;
			for (int i = 0; i < idNumber.length() - 1; i += 2) {
				tot1 = tot1 + Integer.parseInt(idNumber.substring(i, i + 1));
			}

			StringBuilder field1 = new StringBuilder("");
			for (int i = 1; i < idNumber.length(); i += 2) {
				field1.append(idNumber.substring(i, i + 1));
			}

			String evenTotStr = (Long.parseLong(field1.toString()) * 2) + "";
			int tot2 = 0;
			for (int i = 0; i < evenTotStr.length(); i++) {
				tot2 = tot2 + Integer.parseInt(evenTotStr.substring(i, i + 1));
			}

			int lastD = (10 - ((tot1 + tot2) % 10)) % 10;
			int checkD = Integer.parseInt(idNumber.substring(12, 13));

			return checkD == lastD;
		} else {
			return false;
		}
	}
}
