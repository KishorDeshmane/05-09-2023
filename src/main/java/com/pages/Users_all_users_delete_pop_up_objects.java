package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Users_all_users_delete_pop_up_objects {
	private WebDriver driver;
	
	@FindBy(xpath= "//*[@class='Toastify__toast-body']")
	private WebElement users_all_users_actions_option_delete_successfully;
	
	@FindBy(xpath= "//*[text()='Yes, delete it!']")
	private WebElement users_all_users_actions_option_yes_delete_it_pop_up;
	
	@FindBy(xpath= "//*[text()='Cancel']")
	private WebElement users_all_users_actions_option_cancel_pop_up;
	
	@FindBy(xpath="//*[@id='swal2-html-container']")
	private WebElement users_all_users_actions_option_name_of_the_user;
	
	@FindBy(xpath= "//*[text()='Are you sure?']")
	private WebElement users_all_users_actions_option_are_you_sure_pop_up;
	
	@FindBy(xpath= "//*[@id='swal2-html-container']")
	private WebElement users_all_users_actions_option_super_admin_users_all_users_actions_option_you_want_to_delete_this_user_pop_up;
	
	@FindBy(xpath = "//*[@class='swal2-icon-content']")
	private WebElement users_all_users_actions_option_i_pop_up;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Users_all_users_delete_pop_up_objects (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void users_all_users_actions_option_yes_delete_it_pop_up_is_click(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, users_all_users_actions_option_yes_delete_it_pop_up);
		users_all_users_actions_option_yes_delete_it_pop_up.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean users_all_users_actions_option_delete_successfully_is_displayed(){
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, users_all_users_actions_option_delete_successfully);
		return users_all_users_actions_option_delete_successfully.isDisplayed();
	}

	public boolean users_all_users_actions_option_bigger_i_text_is_displayed() {
		return users_all_users_actions_option_i_pop_up.isDisplayed();
	}

	public boolean users_all_users_actions_option_are_you_sure_text_is_displayed() {
		return users_all_users_actions_option_are_you_sure_pop_up.isDisplayed();
	}

	public boolean users_all_users_actions_option_yes_delete_it_button_is_clickable() {
		return users_all_users_actions_option_yes_delete_it_pop_up.isEnabled();
	}

	public boolean users_all_users_actions_option_you_want_to_delete_this_user_text_is_displayed() {
		return users_all_users_actions_option_super_admin_users_all_users_actions_option_you_want_to_delete_this_user_pop_up.isDisplayed();
	}

	public boolean users_all_users_actions_option_cancel_button_is_displayed() {
		return users_all_users_actions_option_cancel_pop_up.isDisplayed();
	}

	public boolean users_all_users_actions_option_cancel_button_is_clickable() {
		return users_all_users_actions_option_cancel_pop_up.isEnabled();
	}
	
	public boolean users_all_users_actions_option_name_of_the_user_is_displayed(){
		return users_all_users_actions_option_name_of_the_user.isDisplayed();
	}
	
	public void users_all_users_actions_option_cancel_button_is_click() {
		 users_all_users_actions_option_cancel_pop_up.click();
	}
	
}
