package com.workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMCheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		
		WebElement shadowHost = driver.findElement(By.tagName("downloads-manager"));
		SearchContext searchContext1 = (SearchContext) driver.executeScript("return arguments[0].shadowRoot", shadowHost);
		
		WebElement shadowHost2 = searchContext1.findElement(By.cssSelector("#toolbar"));
		SearchContext searchContext2 = (SearchContext) driver.executeScript("return arguments[0].shadowRoot", shadowHost2);
		
		WebElement shadowHost3 = searchContext2.findElement(By.cssSelector("#cr-toolbar#toolbar"));
		SearchContext searchContext3 = (SearchContext) driver.executeScript("return arguments[0].shadowRoot", shadowHost3);
		
		WebElement shadowHost4 = searchContext3.findElement(By.cssSelector("#search"));
		SearchContext searchContext4 = (SearchContext) driver.executeScript("return arguments[0].shadowRoot", shadowHost4);
		
		searchContext4.findElement(By.cssSelector("#searchInput")).sendKeys("download");
		
	}

}
