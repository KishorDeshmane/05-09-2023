package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_service_area_management_page_objects;
import com.pages.Lookups_service_area_management_update_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B0703_super_admin_service_area_management_update_page {

	
	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_service_area_management_page_objects sasam = new Lookups_service_area_management_page_objects(DriverFactory.getDriver());
	private Lookups_service_area_management_update_page_objects sasau=new Lookups_service_area_management_update_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(B0703_super_admin_service_area_management_update_page.class);

	
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
	 */
	
	
	@Given("Verify that super admin user is on lookups service area management edit page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_lookups_service_area_management_edit_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_mouser_masters_service_areas_is_clicked();
		sasam.user_kebab_menu_is_clicked();
		sasam.user_kebab_menu_edit_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that page header text should be displayed in the super admin service area management update page")
	public void verify_that_page_header_text_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
	    boolean actual = sasau.page_header_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that breadcrumb list should be displayed in the super admin service area management update page")
	public void verify_that_breadcrumb_list_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.breadcrumb_list_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb service area button should be displayed in the super admin service area management update page")
	public void verify_that_breadcrumb_service_area_button_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.breadcrumb_service_area_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb service area button should be clickable in the super admin service area management update page")
	public void verify_that_breadcrumb_service_area_button_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.breadcrumb_service_area_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb update service area text should be displayed in the super admin service area management update page")
	public void verify_that_breadcrumb_update_service_area_text_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.breadcrumb_update_service_area_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be displayed in the super admin service area management update page")
	public void verify_that_search_user_field_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.search_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be clickable in the super admin service area management update page")
	public void verify_that_search_user_field_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.search_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field placeholder value should be {string} in super admin service area management update page")
	public void verify_that_search_user_field_placeholder_value_should_be_in_super_admin_service_area_management_update_page(String string) {
		String actual = sasau.search_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service area text above user field should be displayed in the super admin service area management update page")
	public void verify_that_service_area_text_above_user_field_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.service_area_text_above_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service area asterisk sign should be displayed in the super admin service area management update page")
	public void verify_that_service_area_asterisk_sign_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.service_area_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service area user field should be clickable in the super admin service area management update page")
	public void verify_that_service_area_user_field_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.service_area_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service area user field placeholder value should be  {string} in the super admin service area management update page")
	public void verify_that_service_area_user_field_placeholder_value_should_be_in_the_super_admin_service_area_management_update_page(String string) {
		String actual = sasau.service_area_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that city or town text above user field should be displayed in the super admin service area management update page")
	public void verify_that_city_or_town_text_above_user_field_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.city_or_town_text_above_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that city or town asterisk sign should be displayed in the super admin service area management update page")
	public void verify_that_city_or_town_asterisk_sign_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.city_or_town_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that city or town user field should be clickable in the super admin service area management update page")
	public void verify_that_city_or_town_user_field_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.city_or_town_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that city or town user field placeholder value should be {string} in super admin service area management update page")
	public void verify_that_city_or_town_user_field_placeholder_value_should_be_in_super_admin_service_area_management_update_page(String string) {
		String actual = sasau.city_or_town_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that state or emirates text above the user field should be displayed in the super admin service area management update page")
	public void verify_that_state_or_emirates_text_above_the_user_field_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.state_or_emirates_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that state or emirates asterisk sign should be displayed in the super admin service area management update page")
	public void verify_that_state_or_emirates_asterisk_sign_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.state_or_emirates_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that state or emirates user field should be clickable in the super admin service area management update page")
	public void verify_that_state_or_emirates_user_field_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.state_or_emirates_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that state or emirates user field placeholder value should be {string} in the super admin service area management update page")
	public void verify_that_state_or_emirates_user_field_placeholder_value_should_be_in_the_super_admin_service_area_management_update_page(String string) {
		String actual = sasau.state_or_emirates_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country text above the user field should be displayed in the super admin service area management update page")
	public void verify_that_country_text_above_the_user_field_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.country_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country user field should be clickable in the super admin service area management update page")
	public void verify_that_country_user_field_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.country_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country user field placeholder value should be {string} in the super admin service area management update page")
	public void verify_that_country_user_field_placeholder_value_should_be_in_the_super_admin_service_area_management_update_page(String string) {
		String actual = sasau.country_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that po box text above the user field should be displayed in the super admin service area management update page")
	public void verify_that_po_box_text_above_the_user_field_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.po_box_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that po box user field should be clickable in the super admin service area management update page")
	public void verify_that_po_box_user_field_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.po_box_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that po box user field placeholder value should be {string} in the super admin service area management updatea page")
	public void verify_that_po_box_user_field_placeholder_value_should_be_in_the_super_admin_service_area_management_updatea_page(String string) {
		String actual = sasau.po_box_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that lattitude text should be displayed in the super admin service area management update page")
	public void verify_that_lattitude_text_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.lattitude_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that longitude text should be displayed in the super admin service area management update page")
	public void verify_that_longitude_text_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.longitude_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be displayed in the super admin service area management update page")
	public void verify_that_submit_button_should_be_displayed_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.submit_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be clickable in the super admin service area management update page")
	public void verify_that_submit_button_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.submit_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be able to mouser hover in the super admin service area management update page")
	public void verify_that_submit_button_should_be_able_to_mouser_hover_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.submit_button_should_be_able_to_mouser_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be should be displayed in the super admin service area managemenet update page")
	public void verify_that_cancel_button_should_be_should_be_displayed_in_the_super_admin_service_area_managemenet_update_page() {
		boolean actual = sasau.cancel_button_should_be_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be clickable in the super admin service area management update page")
	public void verify_that_cancel_button_should_be_clickable_in_the_super_admin_service_area_management_update_page() {
		boolean actual = sasau.cancel_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be able to mouse hover in super admin service area management update page")
	public void verify_that_cancel_button_should_be_able_to_mouse_hover_in_super_admin_service_area_management_update_page() {
		boolean actual = sasau.cancel_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
}
