package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_category_management_change_status_pop_up_objects {

	public WebDriver driver;
	
	@FindBy(xpath="//div[text()='Change Status of ']")
	private WebElement change_status_text;
	
	@FindBy(xpath="//*[@aria-label='Close']")
	private WebElement cross_button;

	@FindBy(xpath="//*[@type='checkbox']")
	private WebElement switch_button;

	@FindBy(xpath="//*[@class='Services_statusField__vEu4_ col']/span")
	private WebElement switch_button_active_or_inactive_text;

	@FindBy(xpath="//*[@class='Services_statusField__vEu4_ col']/span")
	private WebElement switch_button_inactive_text;
	
	
	@FindBy(xpath="//*[text()='Close']")
	private WebElement close_button;

	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit_button;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_service_category_management_change_status_pop_up_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean user_change_status_text_should_be_displayed() {
		return change_status_text.isDisplayed();
	}

	public boolean user_cross_button_should_be_displayed() {
		return cross_button.isDisplayed();
	}

	public boolean user_cross_button_should_be_clickable() {
		return switch_button.isEnabled();
	}
	
	public void user_cross_button_should_be_clicked() {
		switch_button.click();
	}

	public boolean user_switch_button_should_be_displayed() {
		return switch_button.isDisplayed();
	}

	public boolean user_switch_button_should_be_clickable() {
		return switch_button.isEnabled();
	}

	public boolean user_switch_button_active_or_inactive_text() {
		return switch_button_active_or_inactive_text.isDisplayed();
	}

	public boolean user_close_button_should_be_displayed() {
		return close_button.isDisplayed();
	}

	public boolean user_close_buttton_should_be_clickable() {
		return close_button.isEnabled();
	}

	public boolean user_close_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, close_button);
		return true;
	}

	public boolean user_submit_button_should_be_displayed() {
		return submit_button.isDisplayed();
	}

	public boolean user_submit_button_should_be_clickable() {
		return submit_button.isEnabled();
	}

	public boolean user_submit_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, submit_button);
		return true;
	}
	
	
}