package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Landing_page_objects;
import com.pages.Lookups_service_area_management_page_objects;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B0701_super_admin_service_area_management_page {

	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_service_area_management_page_objects sasam = new Lookups_service_area_management_page_objects(DriverFactory.getDriver());

	Logger logger = LogManager.getLogger(B0701_super_admin_service_area_management_page.class);

	
	
	
	
	
	
	@Given("Verify that super admin user is on lookups service area management page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_lookups_service_area_management_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_mouser_masters_service_areas_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service area management title text is displayed in the super admin service area management page")
	public void verify_that_service_area_management_title_text_is_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.user_service_area_management_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that breadcrumb list should be displayed in the super admin service area management page")
	public void verify_that_breadcrumb_list_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.breadcrumb_list_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that breadcrumb dashboard button should be clickable in the super admin service area management page")
	public void verify_that_breadcrumb_dashboard_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.breadcrumb_dashboard_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb dashbaord button should be displayed in the super admin service area management page")
	public void verify_that_breadcrumb_dashbaord_button_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.breadcrumb_dashbaord_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb current page service areas text should be displayed in the super admin service area management page")
	public void verify_that_breadcrumb_current_page_service_areas_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.breadcrumb_current_page_service_areas_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page text should be displayed in the super admin service area management page")
	public void verify_that_record_per_page_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.record_per_page_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page dropdown should be displayed in super admin service area management page")
	public void verify_that_record_per_page_dropdown_should_be_displayed_in_super_admin_service_area_management_page() {
		boolean actual = sasam.record_per_page_dropdown_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page dropdown list should be {int} in the super admin service area management page")
	public void verify_that_record_per_page_dropdown_list_should_be_in_the_super_admin_service_area_management_page(Integer int1) {
		int actual = sasam.record_per_page_dropdown_list_should_be_something();
		Assert.assertSame(actual, int1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that record per page dropdown list should be clickable in the super admin service area management page")
	public void verify_that_record_per_page_dropdown_list_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.record_per_page_dropdown_list_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that create service area button should be displayed in the super admin service area management page")
	public void verify_that_create_service_area_button_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.create_service_area_button_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that create service area button should be clickable in the super admin service area managament page")
	public void verify_that_create_service_area_button_should_be_clickable_in_the_super_admin_service_area_managament_page() {
		boolean actual = sasam.user_create_service_area_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that search user field should be displayed in the super admin service area management page")
	public void verify_that_search_user_field_should_be_displayed_in_the_super_admin_service_area_management_page() {
	    boolean actual = sasam.search_user_field_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user fied placeholder value should be {string} in the super admin service area management page")
	public void verify_that_search_user_fied_placeholder_value_should_be_in_the_super_admin_service_area_management_page(String string) {
		String actual = sasam.search_user_fied_placeholder_value();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be clickable in the super admin service area management page")
	public void verify_that_search_user_field_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.search_user_field_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search icon should be displayed in the super admin service area management page")
	public void verify_that_search_icon_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.search_user_field_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search icon should be clickable in the super admin service area management page")
	public void verify_that_search_icon_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.search_icon_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread area text should be displayed in the super admin service area management page")
	public void verify_that_table_thread_area_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_area_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread area asc or desc button should be clickable in the super admin service area management page")
	public void verify_that_table_thread_area_asc_or_desc_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_area_asc_or_desc_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread city or town text should be displayed in the super admin service area management page")
	public void verify_that_table_thread_city_or_town_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_city_or_town_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread city or town asc or desc button should be clickable in the super admin service area management page")
	public void verify_that_table_thread_city_or_town_asc_or_desc_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_city_or_town_asc_or_desc_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table therad state or emairate text should be displayed in the super admin service area management page")
	public void verify_that_table_therad_state_or_emairate_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_therad_state_or_emairate_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread po box text should be displayed in the super admin service area management page")
	public void verify_that_table_thread_po_box_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_po_box_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread status text shoul be displayed in the super admin service area management page")
	public void verify_that_table_thread_status_text_shoul_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_status_text_shoul_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	@Then("Verify that table thread status asc dsec button should be clickable in the super admin service area management page")
	public void verify_that_table_thread_status_asc_dsec_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_status_asc_dsec_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that table thread action text should be displayed in the super admin service area management page")
	public void verify_that_table_thread_action_text_should_be_displayed_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.table_thread_action_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menu should be clickable in the super admin service area management page")
	public void verify_that_kebab_menu_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.kebab_menu_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menus edit button should be clickable in the super admin service area management page")
	public void verify_that_kebab_menus_edit_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		sasam.user_kebab_menu_is_clicked();
		boolean actual = sasam.kebab_menus_edit_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menus change status button should be clickable in the super admin service area management page")
	public void verify_that_kebab_menus_change_status_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.kebab_menus_change_status_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menus delete button should be clickable in the super admin service area management page")
	public void verify_that_kebab_menus_delete_button_should_be_clickable_in_the_super_admin_service_area_management_page() {
		boolean actual = sasam.kebab_menus_delete_button_should_be_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	
	
}
