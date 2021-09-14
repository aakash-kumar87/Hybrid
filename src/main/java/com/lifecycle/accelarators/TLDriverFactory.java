package com.lifecycle.accelarators;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TLDriverFactory {
	private static OptionsManager optionsManager = new OptionsManager();
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	private TLDriverFactory() {

	}

	public static synchronized void setDriver(String browser, String platform) {
		if (browser.equals("firefox")) {

			tlDriver = ThreadLocal.withInitial(() -> {
				try {
					return new RemoteWebDriver(new URL("http://192.168.1.159:4445/wd/hub"),
							optionsManager.getFirefoxOptions(platform));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				return null;
			});
		} else if (browser.equals("chrome")) {

			tlDriver = ThreadLocal.withInitial(() -> {
				try {
					return new RemoteWebDriver(new URL("http://192.168.1.159:4445/wd/hub"),
							optionsManager.getChromeOptions(platform));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				return null;
			});
		} else if (browser.equals("edge")) {
			tlDriver = ThreadLocal.withInitial(() -> {
				try {
					return new RemoteWebDriver(new URL("http://192.168.1.159:4445/wd/hub"),
							optionsManager.getEdgeOptions(platform));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				return null;
			});
		}

	}

	public static synchronized WebDriverWait getWait(WebDriver driver) {
		return new WebDriverWait(driver, 20);
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}