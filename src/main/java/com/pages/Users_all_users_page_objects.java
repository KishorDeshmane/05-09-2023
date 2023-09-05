package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_all_users_page_objects {
private WebDriver driver;
	
	
	@FindBy(xpath = "(//*[text()='All Users'])[2]")
	private WebElement user_all_users_headers_text;

	@FindBy(xpath = "//*[@class='breadcrumb']")
	private WebElement user_all_users_breadcrum_list;

	@FindBy(xpath = "//*[@class='breadcrumb-item']/a")
	private WebElement user_all_users_breadcrum_dashboard;

	@FindBy(xpath = "//*[@class='breadcrumb-item active']")
	private WebElement user_all_users_breadcrum_users_text;

	@FindBy(xpath = "(//*[@type='button']/i)[2]")
	private WebElement user_all_users_search_button;
	
	@FindBy(xpath = "//*[@class='input-group']/input")
	private WebElement user_all_users_search_userfield;

	@FindBy(xpath = "//*[text()='Create User']")
	private WebElement user_all_users_create_user_button;

	@FindBy(xpath = "//table[@class='card-table table-striped table-vcenter text-nowrap mb-0 table']//th/span")
	private List<WebElement> user_all_users_column_list;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[1]")
	private WebElement user_all_users_column_list_name_up_down_arrow;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[2]")
	private WebElement user_all_users_column_list_email_up_down_arrow;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[3]")
	private WebElement user_all_users_column_list_mobile_number_up_down_arrow;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[4]")
	private WebElement user_all_users_column_list_type_up_down_arrows;
	
	@FindBy(xpath = "(//*[@class='table-responsive']/table/thead/tr/th/i)[5]")
	private WebElement user_all_users_column_list_status_up_down_arrow;

	@FindBy(xpath = "//*[text()='Actions']")
	private WebElement user_all_users_column_list_action_text;
	
	@FindBy(xpath = "//*[text()='Name']")
	private WebElement user_all_users_thread_column_name;

	@FindBy(xpath = "//*[text()='Email']")
	private WebElement user_all_users_thread_column_email;

	@FindBy(xpath = "//*[text()='Mobile Number']")
	private WebElement user_all_users_thread_column_mobile_number;

	@FindBy(xpath = "//*[text()='Type']")
	private WebElement user_all_users_thread_column_type;
	
	@FindBy(xpath = "//*[text()='Status']")
	private WebElement user_all_users_thread_column_status;

	/*
	 * Actions
	 */

	@FindBy(xpath = "//*[@class='dropdown']/button/i")
	private WebElement users_all_users_actions_options_3_dots;

	@FindBy(xpath = "//*[@class='dropdown-item']/a")
	private WebElement users_all_users_actions_option_edit;

	@FindBy(xpath = "(//*[@class='border-top dropdown-item']/a)[1]")
	private WebElement users_all_users_actions_option_change_status;
	
	@FindBy(xpath = "//*[@class='text-center']/span[text()='Active']/span")
	private WebElement user_all_users_thread_column_user_status_active;

	@FindBy(xpath = "//*[@class='text-center']/span[text()='Inactive']/span")
	private WebElement user_all_users_thread_column_user_status_inactive;
	
	@FindBy(xpath = "(//*[@class='border-top dropdown-item']/a)[5]")
	private WebElement users_all_users_actions_option_delete;

	@FindBy(xpath = "(//*[@class='border-top dropdown-item']/a)[2]")
	private WebElement users_all_users_actions_option_resend_email_verification_link;

	@FindBy(xpath = "(//*[@class='border-top dropdown-item']/a)[3]")
	private WebElement users_all_users_actions_option_change_password;

	@FindBy(xpath = "(//*[@class='border-top dropdown-item']/a)[4]")
	private WebElement users_all_users_actions_manage_roles_and_permissions;

	@FindBy(xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/span[text()])[1]")
	private WebElement user_all_users_column_list_expected_user_name;

	@FindBy(xpath = "//*[text()='No records were found']")
	private WebElement users_all_users_search_not_found;
	
	@FindBy(xpath = "//*[@class='table-responsive']/table/tbody/tr/td[2]")
	private WebElement users_all_users_search_button_is_display_the_name_of_user;
	
	@FindBy(xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/span[text()])[1]")
	private WebElement users_all_users_search_button_is_display_the_email_of_user;
	
	@FindBy(xpath = "//*[@class='table-responsive']/table/tbody/tr/td[4]")
	private WebElement users_all_users_search_button_is_display_the_number_of_user;
	
	@FindBy(xpath ="//*[text()='No records were found']")
	private WebElement search_button_is_display_the_text_of_the_no_records_were_found;
	
	@FindBy(xpath = "(//*[@class='page-item']/a/span[2])[1]")
	private WebElement users_all_users_pagination_left_arrow;
	
	@FindBy(xpath = "//*[@class='page-item']/a/span[1]")
	private WebElement users_all_users_pagination_right_arrow;
	
	@FindBy(xpath = "//tbody/tr/td[2]")
	private List<WebElement> users_all_users_pagination_members_count;

	@FindBy(css=".page-item")
	private List<WebElement> users_all_users_pagination_numbers;
	
	@FindBy(xpath="//*[@class='page-item active']/span")
	private WebElement users_all_users_pagination_numbers_one;
	
	/* 
	 * 
	 * 
	 * 
	 * Constructor 
	 * 
	 * 
	 * */

	public Users_all_users_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 *  
	 *  Methods 
	 *  
	 *  
	 *  
	 *  */

	public boolean user_all_users_headers_text_is_displayed() {
		return user_all_users_headers_text.isDisplayed();
	}

	public boolean user_all_users_breadcrum_is_displayed() {
		return user_all_users_breadcrum_list.isDisplayed();
	}
	
	public void user_all_users_breadcrum_is_click() {
		user_all_users_breadcrum_list.click();
	}

	public boolean user_all_users_breadcrum_dashboard_is_displayed() {
		return user_all_users_breadcrum_dashboard.isDisplayed();
	}

	public boolean user_all_users_breadcrum_dashboard_is_clickable() {
		return user_all_users_breadcrum_dashboard.isEnabled();
	}
	
	public void user_all_users_breadcrum_dashboard_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, user_all_users_breadcrum_dashboard);
		 user_all_users_breadcrum_dashboard.click();
	}

	public boolean user_all_users_breadcrum_users_text_is_displayed() {
		return user_all_users_breadcrum_users_text.isDisplayed();
	}

	public boolean user_all_users_search_button_is_displayed() {
		return user_all_users_search_button.isDisplayed();
	}

	public boolean user_all_users_search_button_is_clickable() {
		return user_all_users_search_button.isEnabled();
	}
	
	public void user_all_users_search_button_is_click() {
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, user_all_users_search_button);
		 user_all_users_search_button.click();
	}
	
	public boolean user_all_users_column_list_expected_user_name_is_displayed(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, user_all_users_column_list_expected_user_name);
		return user_all_users_column_list_expected_user_name.isDisplayed();
	}
	
	public void user_all_users_search_userfield_sendText(String string) {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, user_all_users_search_userfield);
		user_all_users_search_userfield.sendKeys(string);
	}
	
	public boolean user_all_users_search_button_should_be_able_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, user_all_users_search_button);
		return true;
	}
	
	public boolean user_all_users_search_userfield_is_clickable(){
		return user_all_users_search_userfield.isEnabled();
	}
	
	public String user_all_users_search_userfield_is_placeholder_value(){
		return  user_all_users_search_userfield.getAttribute("placeholder");
	}
	
	public String user_all_users_search_userfield_is_entered_value(){
		return  user_all_users_search_userfield.getAttribute("value");
	}

	public boolean user_all_users_create_user_button_is_displayed() {
		return user_all_users_create_user_button.isDisplayed();
	}

	public boolean user_all_users_create_user_button_is_clickable() {
		return user_all_users_create_user_button.isEnabled();
	}
	
	public void user_all_users_create_user_button_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, user_all_users_create_user_button);
		 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		 ElementUtil.eu.clickByJS(driver, user_all_users_create_user_button);
	}

	public boolean user_all_users_create_user_button_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, user_all_users_create_user_button);
		return true;
	}

	public boolean user_all_users_column_list_is_displayed() {
		for(WebElement elements : user_all_users_column_list) {
		 elements.isDisplayed();
		 System.out.println(elements.getText());
		}
		return true;
	}
	
	public boolean user_all_users_column_list_name_up_down_arrow_is_clickable(){
		return user_all_users_column_list_name_up_down_arrow.isEnabled();
	}
	
	public boolean user_all_users_column_list_email_up_down_arrow_is_clickable(){
		return user_all_users_column_list_email_up_down_arrow.isEnabled();
	}
	
	public boolean user_all_users_column_list_mobile_number_up_down_arrow_is_clickable(){
		return user_all_users_column_list_mobile_number_up_down_arrow.isEnabled();
	}
	
	public boolean user_all_users_column_list_type_up_down_arrows_is_clickable(){
		return user_all_users_column_list_type_up_down_arrows.isEnabled();
	}
	
	public boolean user_all_users_column_list_status_up_down_arrow_is_clickable(){
		return user_all_users_column_list_status_up_down_arrow.isEnabled();
	}

	public boolean user_all_users_column_list_name_up_down_arrow_is_displayed() {
		return user_all_users_column_list_name_up_down_arrow.isDisplayed();
	}

	public boolean user_all_users_column_list_email_up_down_arrow_is_displayed() {
		return user_all_users_column_list_email_up_down_arrow.isDisplayed();
	}

	public boolean user_all_users_column_list_mobile_number_up_down_arrow_is_displayed() {
		return user_all_users_column_list_mobile_number_up_down_arrow.isDisplayed();
	}
	
	public boolean user_all_users_column_list_type_up_down_arrows_is_displayed(){
		return user_all_users_column_list_type_up_down_arrows.isDisplayed();
	}

	public boolean user_all_users_column_list_action_text_is_displayed(){
		return user_all_users_column_list_action_text.isDisplayed();	
	}
	
	public boolean user_all_users_column_list_status_up_down_arrow_is_displayed() {
		return user_all_users_column_list_status_up_down_arrow.isDisplayed();
	}

	public boolean user_all_users_thread_column_name_is_displayed() {
		return user_all_users_thread_column_name.isDisplayed();
	}

	public boolean user_all_users_thread_column_email_is_displayed() {
		return user_all_users_thread_column_email.isDisplayed();
	}

	public boolean user_all_users_thread_column_mobile_number_is_displayed() {
		return user_all_users_thread_column_mobile_number.isDisplayed();
	}
	
	public boolean user_all_users_thread_column_type_is_displayed(){
		return user_all_users_thread_column_type.isDisplayed();
	}

	public boolean user_all_users_thread_column_status_is_displayed() {
		return user_all_users_thread_column_status.isDisplayed();
	}

	/*
	 * Actions
	 * 
	 */
	
	public boolean users_all_users_actions_options_3_dots_is_clickable() {
		return users_all_users_actions_options_3_dots.isEnabled();
	}

	public boolean users_all_users_actions_options_3_dots_is_able_to_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, users_all_users_actions_options_3_dots);
		return true;
	}
	
	public void users_all_users_actions_options_3_dots_is_click() {
		ElementUtil.eu.clickByJS(driver, users_all_users_actions_options_3_dots);
		//users_all_users_actions_options_3_dots.click();
	}

	public boolean users_all_users_actions_option_edit_is_clickable() {
		return users_all_users_actions_option_edit.isEnabled();
	}
	
	public void users_all_users_actions_option_edit_is_click() {
		 users_all_users_actions_option_edit.click();
	}

	public boolean users_all_users_actions_option_change_status_is_clickable() {
		return users_all_users_actions_option_change_status.isEnabled();
	}

	public void users_all_users_actions_option_change_status_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, users_all_users_actions_option_change_status);
		 users_all_users_actions_option_change_status.click();
	}
	
	public boolean users_all_users_actions_option_delete_is_clickable() {
		return users_all_users_actions_option_delete.isEnabled();
	}
	
	public void users_all_users_actions_option_delete_is_click() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, users_all_users_actions_option_delete);
		 users_all_users_actions_option_delete.click();
	}
	
	public boolean user_all_users_thread_column_user_status_active_is_displayed(){
		return user_all_users_thread_column_user_status_active.isDisplayed();
	}
	
	public boolean user_all_users_thread_column_user_status_inactive_is_displayed(){
		return user_all_users_thread_column_user_status_inactive.isDisplayed();
	}

	public boolean users_all_users_actions_option_resend_email_verification_link_is_clickable() {
		return users_all_users_actions_option_resend_email_verification_link.isEnabled();
	}
	
	public void users_all_users_actions_option_resend_email_verification_link_is_click() {
		 users_all_users_actions_option_resend_email_verification_link.click();
	}

	public boolean users_all_users_actions_option_change_password_is_clickable() {
		return users_all_users_actions_option_change_password.isEnabled();
	}
	
	public void users_all_users_actions_option_change_password_is_click() {
		 users_all_users_actions_option_change_password.click();
	}

	public boolean users_all_users_actions_manage_roles_and_permissions_is_clickable() {
		return users_all_users_actions_manage_roles_and_permissions.isEnabled();
	}
	
	public boolean users_all_users_pagination_left_arrow_is_displayed(){
		return users_all_users_pagination_left_arrow.isDisplayed();
	}
	
	public boolean users_all_users_pagination_left_arrow_is_clickable(){
		return users_all_users_pagination_left_arrow.isEnabled();
	}
	
	public boolean users_all_users_pagination_left_arrow_is_able_to_mouse_hover(){
		ElementUtil.eu.scroll_end_of_page_with_keyboard_click(5);
		ElementUtil.eu.mouseHover(driver, users_all_users_pagination_left_arrow);
		return true;
	}
	
	public boolean users_all_users_pagination_numbers_one_should_be_selected_by_default(){
		boolean ac=users_all_users_pagination_numbers_one.isDisplayed();
		return ac;
	}
	
	public boolean users_all_users_pagination_numbers_should_be_displayed() {
		  for (WebElement element : users_all_users_pagination_numbers) {
	            boolean isEnabled = element.isDisplayed();
	            System.out.println("Element: " + element.getText() + " - Displayed: " + isEnabled);
	        }
		  return true;
	}
	
	public boolean users_all_users_pagination_numbers_should_be_clickable() {
		for (WebElement element : users_all_users_pagination_numbers) {
            boolean isEnabled = element.isEnabled();
            System.out.println("Element: " + element.getText() + " - isEnabled: " + isEnabled);
        }
	  return true;
}
	
	public boolean users_all_users_pagination_numbers_should_be_able_to_mouse_hover() {
		for (WebElement element : users_all_users_pagination_numbers) {
            boolean isEnabled = element.isEnabled();
            ElementUtil.eu.mouseHover(driver, element);
            System.out.println("Element: " + element.getText() + " - mouse hover: " + isEnabled);
        }
	  return true;
}
	
	public boolean users_all_users_pagination_right_arrow_is_displayed(){
		return users_all_users_pagination_right_arrow.isDisplayed();
	}
	
	public boolean users_all_users_pagination_right_arrow_is_clickable(){
		return users_all_users_pagination_right_arrow.isEnabled();
	}
	
	public boolean users_all_users_pagination_right_arrow_is_able_to_mouse_hover(){
		ElementUtil.eu.mouseHover(driver, users_all_users_pagination_right_arrow);
		return true;
	}
	
	public int users_all_users_pagination_members_count_is(){
		return users_all_users_pagination_members_count.size();
	}
	
	public void users_all_users_actions_option_manage_roles_and_permissions_is_click() {
		 users_all_users_actions_manage_roles_and_permissions.click();
	}

	public boolean users_all_users_search_not_found_is_displayed(){
		return users_all_users_search_not_found.isDisplayed();
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public String users_all_users_search_button_is_display_the_name_of_the_user(){
		return users_all_users_search_button_is_display_the_name_of_user.getText();
	}
	
	public String users_all_users_search_button_is_display_the_email_of_the_user(){
		return users_all_users_search_button_is_display_the_email_of_user.getText();
	}
	
	public String users_all_users_search_button_is_display_the_number_of_the_user(){
		return users_all_users_search_button_is_display_the_number_of_user.getText();
	}
	
	public String users_all_users_search_button_is_display_the_text_of_the_no_records_were_found(){
		return search_button_is_display_the_text_of_the_no_records_were_found.getText();
	}
	
	
	
}
