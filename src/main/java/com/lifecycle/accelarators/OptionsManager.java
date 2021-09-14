package com.lifecycle.accelarators;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class OptionsManager {
	public ChromeOptions getChromeOptions(String platform) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setHeadless(true);
		options.addArguments("ignore-certificate-errors");
		options.addArguments("disable-popup-blocking");

		if (platform.equals("win10")) {
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
		} else {
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		}
		return options;
	}

	// Get Firefox Options
	public FirefoxOptions getFirefoxOptions(String platform) {

		FirefoxOptions options = new FirefoxOptions();

		options.setHeadless(true);

		if (platform.equals("win10")) {
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
		} else {
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		}
		return options;
	}

	public EdgeOptions getEdgeOptions(String platform) {
		EdgeOptions options = new EdgeOptions();
		options.setCapability("CAPABILITY_AUTOCLOSE", false);

		if (platform.equals("win10")) {
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
		} else {
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		}
		return options;
	}
}