package com.devesh.batch.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PreKycUtils {

	public static String convertDateToString(Date date) {
	    return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
}
