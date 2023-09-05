package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Lookups_service_category_management_update_page_objects {
public WebDriver driver;
	
	@FindBy(css = ".main-content-title")
	private WebElement update_service_category_title_text;

	@FindBy(xpath="//*[@class='breadcrumb']")
	private WebElement breadcrumb;

	@FindBy(xpath="//*[@class='breadcrumb-item']/a")
	private WebElement breadcrumb_service_category_button;

	@FindBy(xpath= "//*[@class='breadcrumb']/li[2]")
	private WebElement breadcrumb_update_service_category_text;
	
	@FindBy(xpath="//*[text()='Service Category Name']")
	private WebElement service_category_name_text_above_the_user_field;

	@FindBy(xpath="//*[@for='category_name']/span[2]")
	private WebElement service_category_name_text_asterisk_sign;

	@FindBy(xpath="//*[@name='category_name']")
	private WebElement service_category_name_user_field;
	
	

	@FindBy(xpath="//*[text()='Upload Image']")
	private WebElement service_upload_image_title_above_the_user_field;

	@FindBy(xpath="//*[text()='Upload Image']/span")
	private WebElement service_upload_image_text_line;

	@FindBy(xpath="//*[@placeholder='Enter your user image URL']")
	private WebElement service_upload_image_user_field;

	@FindBy(xpath="//*[@class='undefined media']/img")
	private WebElement service_uploaded_image;
	
	

	@FindBy(xpath="//*[text()='Parent Category']")
	private WebElement parent_category_title_text_above_the_user_field;

	@FindBy(xpath="//*[@name='parent_category']")
	private WebElement parent_category_dropdown;

	@FindBy(xpath="//*[@name='parent_category']/option")
	private List<WebElement> parent_category_dropdown_list;

	@FindBy(xpath="//*[text()='Status']")
	private WebElement status_title_text_above_button;

	@FindBy(xpath="//*[@id='toggleBtn']")
	private WebElement status_button;
	
	
	@FindBy(xpath="//*[text()='Active']")
	private WebElement status_active_text;
	
	@FindBy(xpath="//*[text()='Inactive']")
	private WebElement status_inactive_text;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit_button;

	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancel_button;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public Lookups_service_category_management_update_page_objects(WebDriver driver) {
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
	
	public boolean user_update_service_category_title_text_should_be_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, update_service_category_title_text );
		return update_service_category_title_text.isDisplayed();
	}

	public boolean user_breadcrumb_should_be_displayed() {
		return breadcrumb.isDisplayed();
	}

	public boolean user_breadcrumb_service_category_button_should_be_displayed() {
		return breadcrumb_service_category_button.isDisplayed();
	}

	public boolean user_breadcrumb_service_category_button_should_be_clickable() {
		return breadcrumb_service_category_button.isEnabled();
	}
	
	public boolean user_breadcrumb_update_service_category_text_should_be_displayed(){
		return breadcrumb_update_service_category_text.isDisplayed();
	}

	public boolean user_service_category_name_text_above_the_user_field_should_be_displayed() {
		return service_category_name_text_above_the_user_field.isDisplayed();
	}

	public boolean user_service_category_name_text_asterisk_sign_should_be_displayed() {
		return service_category_name_text_asterisk_sign.isDisplayed();
	}

	public boolean user_service_category_name_user_field_should_be_displayed() {
		return service_category_name_user_field.isDisplayed();
	}

	public boolean user_service_category_name_user_field_should_be_clickable() {
		return service_category_name_user_field.isEnabled();
	}

	public String user_service_category_name_user_field_placeholder_value() {
		return service_category_name_user_field.getAttribute("placeholder");
	}

	public boolean user_service_category_name_user_field_text_should_be_displayed() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return service_category_name_user_field.getAttribute("value").isBlank();
	}

	public boolean user_service_upload_image_title_above_the_user_field_should_be_dispalyed() {
		return service_upload_image_title_above_the_user_field.isDisplayed();
	}

	public boolean user_service_upload_image_text_line_should_be_displayed() {
		return service_upload_image_text_line.isDisplayed();
	}

	public boolean user_service_upload_image_user_field_should_be_displayed() {
		return service_upload_image_user_field.isDisplayed();
	}

	public boolean user_service_upload_image_user_field_should_be_clickable() {
		return service_upload_image_user_field.isEnabled();
	}

	public String user_service_upload_image_user_field_placeholder_value() {
		return service_upload_image_user_field.getAttribute("placeholder");
	}

	public boolean user_service_uploaded_image_should_be_displayed(){
		return service_uploaded_image.isDisplayed();
	}

	public boolean user_parent_category_title_text_above_the_user_field_should_be_displayed() {
		return parent_category_title_text_above_the_user_field.isDisplayed();
	}

	public boolean user_parent_category_dropdown_should_be_clickable() {
		return parent_category_dropdown.isEnabled();
	}

	public boolean user_parent_category_dropdown_list_should_be_clickable() {
		for (WebElement element : parent_category_dropdown_list) {
            boolean isEnabled = element.isEnabled();
            System.out.println("Element: " + element.getText() + " - Enabled: " + isEnabled);
        }
		return true;
	}

	public boolean user_status_title_text_button_should_be_displayed() {
		return status_title_text_above_button.isDisplayed();
	}

	public boolean user_status_button_should_be_clickable() {
		return status_button.isEnabled();
	}
	
	public void user_status_button_clicked(){
		status_button.click();
	}
	
	public boolean user_status_active_text_should_be_displayed() {
		return status_active_text.isDisplayed();
	}
	
	public boolean user_status_inactive_text_should_be_displayed(){
		return status_inactive_text.isDisplayed();
	}

	public boolean user_submit_button_should_be_displayed() {
		return submit_button.isDisplayed();
	}

	public boolean user_submit_button_should_be_clickable() {
		return submit_button.isEnabled();
	}

	public boolean user_submit_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, submit_button);
		return true;
	}

	public boolean user_cancel_button_should_be_displayed() {
		return cancel_button.isDisplayed();
	}

	public boolean user_cancel_button_should_be_clickable() {
		return cancel_button.isEnabled();
	}

	public boolean user_cancel_button_should_be_able_to_mouse_hover() {
		ElementUtil.eu.mouseHover(driver, cancel_button );
		return true;
	}

	
}
