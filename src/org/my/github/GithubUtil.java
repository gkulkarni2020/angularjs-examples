package org.my.github;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GithubUtil {
	static final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
	public static String getDateAsString(Date date) {
		// Add comment from branch_1.
		return dateFormat.format(date);
	}
}
