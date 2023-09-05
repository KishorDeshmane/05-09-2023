package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_area_management_update_page_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement update_service_area_page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li")
	private WebElement breadcrumb_service_area_button;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_update_service_area_active_page;
	
	@FindBy(xpath="//*[@id='search']")
	private WebElement search_user_field;
	
	@FindBy(xpath="//span[text()='Service Area']")
	private WebElement service_area_text_above_user_field;
	
	@FindBy(xpath="//label[@for='service_area_name']/span[2]")
	private WebElement service_area_asterisk_sign;
	
	@FindBy(xpath="//*[@name='service_area_name']")
	private WebElement service_area_user_field;
	
	@FindBy(xpath="//*[@for='service_area_city']/span[1]")
	private WebElement city_or_town_text_above_user_field;
	
	@FindBy(xpath="//*[@for='service_area_city']/span[2]")
	private WebElement city_or_town_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='service_area_city']")
	private WebElement city_or_town_user_field;
	
	@FindBy(xpath="//*[@for='service_area_state']/span[1]")
	private WebElement state_or_emirate_text_above_user_field;
	
	@FindBy(xpath="//*[@for='service_area_state']/span[2]")
	private WebElement state_or_emirate_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='service_area_state']")
	private WebElement state_or_emirate_user_field;
	
	@FindBy(xpath="//*[@for='service_area_country']")
	private WebElement country_title_above_user_field;
	
	@FindBy(xpath="//*[@name='service_area_country']")
	private WebElement country_user_field;

	@FindBy(xpath="//*[@for='service_area_zip']")
	private WebElement po_box_title_above_user_field;

	@FindBy(xpath="//*[@name='service_area_zip']")
	private WebElement po_box_user_field;

	@FindBy(xpath="//*[text()=' Latitude ']")
	private WebElement latitude_text;
	
	@FindBy(xpath="//*[text()='Longitude']")
	private WebElement logitude_text;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit_button;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;
	
	@FindBy(xpath="//*[@class='gm-err-container']")
	private WebElement map_location_box;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_service_area_management_update_page_objects(WebDriver driver) {
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
	
	public boolean page_header_text_should_be_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, update_service_area_page_header_text);
		return update_service_area_page_header_text.isDisplayed();
	}
	
	public boolean breadcrumb_list_should_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}
	
	public boolean breadcrumb_service_area_button_should_be_displayed() {
		return breadcrumb_service_area_button.isDisplayed();
	}
	
	public boolean breadcrumb_service_area_button_should_be_clickable() {
		return breadcrumb_service_area_button.isEnabled();
	}
	
	public boolean breadcrumb_update_service_area_text_should_be_displayed() {
		return breadcrumb_update_service_area_active_page.isDisplayed();
	}
	
	public boolean search_user_field_should_be_displayed() {
		return search_user_field.isDisplayed();
	}
	
	public boolean search_user_field_should_be_clickable() {
		return search_user_field.isEnabled();
	}
	
	public String search_user_field_placeholder_value() {
		return search_user_field.getAttribute("placeholder");
	}
	
	public boolean service_area_text_above_user_field_should_be_displayed() {
		return service_area_text_above_user_field.isDisplayed();
	}
	
	public boolean service_area_asterisk_sign_should_be_displayed() {
		return service_area_asterisk_sign.isDisplayed();
	}
	
	public boolean service_area_user_field_should_be_clickable() {
		return service_area_user_field.isEnabled();
	}
	
	public String service_area_user_field_placeholder_value() {
		return service_area_user_field.getAttribute("placeholder");
	}
	
	public boolean city_or_town_text_above_user_field_should_be_displayed() {
		return city_or_town_text_above_user_field.isDisplayed();
	}
	
	public boolean city_or_town_asterisk_sign_should_be_displayed() {
		return city_or_town_asterrisk_sign.isDisplayed();
	}
	
	public boolean city_or_town_user_field_should_be_clickable() {
		return city_or_town_user_field.isEnabled();
	}
	
	public String city_or_town_user_field_placeholder_value() {
		return city_or_town_user_field.getAttribute("placeholder");
	}
	
	public boolean state_or_emirates_text_above_the_user_field_should_be_displayed() {
		return state_or_emirate_text_above_user_field.isDisplayed();
	}
	
	public boolean state_or_emirates_asterisk_sign_should_be_displayed() {
		return state_or_emirate_asterrisk_sign.isDisplayed();
	}
	
	public boolean state_or_emirates_user_field_should_be_clickable() {
		return state_or_emirate_user_field.isEnabled();
	}
	
	public String state_or_emirates_user_field_placeholder_value() {
		return state_or_emirate_user_field.getAttribute("placeholder");
	}
	
	public boolean country_text_above_the_user_field_should_be_displayed() {
		return country_title_above_user_field.isDisplayed();
	}
	
	public boolean country_user_field_should_be_clickable() {
		return country_user_field.isEnabled();
	}
	
	public String country_user_field_placeholder_value() {
		return country_user_field.getAttribute("placeholder");
	}
	
	public boolean po_box_text_above_the_user_field_should_be_displayed() {
		return po_box_title_above_user_field.isDisplayed();
	}
	
	public boolean po_box_user_field_should_be_clickable() {
		return po_box_user_field.isEnabled();
	}
	
	public String po_box_user_field_placeholder_value() {
		return po_box_user_field.getAttribute("placeholder");
	}
	
	public boolean lattitude_text_should_be_displayed() {
		return latitude_text.isDisplayed();
	}
	
	public boolean longitude_text_should_be_displayed() {
		return logitude_text.isDisplayed();
	}
	
	public boolean submit_button_should_be_displayed() {
		return submit_button.isDisplayed();
	}
	
	public boolean submit_button_should_be_clickable() {
		return submit_button.isEnabled();
	}
	
	public boolean submit_button_should_be_able_to_mouser_hover() {
		ElementUtil.eu.scroll_down_body_click(2, driver);
		ElementUtil.eu.mouseHover(driver, submit_button);
		return true;
	}
	
	public boolean cancel_button_should_be_should_be_displayed() {
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
