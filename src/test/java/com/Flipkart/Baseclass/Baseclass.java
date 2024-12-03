package com.Flipkart.Baseclass;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass implements IBaseclass{
	
	public static WebDriver driver;
	public static Actions action;
	public static Wait wait;
	public static Select select;
	public static JavascriptExecutor js;

	@Override
	public void browserlaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("start-maximized");
		driver = new EdgeDriver(option);
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
	}

	@Override
	public void browserclose() {
		driver.close();
		
	}

	@Override
	public void launchApplication(String url) {
		driver.get(url);
		
	}

	@Override
	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	@Override
	public String title() {
		String title = driver.getTitle();
		return title;
	}

	@Override
	public void forward() {
		driver.navigate().forward();
		
	}

	@Override
	public void refresh() {
		driver.navigate().refresh();
		
	}

	@Override
	public void backward() {
		driver.navigate().back();
		
	}

	@Override
	public void button(WebElement ele) {
		ele.click();
	}

	@Override
	public void sendText(WebElement ele, String inputText) {
		ele.sendKeys(inputText);
		
	}

	@Override
	public String extractText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	@Override
	public String extractAttribute(WebElement ele, String attribute) {
		String attribute1 = ele.getAttribute(attribute);
		return attribute1;
	}

	@Override
	public boolean displayed(WebElement ele) {
		boolean display = ele.isDisplayed();
		return display;
	}

	@Override
	public void mouseOver(WebElement ele) {
		action.moveToElement(ele).build().perform();
		
	}

	@Override
	public void sendText(String inputText, WebElement ele) {
		action.sendKeys(ele, inputText).build().perform();
		
	}

	@Override
	public void button(WebElement ele, int i) {
		action.click(ele).build().perform();
		
	}

	@Override
	public void button(int i, WebElement ele) {
		js.executeScript("arguments[0].click()", ele);
		
	}

	@Override
	public void sendText(String inputText, WebElement ele, int i) {
		js.executeScript("arguments[0].setAttribute('value', '"+inputText+"'",ele);
		
	}

	@Override
	public void selectVisibilityText(WebElement ele, String visibleText) {
		select  = new Select(ele);
		select.selectByVisibleText(visibleText);
		
	}

	@Override
	public void selectIndex(WebElement ele, int index) {
		select = new Select(ele);
		select.selectByIndex(index);
		
	}

	@Override
	public void selectValue(WebElement ele, String value) {
		select = new Select(ele);
		select.selectByValue(value);
		
	}

	@Override
	public void ss(String imgName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\MJ\\eclipse-workspace\\list\\FlipkartProject\\target\\"+imgName+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deselectVisibilityText(WebElement ele, String visibleText) {
		select = new Select(ele);
		select.deselectByVisibleText(visibleText);
		
	}

	@Override
	public void deselectIndex(WebElement ele, int index) {
		select = new Select(ele);
		select.deselectByIndex(index);
		
	}

	@Override
	public void deselectValue(WebElement ele, String value) {
		select = new Select(ele);
		select.deselectByValue(value);
		
	}

	@Override
	public void waits(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	@Override
	public boolean isMultiple(WebElement ele) {
		boolean multiple = select.isMultiple();
		return multiple;
	}

}
