package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_services_management_page_objects {
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li")
	private WebElement breadcrumb_dadshboard_button;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_service_management_active_page;
	
	@FindBy(xpath="//*[text()='Records per page']")
	private WebElement record_per_page_text;
	
	@FindBy(xpath="//*[@type='select']")
	private WebElement record_per_page_dropdown;
	
	@FindBy(xpath="//*[@type='select']/option")
	private List<WebElement> record_per_page_option;
	
	@FindBy(xpath="//*[text()='Create Service']")
	private WebElement create_service_button;
	
	@FindBy(xpath="//*[@placeholder='Search by name or category...']")
	private WebElement search_user_field;
	
	@FindBy(xpath="//*[@class='input-group']/button")
	private WebElement serach_icon_buttn;
	
	@FindBy(xpath="//*[text()='Name']")
	private WebElement thread_name_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[2]/i")
	private WebElement thread_name_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Category']")
	private WebElement thread_category_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[3]/i")
	private WebElement thread_category_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Status']")
	private WebElement thread_status_text;
	
	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[4]/i")
	private WebElement thread_status_asc_desc_button;
	
	@FindBy(xpath="//*[text()='Actions']")
	private WebElement thread_actions_text;
	
	@FindBy(xpath="//*[@class='dropdown']/button/i")
	private WebElement actions_kebab_menu;
	
	@FindBy(xpath="//*[@class='dropdown-item'][1]/a")
	private WebElement actions_kebab_menu_edit_button;

	@FindBy(xpath="//*[@class='dropdown-item'][2]/a")
	private WebElement actions_kebab_menu_change_Status_button;

	@FindBy(xpath="//*[@class='dropdown-item'][3]/a")
	private WebElement actions_kebab_menu_delete_button;

	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_services_management_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean page_header_text_should_be_displayed() {
		return page_header_text.isDisplayed();
	}
	
	public boolean breadcrub_list_should_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}
	
	public boolean breadcrumb_dashboard_button_should_be_displayed() {
		return breadcrumb_dadshboard_button.isDisplayed();
	}
	
	public boolean breadcrumb_dashboard_button_should_be_clickable() {
		return breadcrumb_dadshboard_button.isEnabled();
	}
	
	public boolean breadcrumb_service_management_active_page_text_should_be_displayed() {
		return breadcrumb_dadshboard_button.isDisplayed();
	}
	
	public boolean record_per_page_text_should_be_displayed() {
		return record_per_page_text.isDisplayed();		
	}
	
	public boolean record_per_page_dropdown_user_field_should_be_clickable() {
		return record_per_page_dropdown.isEnabled();
	}
	
	public boolean record_per_page_dropdown_list_should_be_clickable() {
		for (WebElement listElement : record_per_page_option) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, listElement);
            System.out.println("Is the list element clickable? " + listElement.isEnabled());
        }
		return true;
	}
	
	public int record_per_page_dropdown_count_is() {
		return record_per_page_option.size();
	}
	
	public boolean create_service_button_should_be_displayed() {
		return create_service_button.isDisplayed();
	}
	
	public boolean create_service_button_should_be_clickabe() {
		return create_service_button.isEnabled();
	}
	
	public boolean create_service_button_should_be_able_to_mouser_hover() {
		ElementUtil.eu.mouseHover(driver, create_service_button);
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
		return serach_icon_buttn.isDisplayed();
	}
	
	public boolean search_user_field_icon_should_be_clickable() {
		return serach_icon_buttn.isEnabled();
	}
	
	public boolean thread_name_should_be_displayed() {
		return thread_name_text.isDisplayed();
	}
	
	public boolean thread_name_asc_desc_button_should_be_clickable() {
		return thread_name_asc_desc_button.isEnabled();
	}
	
	public boolean thread_category_should_be_displayed() {
		return thread_category_text.isDisplayed();
	}
	
	public boolean thread_category_asc_desc_button_should_be_clickable() {
		return thread_category_asc_desc_button.isEnabled();
	}
	
	public boolean thread_status_should_be_displayed() {
		return thread_status_text.isDisplayed();
	}
	
	public boolean thread_status_asc_dsc_button_should_be_clickable() {
		return thread_status_asc_desc_button.isEnabled();
	}
	
	public boolean actions_text_should_be_displayed() {
		return thread_actions_text.isDisplayed();
	}
	
	public boolean kebab_menu_should_be_clickable() {
		return actions_kebab_menu.isEnabled();
	}
	
	public void kebab_menu_should_be_clicked() {
		 actions_kebab_menu.click();
	}
	
	public boolean kebab_menus_edit_button_should_be_clickable() {
		return actions_kebab_menu_edit_button.isEnabled();
	}
	
	public void kebab_menus_edit_button_should_be_clicked() {
		 actions_kebab_menu_edit_button.click();
	}
	
	public boolean kebab_menus_change_status_button_should_be_displayed() {
		return actions_kebab_menu_change_Status_button.isEnabled();
	}
	
	public void kebab_menus_change_status_button_clicked() {
		 actions_kebab_menu_change_Status_button.click();
	}
	
	public boolean kebeb_menus_delete_button_should_be_clickable() {
		return actions_kebab_menu_delete_button.isEnabled();
	}
	
	public void kebeb_menus_delete_button_clicked() {
		 actions_kebab_menu_delete_button.click();
	}

	public void create_services_management_button_is_clicked() {
		create_service_button.click();
	}


	
}
