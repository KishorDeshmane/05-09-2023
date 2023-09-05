package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_services_management_create_page_objects {
	public WebDriver driver;

	@FindBy(xpath="//*[@class='page-header']/div/h2")
	private WebElement page_header_text;
	
	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb_list;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li")
	private WebElement breadcrumb_services_button;
	
	@FindBy(xpath="//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_create_services_active_page;
	
	@FindBy(xpath="//*[@for='name']/span")
	private WebElement service_name_above_user_field;
	
	@FindBy(xpath="//*[@for='name']/span[2]")
	private WebElement service_name_asterisk_sign;
	
	@FindBy(xpath="//*[@name='name']")
	private WebElement service_name_user_field;
	
	@FindBy(xpath="//*[@for='service_category']/span")
	private WebElement service_categroy_title_above_user_field;
	
	@FindBy(xpath="//*[@for='service_category']/span[2]")
	private WebElement service_categroy_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='service_category']")
	private WebElement service_categroy_dropdown;
	
	@FindBy(xpath="//*[@name='service_category']/option")
	private List<WebElement> service_categroy_dropdown_list;
	
	@FindBy(xpath="//*[@for='short_desc']/span[1]")
	private WebElement short_description_title_text;
	
	@FindBy(xpath="//*[@for='short_desc']/span[2]")
	private WebElement short_description_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='short_desc']")
	private WebElement short_description_user_field;

	@FindBy(xpath="//*[@for='long_desc']/span[1]")
	private WebElement long_description_title_text;
	
	@FindBy(xpath="//*[@for='long_desc']/span[2]")
	private WebElement long_description_asterrisk_sign;
	
	@FindBy(xpath="//*[@name='long_desc']")
	private WebElement long_description_user_field;

	@FindBy(xpath="//span[text()='Inclusions']")
	private WebElement inclusion_title_text_above_user_field;

	@FindBy(xpath="//span[text()='Inclusions']/span[1]")
	private WebElement inclusion_asterisk_sign;

	@FindBy(xpath="//span[text()='Inclusions']/span[2]")
	private WebElement inclusion_note_of_the_title_text;

	@FindBy(xpath="//*[@name='inclusions']")
	private WebElement inclusion_user_field;

	@FindBy(xpath="//*[text()='Exclusions']")
	private WebElement exclusion_title_text_above_user_field;

	@FindBy(xpath="//*[text()='Exclusions']/span")
	private WebElement exclusion_asterisk_sign;

	@FindBy(xpath="//*[text()='Exclusions']/span[2]")
	private WebElement exclusion_note_of_the_title_text;

	@FindBy(xpath="//*[@name='exclusions']")
	private WebElement exclusion_user_field;
	
	@FindBy(xpath="//*[text()='Upload Image']")
	private WebElement upload_image_title_text;
	
	@FindBy(xpath="//*[text()='Upload Image']/span")
	private WebElement upload_image_note_title_text;
	
	@FindBy(xpath="//*[@name='profile_pic']")
	private WebElement upload_image_user_field;
	
	@FindBy(xpath="//*[text()='Is a PPM?']")
	private WebElement is_a_ppm_text;
	
	@FindBy(xpath="(//*[@id='toggleBtn'])[1]")
	private WebElement is_a_ppm_switch_button;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement is_a_ppm_switch_yes_text;
	
	@FindBy(xpath="//*[text()='No']")
	private WebElement is_a_ppm_switch_no_text;

	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_text;
	
	@FindBy(xpath="(//*[@id='toggleBtn'])[2]")
	private WebElement status_switch_button;
	
	@FindBy(xpath="//*[text()='Active']")
	private WebElement status_switch_active_text;
	
	@FindBy(xpath="//*[text()='Inactive']")
	private WebElement status_switch_inactive_text;

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

	public Lookups_services_management_create_page_objects(WebDriver driver) {
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


	public boolean breadcrumb_list_shoud_be_displayed() {
		return breadcrumb_list.isDisplayed();
	}


	public boolean breadcrumb_services_button_should_be_clickable() {
		return breadcrumb_services_button.isEnabled();
	}


	public boolean breadcrumb_active_page_text_should_be_displayed() {
		return breadcrumb_create_services_active_page.isDisplayed();
	}


	public boolean service_name_text_above_the_user_field_should_be_displayed() {
		return service_name_above_user_field.isDisplayed();
	}


	public boolean service_name_asterisk_sign_should_be_displayed() {
		return service_name_asterisk_sign.isDisplayed();
	}


	public boolean service_name_user_field_should_be_clickable() {
		return service_name_user_field.isEnabled();
	}


	public String service_name_user_field_placeholder_value() {
		return service_name_user_field.getAttribute("placeholder");
	}


	public boolean service_category_title_above_the_user_field_should_be_displayed() {
		return service_categroy_title_above_user_field.isDisplayed();
	}


	public boolean service_category_asterisk_sign_should_be_displayed() {
		return service_categroy_asterrisk_sign.isDisplayed();
	}


	public boolean service_category_dropdown_should_be_clickable() {
		return service_categroy_dropdown.isEnabled();
	}


	public boolean service_category_dropdown_list_should_be_clickable() {
		 for (WebElement listElement : service_categroy_dropdown_list) {
            System.out.println("Is the list element clickable? " + listElement.isEnabled());
        }
		return true;
	}


	public boolean short_description_title_above_the_user_field_should_be_displayed() {
		return short_description_title_text.isDisplayed();
	}


	public boolean short_description_asterisk_sign_should_be_displayed() {
		return short_description_asterrisk_sign.isDisplayed();
	}


	public boolean short_description_user_field_should_be_clickable() {
		return short_description_user_field.isEnabled();
	}


	public String short_description_user_field_placeholder_value() {
		return short_description_user_field.getAttribute("placeholder");
	}


	public boolean long_description_title_above_the_user_field_should_be_displayed() {
		return long_description_title_text.isDisplayed();
	}


	public boolean long_description_asterisk_sign_should_be_displayed() {
		return long_description_asterrisk_sign.isDisplayed();
	}


	public boolean long_description_user_field_should_be_clickable() {
		return long_description_user_field.isEnabled();
	}


	public String long_description_user_field_placeholder_value() {
		return long_description_user_field.getAttribute("placeholder");
	}


	public boolean inclusion_title_above_the_user_field_should_be_displayed() {
		return inclusion_title_text_above_user_field.isDisplayed();
	}


	public boolean inclusion_asterisk_sign_should_be_displayed() {
		return inclusion_asterisk_sign.isDisplayed();
	}


	public boolean inclusion_note_above_the_user_field_should_be_displayed() {
		return inclusion_note_of_the_title_text.isDisplayed();
	}


	public boolean inclusion_user_field_should_be_clickable() {
		return inclusion_user_field.isEnabled();
	}


	public String inclusion_user_field_placeholder_value() {
		return inclusion_user_field.getAttribute("placeholder");
	}


	public boolean exclusion_title_above_the_user_field_should_be_displayed() {
		return exclusion_title_text_above_user_field.isDisplayed();
	}


	public boolean exclusion_asterisk_sign_should_be_displayed() {
		return exclusion_asterisk_sign.isDisplayed();
	}


	public boolean exclusion_note_above_the_user_field_should_be_displayed() {
		return exclusion_note_of_the_title_text.isDisplayed();
	}


	public boolean exclusion_user_field_should_be_clickable() {
		return exclusion_user_field.isEnabled();
	}


	public String exclusion_user_field_placeholder_value() {
		return exclusion_user_field.getAttribute("placeholder");
	}


	public boolean upload_image_title_above_the_user_field_should_be_displayed() {
		return upload_image_title_text.isDisplayed();
	}


	public boolean upload_image_note_above_the_user_field_should_be_displayed() {
		return upload_image_note_title_text.isDisplayed();
	}


	public boolean upload_image_user_field_should_be_clickable() {
		return upload_image_user_field.isEnabled();
	}


	public String uplaod_image_user_field_placeholder_value() {
		return upload_image_user_field.getAttribute("placeholder");
	}


	public boolean is_a_ppm_text_is_displayed() {
		return is_a_ppm_text.isDisplayed();
	}


	public boolean is_a_ppm_switch_button_is_displayed() {
		return is_a_ppm_switch_button.isDisplayed();
	}


	public boolean is_a_ppm_switch_button_yes_text_is_displayed() {
		return is_a_ppm_switch_yes_text.isDisplayed();
	}


	public void is_a_ppm_switch_button_is_clicked() {
		is_a_ppm_switch_button.click();
	}


	public boolean is_a_ppm_switch_button_no_text_is_displayed() {
		return is_a_ppm_switch_no_text.isDisplayed();
	}


	public boolean status_text_is_displayed() {
		ElementUtil.eu.scroll_down_body_click(2, driver);
		return status_text.isDisplayed();
	}


	public boolean status_switch_button_is_displayed() {
		return status_switch_button.isDisplayed();
	}


	public boolean status_switch_button_active_text_is_displayed() {
		return status_switch_active_text.isDisplayed();
	}


	public void status_switch_button_is_clicked() {
		status_switch_button.click();
	}


	public boolean status_switch_button_inactive_text_is_displayed() {
		return status_switch_inactive_text.isDisplayed();
	}
	

	
}
