package com.lifecycle.accelarators;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lifecycle.library.BrowsePage;

public class Utilities {

	private Utilities() {

	}

	public static int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
		int random = start + rnd.nextInt(end - start + 1 - exclude.length);
		for (int ex : exclude) {
			if (random < ex) {
				break;
			}
			random++;
		}
		return random;
	}

	public static boolean doesListContain(String code, BrowsePage browsePage, By section) {
		List<WebElement> programs = browsePage.getTabElements(section);
		WebElement elementCode;
		for (WebElement webElement : programs) {
			if (programs.size() > 8) {
				elementCode = webElement.findElement(By.xpath("../div[1]"));
			} else {
				elementCode = webElement.findElement(By.xpath("../../div/span"));
			}
			if (elementCode.getText().contains(code)) {
				return true;
			}
		}
		return false;
	}

	public static String html2text(String html) {
		return html.replaceAll("\\<[^>]*>", "");
	}

	public static String removeNewLinesAndBreaks(String text) {
		return text.replace("\n", "").replace("\r", "");
	}

	public static String convertAnyAsciiApostrophes(String text) {
		return text.replaceAll("\\&#(.*?)\\;", "'");

	}
	
	
	// get current date and convert into dd MM yyy format (mainly used for date picker)
	
	public static String currentDate() {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,0);
		SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
		//System.out.println(cal.getTime());
		// Output "Wed Sep 26 14:23:28 EST 2012"

		String formattedDate = format.format(cal.getTime());
		return formattedDate;
		
		
	}
	
	
	
	}
	
	
