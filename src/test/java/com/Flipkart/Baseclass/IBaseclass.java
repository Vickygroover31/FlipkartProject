package com.Flipkart.Baseclass;

import org.openqa.selenium.WebElement;

public interface IBaseclass {
	
	
	public void browserlaunch();
	public void browserclose();
	public void launchApplication(String url);
	public String currentUrl();
	public String title();
	public void forward();
	public void refresh();
	public void backward();
	public void button(WebElement ele);
	public void sendText(WebElement ele, String inputText);
	public String extractText(WebElement ele);
	public String extractAttribute(WebElement ele, String attribute);
	public boolean displayed(WebElement ele);
	public void mouseOver(WebElement ele);
	public void sendText(String inputText, WebElement ele);
	public void button(WebElement ele, int i);
	public void button(int i, WebElement ele);
	public void sendText(String inputText, WebElement ele, int i);
	public void selectVisibilityText(WebElement ele, String visibleText);
	public void selectIndex(WebElement ele, int index);
	public void selectValue(WebElement ele, String value);
	public void ss(String imgName);
	public void deselectVisibilityText(WebElement ele, String visibleText);
	public void deselectIndex(WebElement ele, int index);
	public void deselectValue(WebElement ele, String value);
	public void waits(WebElement ele);
	public boolean isMultiple(WebElement ele);
	

}
