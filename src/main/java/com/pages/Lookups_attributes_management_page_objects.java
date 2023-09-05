package com.pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_attributes_management_page_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//h2[text()='Attribute Management']")
	private WebElement attribute_management_header_text;
	
	@FindBy(xpath="//ol[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//ol[@class='breadcrumb']/li[1]")
	private WebElement breadcrumb_dashboard_buttton;
	
	@FindBy(xpath="//ol[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_attribute_management_active_page;
	
	@FindBy(xpath="//*[text()='Records per page']")
	private WebElement record_per_page_text;
	
	@FindBy(xpath="//*[@type='select']")
	private WebElement record_per_page_dropdown_button;
	
	@FindBy(xpath="//*[@type='select']/option")
	private List<WebElement> record_per_page_dropdown_options;
	
	@FindBy(xpath="//*[text()='Create Attribute']")
	private WebElement create_attribute_button;
	
	@FindBy(xpath="//*[@class='input-group']/input")
	private WebElement search_user_field;
	
	@FindBy(xpath="//*[@class='input-group']/button")
	private WebElement search_icon_button;
	
	@FindBy(xpath="//*[text()='Name']")
	private WebElement thread_name_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th/i")
	private WebElement thread_name_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Type']")
	private WebElement thread_type_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[2]/i")
	private WebElement thread_type_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Status']")
	private WebElement thread_status_text;
	
	@FindBy(xpath="//*[text()='Actions']")
	private WebElement thread_action_text;
	
	@FindBy(xpath="//*[@class='dropdown']/button/i")
	private WebElement kebab_menu_3_dot;
	
	@FindBy(xpath="//*[@class='dropdown-item'][1]/a")
	private WebElement kebab_menu_edit_or_update_button;
	
	@FindBy(xpath="//*[@class='dropdown-item'][2]/a")
	private WebElement kebab_menu_change_Status_button;
	
	@FindBy(xpath="//*[@class='dropdown-item'][3]/a")
	private WebElement kebab_menu_delete_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_attributes_management_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void create_attribute_button_is_clicked() {
		create_attribute_button.click();
	}
	
	public void kebab_menu_3_dot_is_clicked(){
		kebab_menu_3_dot.click();
	}
	
	public void kebab_menu_edit_or_update_button_is_clicked(){
		kebab_menu_edit_or_update_button.click();
	}
	
	public void kebab_menu_change_Status_button_is_clicked(){
		kebab_menu_change_Status_button.click();
	}
	
	public void kebab_menu_delete_button_is_clicked(){
		kebab_menu_delete_button.click();
	}

	public boolean page_header_text_should_be_displayed() {
		return attribute_management_header_text.isDisplayed();
	}

	public boolean breadcrub_list_should_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}

	public boolean breadcrumb_dashboard_button_should_be_displayed() {
		return breadcrumb_dashboard_buttton.isDisplayed();
	}

	public boolean breadcrumb_dashboard_button_should_be_clickable() {
		return breadcrumb_dashboard_buttton.isEnabled();
	}

	public boolean breadcrumb_attributes_management_active_page_text_should_be_displayed() {
		return breadcrumb_attribute_management_active_page.isDisplayed();
	}

	public boolean record_per_page_text_should_be_displayed() {
		return record_per_page_text.isDisplayed();
	}

	public boolean record_per_page_dropdown_user_field_should_be_clickable() {
		return record_per_page_dropdown_button.isEnabled();
	}

	public boolean record_per_page_dropdown_list_should_be_clickable() {
		 for (WebElement listElement : record_per_page_dropdown_options) {
	            System.out.println("Is the list element clickable? " + listElement.isEnabled());
	        }
		return true;
	}

	public int record_per_page_dropdown_count_is() {
		return record_per_page_dropdown_options.size();
	}

	public boolean create_attributes_button_should_be_displayed() {
		return create_attribute_button.isDisplayed();
	}

	public boolean create_attributes_button_should_be_clickabe() {
		return create_attribute_button.isEnabled();
	}

	public boolean create_attributes_button_should_be_able_to_mouser_hover() {
		ElementUtil.eu.mouseHover(driver, create_attribute_button);
		return true;
	}

	public boolean search_user_field_should_be_displayed() {
		return search_user_field.isDisplayed();
	}

	public boolean search_user_field_should_be_clickable() {
		return search_user_field.isEnabled();
	}

	public String search_user_field_place_holder_value() {
		return search_user_field.getAttribute("placeholder");
	}

	public boolean search_user_field_icon_should_be_displayed() {
		return search_icon_button.isDisplayed();
	}

	public boolean search_user_field_icon_should_be_clickable() {
		return search_icon_button.isEnabled();
	}

	public boolean thread_name_should_be_displayed() {
		return thread_name_text.isDisplayed();
	}

	public boolean thread_name_asc_desc_button_should_be_clickable() {
		return thread_name_asc_desc_button.isEnabled();
	}

	public boolean thread_type_should_be_displayed() {
		return thread_type_text.isDisplayed();
	}

	public boolean thread_type_asc_desc_button_should_be_clickable() {
		return thread_type_asc_desc_button.isEnabled();
	}

	public boolean thread_status_should_be_displayed() {
		return thread_status_text.isDisplayed();
	}

	public boolean thread_status_asc_dsc_button_should_be_clickable() {
		
		return false;
	}

	public boolean actions_text_should_be_displayed() {
		return thread_action_text.isDisplayed();
	}

	public boolean kebab_menu_should_be_clickable() {
		return kebab_menu_3_dot.isEnabled();
	}

	public boolean kebab_menus_edit_button_should_be_clickable() {
		return kebab_menu_edit_or_update_button.isEnabled();
	}

	public boolean kebab_menus_change_status_button_should_be_clickable() {
		return kebab_menu_change_Status_button.isEnabled();
	}

	public boolean kebeb_menus_delete_button_should_be_clickable() {
		return kebab_menu_delete_button.isEnabled();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}