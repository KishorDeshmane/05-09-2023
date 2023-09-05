package com.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_area_management_create_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement create_service_area_title_text_of_the_page;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li")
	private WebElement service_area_breadcrumb_button;
	
	@FindBy(xpath="//*[@class='breadcrumb-item active']")
	private WebElement breadcrumb_create_service_area_active_page;
	
	@FindBy(xpath="//*[@id='search']")
	private WebElement search_user_field;

	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_service_area_management_create_page_objects(WebDriver driver) {
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


	public boolean user_create_service_area_title_text_of_the_page_is_displayed() {
		try {
			return create_service_area_title_text_of_the_page.isDisplayed();
		} catch (StaleElementReferenceException e) {
			return create_service_area_title_text_of_the_page.isDisplayed();
		}
	}

	public boolean breadcrumb_list_should_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}

	public boolean breadcrumb_service_area_button_should_be_displayed() {
		return service_area_breadcrumb_button.isDisplayed();
	}

	public boolean breadcrumb_service_area_button_should_be_clickable() {
		return service_area_breadcrumb_button.isEnabled();
	}

	public boolean breadcrumb_active_page_create_service_area_text_should_be_displayed() {
		return breadcrumb_create_service_area_active_page.isDisplayed();
	}

	public boolean user_field_should_be_displayed() {
		return search_user_field.isDisplayed();
	}

	public boolean user_field_should_be_clickable() {
		return search_user_field.isEnabled();
	}

	public String user_field_place_holder_value_should_be() {
		return search_user_field.getAttribute("placeholder");
	}

}
