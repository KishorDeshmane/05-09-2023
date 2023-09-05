package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_area_management_delete_pop_up_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='!']")
	private WebElement big_i;
	
	@FindBy(xpath="//*[text()='Are you sure?']")
	private WebElement are_you_sure_text;
	
	@FindBy(xpath="//*[@id='swal2-html-container']")
	private WebElement you_want_to_delete_line;
	
	@FindBy(xpath="//*[text()='Yes, delete it!']")
	private WebElement yes_delete_it_button;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_service_area_management_delete_pop_up_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean warning_i_icon_should_be_displayed() {
		return big_i.isDisplayed();
	}

	public boolean are_you_sure_text_should_be_displayed() {
		return are_you_sure_text.isDisplayed();
	}

	public boolean you_want_to_delete_this_category_text_should_be_displayed() {
		return you_want_to_delete_line.isDisplayed();
	}

	public boolean yes_delete_it_button_should_be_displayed() {
		return yes_delete_it_button.isDisplayed();
	}

	public boolean yes_delete_it_button_should_be_clickable() {
		return yes_delete_it_button.isEnabled();
	}

	public boolean yes_delete_it_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, yes_delete_it_button);
		return true;
	}

	public boolean cancel_button_should_be_displayed() {
		return cancel_button.isDisplayed();
	}

	public boolean cancel_button_should_be_clickable() {
		return cancel_button.isEnabled();
	}

	public boolean cancel_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, cancel_button);
		return true;
	}


	


}
