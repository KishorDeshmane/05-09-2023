package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_services_management_change_status_pop_up_objects {
	public WebDriver driver;

	@FindBy(xpath="//*[text()='Change Status of ']")
	private WebElement change_status_of;
	
	@FindBy(xpath="//*[@aria-label='Close']")
	private WebElement x_button;
	
	@FindBy(xpath="//*[@id='active']")
	private WebElement switch_button;
	
	@FindBy(xpath="//*[@class='modal-body']/div/div/div/span")
	private WebElement active_inactive_text_in_switch_button;
	
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
	
	public Lookups_services_management_change_status_pop_up_objects(WebDriver driver) {
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
		return change_status_of.isDisplayed();
	}

	public boolean cross_button_should_be_displayed() {
		return x_button.isDisplayed();
	}

	public boolean cross_button_should_be_clickable() {
		return x_button.isEnabled();
	}

	public boolean switch_button_should_be_displayed() {
		return switch_button.isDisplayed();
	}

	public boolean switch_button_should_be_clickable() {
		return switch_button.isEnabled();
	}

	public boolean switch_button_active_or_inactive_text_is_displayed() {
		return active_inactive_text_in_switch_button.isDisplayed();
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
