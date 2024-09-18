package com.workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");

		driver.manage().window().maximize();

		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext searchContext1 = (SearchContext) driver.executeScript("return arguments[0].shadowRoot", shadowHost);

		String someText = searchContext1.findElement(By.cssSelector("#shadow_content")).getText();

		System.out.println(someText);


		WebElement shadowHost1 = searchContext1.findElement(By.cssSelector("#nested_shadow_host"));
		SearchContext searchContext2 = (SearchContext) driver.executeScript("return arguments[0].shadowRoot", shadowHost1);

		System.out.println(searchContext2.findElement(By.cssSelector("#nested_shadow_content")).getText());

		searchContext2.findElement(By.cssSelector("input[type = 'text']")).sendKeys("search");
	}

}
