package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_attributes_management_change_status_pop_up_objects {
	public WebDriver driver;

	@FindBy(xpath="//div[text()='Change Status of ']")
	private WebElement change_status_of_text;
	
//	@FindBy(xpath="//*[@class='modal-header']/div[@class='modal-title h4']")
//	private WebElement name_of_the_attribute_in_pop_up;
	
	@FindBy(xpath="//*[@aria-label='Close']")
	private WebElement x_button_in_pop_up;
	
	@FindBy(xpath="//*[@id='active']")
	private WebElement switch_button_in_pop_up;
	
	@FindBy(xpath="//*[@class='modal-body']/div/div/div/span")
	private WebElement active_inactive_text;
	
	@FindBy(xpath="//*[text()='Close']")
	private WebElement close_button;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_attributes_management_change_status_pop_up_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	


	public boolean change_status_text_should_be_displayed() {
		return change_status_of_text.isDisplayed();
	}

	public boolean cross_button_should_be_displayed() {
		return x_button_in_pop_up.isDisplayed();
	}

	public boolean cross_button_should_be_clickable() {
		return x_button_in_pop_up.isEnabled();
	}

	public boolean switch_button_should_be_displayed() {
		return switch_button_in_pop_up.isDisplayed();
	}

	public boolean switch_button_should_be_clickable() {
		return switch_button_in_pop_up.isEnabled();
	}

	public boolean switch_button_active_or_inactive_text_is_displayed() {
		return active_inactive_text.isDisplayed();
	}

	public boolean close_button_should_be_displayed() {
		return close_button.isDisplayed();
	}

	public boolean close_buttton_should_be_clickable() {
		return close_button.isEnabled();
	}

	public boolean close_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, close_button);
		return true;
	}

	public boolean submit_button_should_be_displayed() {
		return submit_button.isDisplayed();
	}

	public boolean submit_button_should_be_clickable() {
		return submit_button.isEnabled();
	}

	public boolean submit_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, submit_button);
		return true;
	}

	
	
}
