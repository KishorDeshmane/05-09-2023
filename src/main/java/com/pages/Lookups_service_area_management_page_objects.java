package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_area_management_page_objects {
	public WebDriver driver;

	@FindBy(xpath = "//*[@class='page-header']/div/h2")
	private WebElement service_area_management_title_text;
	
	@FindBy(xpath="//*[text()='Create Service Area']")
	private WebElement create_service_area_button;
	
	@FindBy(xpath= "//*[@class='dropdown']/button/i")
	private WebElement first_user_kebab_menu;
	
	@FindBy(xpath= "//*[@class='dropdown-item'][1]/a")
	private WebElement first_user_kebab_menu_edit_button;
	
	@FindBy(xpath= "//*[@class='dropdown-item'][2]/a")
	private WebElement first_user_kebab_menu_change_status_buttton;
	
	@FindBy(xpath= "//*[@class='dropdown-item'][3]/a")
	private WebElement first_user_kebab_menu_delete_button;

	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;

	@FindBy(xpath="//*[@class='breadcrumb']/li[1]")
	private WebElement breadcrumb_dashboard_button;

	@FindBy(xpath="//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_current_page_service_areas_text;

	@FindBy(xpath="//*[text()='Records per page']")
	private WebElement record_per_page_text;

	@FindBy(xpath="//*[@type='select']")
	private WebElement record_per_page_dropdown;

	@FindBy(xpath="//*[@type='select']/option")
	private List<WebElement> record_per_page_dropdown_list;

	@FindBy(xpath="//*[@class='input-group']/input")
	private WebElement search_user_field;

	@FindBy(xpath="//*[@class='input-group']/button")
	private WebElement search_icon;

	@FindBy(xpath="//*[text()='Area']")
	private WebElement table_thread_area_text;

	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[1]/i")
	private WebElement table_thread_area_asc_or_desc_button;

	@FindBy(xpath="//*[text()='City / Town']")
	private WebElement table_thread_city_or_town_text;

	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[2]/i")
	private WebElement table_thread_city_or_town_asc_or_desc_button;

	@FindBy(xpath="//*[text()='State / Emirates']")
	private WebElement table_therad_state_or_emairate;

	@FindBy(xpath="//*[text()='PO Box']")
	private WebElement table_thread_po_box_text;

	@FindBy(xpath="//*[text()='Status']")
	private WebElement table_thread_status_text;

	@FindBy(xpath="//*[@class='table-responsive']/table/thead/tr/th[5]/i")
	private WebElement table_thread_status_asc_dsec_button;

	@FindBy(xpath="//*[text()='Actions']")
	private WebElement table_thread_action_text;
	

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public Lookups_service_area_management_page_objects(WebDriver driver) {
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

	public boolean user_service_area_management_title_text_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, service_area_management_title_text);
		return service_area_management_title_text.isDisplayed();
	}

	public boolean user_create_service_area_button_should_be_clickable(){
		return create_service_area_button.isEnabled();
	}
	
	public void user_create_service_area_button_is_click(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, create_service_area_button);
		create_service_area_button.click();
	}
	
	public void user_kebab_menu_is_clicked() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, first_user_kebab_menu);
		first_user_kebab_menu.click();
	}
	
	public void user_kebab_menu_edit_is_clicked() {
		first_user_kebab_menu_edit_button.click();
	}
	
	public void user_first_user_kebab_menu_change_status_buttton_is_clicked(){
		first_user_kebab_menu_change_status_buttton.click();
	}
	
	public void user_kebab_menu_delete_is_clicked() {
		first_user_kebab_menu_delete_button.click();
	}

	public boolean breadcrumb_list_should_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}

	public boolean breadcrumb_dashboard_button_should_be_clickable() {
		return breadcrumb_dashboard_button.isEnabled();
	}

	public boolean breadcrumb_dashbaord_button_should_be_displayed() {
		return breadcrumb_dashboard_button.isDisplayed();
	}

	public boolean breadcrumb_current_page_service_areas_text_should_be_displayed() {
		return breadcrumb_current_page_service_areas_text.isDisplayed();
	}

	public boolean record_per_page_text_should_be_displayed() {
		return record_per_page_text.isDisplayed();
	}

	public boolean record_per_page_dropdown_should_be_displayed() {
		return record_per_page_dropdown.isDisplayed();
	}

	public int record_per_page_dropdown_list_should_be_something() {
		return record_per_page_dropdown_list.size();
	}

	public boolean record_per_page_dropdown_list_should_be_clickable() {
		for (WebElement listElement : record_per_page_dropdown_list) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, listElement);	
            System.out.println("Is the list element clickable? " + listElement);
        }
		return true;
	}

	public boolean create_service_area_button_should_be_displayed() {
		return create_service_area_button.isDisplayed();
	}

	public boolean search_user_field_should_be_displayed() {
		return search_user_field.isDisplayed();
	}

	public String search_user_fied_placeholder_value() {
		return search_user_field.getAttribute("placeholder");
	}

	public boolean search_icon_should_be_clickable() {
		return search_icon.isEnabled();
	}

	public boolean table_thread_area_text_should_be_displayed() {
		return table_thread_area_text.isDisplayed();
	}

	public boolean table_thread_area_asc_or_desc_button_should_be_clickable() {
		return table_thread_area_asc_or_desc_button.isEnabled();
	}

	public boolean table_thread_city_or_town_text_should_be_displayed() {
		return table_thread_city_or_town_text.isDisplayed();
	}

	public boolean table_thread_city_or_town_asc_or_desc_button_should_be_clickable() {
		return table_thread_city_or_town_asc_or_desc_button.isEnabled();
	}

	public boolean table_therad_state_or_emairate_text_should_be_displayed() {
		return table_therad_state_or_emairate.isDisplayed();
	}

	public boolean table_thread_po_box_text_should_be_displayed() {
		return table_thread_po_box_text.isDisplayed();
	}

	public boolean table_thread_status_text_shoul_be_displayed() {
		return table_thread_status_text.isDisplayed();
	}

	public boolean table_thread_status_asc_dsec_button_should_be_clickable() {
		return table_thread_status_asc_dsec_button.isEnabled();
	}

	public boolean table_thread_action_text_should_be_displayed() {
		return table_thread_action_text.isDisplayed();
	}

	public boolean kebab_menu_should_be_clickable() {
		return first_user_kebab_menu.isEnabled();
	}

	public boolean kebab_menus_edit_button_should_be_clickable() {
		return first_user_kebab_menu_edit_button.isEnabled();
	}

	public boolean kebab_menus_change_status_button_should_be_clickable() {
		return first_user_kebab_menu_change_status_buttton.isEnabled();
	}

	public boolean kebab_menus_delete_button_should_be_clickable() {
		return first_user_kebab_menu_delete_button.isEnabled();
	}
	
}
