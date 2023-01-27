package com.devesh.batch.dto;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShortLink {
	private Map<String, String> keyMap;
	private char myChars[];
	private Random myRand;

	public ShortLink() {
		keyMap = new HashMap<String, String>();
		myRand = new Random();
		myChars = new char[62];
		for (int i = 0; i < 62; i++) {
			int j = 0;
			if (i < 10) {
				j = i + 48;
			} else if (i > 9 && i <= 35) {
				j = i + 55;
			} else {
				j = i + 61;
			}
			myChars[i] = (char) j;
		}
	}

	public String getKey(String longURL) {
		String key;
		key = generateKey();
		keyMap.put(key, longURL);
		return key;
	}

	private String generateKey() {
		String key = "";
		boolean flag = true;
		while (flag) {
			key = "";
			for (int i = 0; i <= 1; i++) {
				key += myChars[myRand.nextInt(62)];
			}
			if (!keyMap.containsKey(key)) {
				flag = false;
			}
		}
		return key;
	}
	
	/*public static void main(String k[]) {
		ShortLink shortLink = new ShortLink();
		String strTimestamp = new SimpleDateFormat("ddMMyyhhmmsss").format(new java.util.Date());
		String shortlink = shortLink.getKey("https://google.com/?ack="+9988889) + strTimestamp;
		log.info(shortlink);
	} */
	
}
