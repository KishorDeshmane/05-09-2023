package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_attributes_management_page_objects;
import com.pages.Lookups_attributes_management_update_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B0903_super_admin_attribute_management_update_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_attributes_management_page_objects saamp = new Lookups_attributes_management_page_objects(DriverFactory.getDriver());
	private Lookups_attributes_management_update_page_objects saamc = new Lookups_attributes_management_update_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(B0903_super_admin_attribute_management_update_page.class);

	
	
	
	
	
	@Given("Verify that super admin user is on lookups update attributes management page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_lookups_update_attributes_management_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_lookups_attributes_is_clicked();
		saamp.kebab_menu_3_dot_is_clicked();
		saamp.kebab_menu_edit_or_update_button_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	@Then("Verify that page header text should be displayed in the super admin update attributes management page")
	public void verify_that_page_header_text_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
	    boolean actual = saamc.page_header_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("verify that breadcrumb list should be displayed in the super admin update attributes management page")
	public void verify_that_breadcrumb_list_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.breadcrumb_list_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb attributes button should be clickable in the super admin update attributes management page")
	public void verify_that_breadcrumb_attributes_button_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.breadcrumb_attributes_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that active page text should be displayed in the super admin update attributes management page")
	public void verify_that_active_page_text_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.active_page_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes name text above the user field should be displayed in the super admin update attributes management page")
	public void verify_that_attributes_name_text_above_the_user_field_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_name_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes name asterisk sign should be displayed in the super admin update attributes management page")
	public void verify_that_attributes_name_asterisk_sign_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_name_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes name userfield should be clickable in the super admin update attributes management page")
	public void verify_that_attributes_name_userfield_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_name_userfield_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes name placeholder value should be {string} in the super admin update attributes management page")
	public void verify_that_attributes_name_placeholder_value_should_be_in_the_super_admin_update_attributes_management_page(String string) {
		String actual = saamc.attributes_name_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attribute type text should be displayed in the super admin update attributes management page")
	public void verify_that_attribute_type_text_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attribute_type_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes type asterisk sign should be displayed in the super admin update attributes management page")
	public void verify_that_attributes_type_asterisk_sign_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_type_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes type dropdown should be clickable in the super admin update attributes management page")
	public void verify_that_attributes_type_dropdown_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_type_dropdown_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes type dropdown list should be clickable in the super admin update attributes management page")
	public void verify_that_attributes_type_dropdown_list_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_type_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes value text should be displayed above the user field in the super admin update attributes management page")
	public void verify_that_attributes_value_text_should_be_displayed_above_the_user_field_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_value_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes value asterisk sign should be displayed in the super admin update attributes management page")
	public void verify_that_attributes_value_asterisk_sign_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_value_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes value note should be displayed  in the super admin update attributes management page")
	public void verify_that_attributes_value_note_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_value_noet_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attributes value user field should be clickable in the super admin update attributes management page")
	public void verify_that_attributes_value_user_field_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.attributes_value_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that attribute value placeholder value should be {string} in the super admin update attributes management page")
	public void verify_that_attribute_value_placeholder_value_should_be_in_the_super_admin_update_attributes_management_page(String string) {
		String actual = saamc.attribute_value_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status text should be displayed in the super admin update attributes management page")
	public void verify_that_status_text_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.status_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status button should be clickable in the super admin update attributes management page")
	public void verify_that_status_button_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.status_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status button text active should be displayed in the super admin update attributes management page")
	public void verify_that_status_button_text_active_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.status_button_text_active_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status button text inactive should be displayed in the super admin update attributes management page")
	public void verify_that_status_button_text_inactive_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		saamc.status_button_should_be_clicked();
		boolean actual = saamc.status_button_text_inactive_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@Then("Verify that submit button should be displayed in the super admin update attributes management page")
	public void verify_that_submit_button_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.submit_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be clickable in the super admin update attributes management page")
	public void verify_that_submit_button_should_be_clickable_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.submit_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@Then("Verify that submit button shuld be able to mouse hover in the super admin update attributes management page")
	public void verify_that_submit_button_shuld_be_able_to_mouse_hover_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.submit_button_shuld_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be displayed in the super admin update attributes management page")
	public void verify_that_cancel_button_should_be_displayed_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.cancel_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be clickble in the super admin update attributes management page")
	public void verify_that_cancel_button_should_be_clickble_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.cancel_button_should_be_clickble();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be able to mouse hover in the super admin update attributes management page")
	public void verify_that_cancel_button_should_be_able_to_mouse_hover_in_the_super_admin_update_attributes_management_page() {
		boolean actual = saamc.cancel_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
}
