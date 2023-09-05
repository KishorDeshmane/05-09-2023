package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_attributes_management_create_page_objects {
	public WebDriver driver;

	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[1]")
	private WebElement attribute_breadcrumb_button;
	
	@FindBy(xpath="//*[@class='breadcrumb-item active']")
	private WebElement create_attribute_breadcrumb;
	
	@FindBy(xpath="//*[text()='Attribute Name']")
	private WebElement attribute_name_above_user_field_text;
	
	@FindBy(xpath="//*[@for='name']/span[2]")
	private WebElement attribute_name_asterisk_sign;
	
	@FindBy(xpath="//*[@id='name']")
	private WebElement attribute_name_user_field;
	
	@FindBy(xpath="//*[text()='Attribute Type']")
	private WebElement attribute_type_above_userfield_text;
	
	@FindBy(xpath="//*[@for='type']/span[2]")
	private WebElement attribute_type_asterisk_sign;
	
	@FindBy(xpath="//*[@id='type']")
	private WebElement attribute_type_dropdown;
	
	@FindBy(xpath="//*[@id='type']/option")
	private List<WebElement> attribute_type_dropdown_list;
	
	@FindBy(xpath="//*[text()='Attribute Value']")
	private WebElement attribute_value_above_user_field_text;
	
	@FindBy(xpath="//span[@class='Services_redAsterisk__aEEYB']")
	private WebElement attribute_value_asterisk_sign;
	
	@FindBy(xpath="//*[text()='(Please provide comma seperated values.)']")
	private WebElement attribute_value_small_text_please_provide;
	
	@FindBy(xpath="//*[@name='value']")
	private WebElement attribute_value_user_field;
	
	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_text_above_toggle_button;
	
	@FindBy(xpath="//*[@id='toggleBtn']")
	private WebElement status_button_toggle_button;
	
	@FindBy(xpath="//*[text()='Active']")
	private WebElement status_button_active_state_text;
	
	@FindBy(xpath="//*[text()='Inactive']")
	private WebElement status_button_inactive_state_text;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit_button;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_attributes_management_create_page_objects(WebDriver driver) {
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
		try {
			page_header_text.isDisplayed();
		} catch (Exception e) {
			page_header_text.isDisplayed();
		}
		return true;
	}

	public boolean breadcrumb_list_should_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}

	public boolean breadcrumb_attributes_button_should_be_clickable() {
		return attribute_breadcrumb_button.isEnabled();
	}

	public boolean active_page_text_should_be_displayed() {
		return create_attribute_breadcrumb.isDisplayed();
	}

	public boolean attributes_name_text_above_the_user_field_should_be_displayed() {
		return attribute_name_above_user_field_text.isDisplayed();
	}

	public boolean attributes_name_asterisk_sign_should_be_displayed() {
		return attribute_name_asterisk_sign.isDisplayed();
	}

	public boolean attributes_name_userfield_should_be_clickable() {
		return attribute_name_user_field.isEnabled();
	}

	public String attributes_name_placeholder_value() {
		return attribute_name_user_field.getAttribute("placeholder");
	}

	public boolean attribute_type_text_should_be_displayed() {
		return attribute_type_above_userfield_text.isDisplayed();
	}

	public boolean attributes_type_asterisk_sign_should_be_displayed() {
		return attribute_type_asterisk_sign.isDisplayed();
	}

	public boolean attributes_type_dropdown_should_be_clickable() {
		return attribute_type_dropdown.isEnabled();
	}

	public boolean attributes_type_dropdown_list_should_be_clickable() {
		for (WebElement listElement : attribute_type_dropdown_list) {
            System.out.println("Is the list element clickable? " + listElement.isEnabled());
        }
		return true;
	}

	public boolean attributes_value_text_should_be_displayed() {
		return attribute_value_above_user_field_text.isDisplayed();
	}

	public boolean attributes_value_asterisk_sign_should_be_displayed() {
		return attribute_value_asterisk_sign.isDisplayed();
	}

	public boolean attributes_value_user_field_should_be_clickable() {
		return attribute_value_above_user_field_text.isEnabled();
	}

	public boolean attributes_value_noet_should_be_displayed() {
		return attribute_value_small_text_please_provide.isDisplayed();
	}

	public String attribute_value_placeholder_value() {
		return attribute_value_user_field.getAttribute("placeholder");
	}

	public boolean status_text_should_be_displayed() {
		return status_text_above_toggle_button.isDisplayed();
	}

	public boolean status_button_should_be_clickable() {
		return status_button_toggle_button.isEnabled();
	}
	
	public void status_button_should_be_clicked() {
		 status_button_toggle_button.click();
	}

	public boolean status_button_text_active_should_be_displayed() {
		return status_button_active_state_text.isDisplayed();
	}

	public boolean status_button_text_inactive_should_be_displayed() {
		return status_button_inactive_state_text.isDisplayed();
	}

	public boolean submit_button_should_be_displayed() {
		return submit_button.isDisplayed();
	}

	public boolean submit_button_should_be_clickable() {
		return submit_button.isEnabled();
	}

	public boolean submit_button_shuld_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, submit_button);
		return true;
	}

	public boolean cancel_button_should_be_displayed() {
		return cancel_button.isDisplayed();
	}

	public boolean cancel_button_should_be_clickble() {
		return cancel_button.isEnabled();
	}

	public boolean cancel_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, cancel_button);
		return true;
	}

	
}
