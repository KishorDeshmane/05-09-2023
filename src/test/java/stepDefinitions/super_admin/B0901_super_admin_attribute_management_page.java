package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_attributes_management_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B0901_super_admin_attribute_management_page {

	
	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_attributes_management_page_objects saamp = new Lookups_attributes_management_page_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B0901_super_admin_attribute_management_page.class);

	
	
	
	
	@Given("Verify that super admin user is on lookups attributes management page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_lookups_attributes_management_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_lookups_attributes_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that page header text should be displayed in the super admin attributes management page")
	public void verify_that_page_header_text_should_be_displayed_in_the_super_admin_attributes_management_page() {
	    boolean actual= saamp.page_header_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrub list should be displayed in the super admin attributes management page")
	public void verify_that_breadcrub_list_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.breadcrub_list_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb dashboard button should be displayed in the super admin attributes management page")
	public void verify_that_breadcrumb_dashboard_button_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.breadcrumb_dashboard_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb dashboard button should be clickable in the super admin attributes management page")
	public void verify_that_breadcrumb_dashboard_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.breadcrumb_dashboard_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb attributes management active page text should be displayed in the super admin attributes management page")
	public void verify_that_breadcrumb_attributes_management_active_page_text_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.breadcrumb_attributes_management_active_page_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page text should be displayed in the super admin attributes management page")
	public void verify_that_record_per_page_text_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.record_per_page_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page dropdown user field should be clickable in the super admin attributes management page")
	public void verify_that_record_per_page_dropdown_user_field_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.record_per_page_dropdown_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page dropdown list should be clickable in the super admin attributes management page")
	public void verify_that_record_per_page_dropdown_list_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.record_per_page_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that record per page dropdown count is {int} in the super admin attributes management page")
	public void verify_that_record_per_page_dropdown_count_is_in_the_super_admin_attributes_management_page(Integer int1) {
		int actual= saamp.record_per_page_dropdown_count_is();
	    Assert.assertSame(actual, int1);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create attributes button should be displayed in the super admin attributes management page")
	public void verify_that_create_attributes_button_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.create_attributes_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create attributes button should be clickabe in the super admin attributes management page")
	public void verify_that_create_attributes_button_should_be_clickabe_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.create_attributes_button_should_be_clickabe();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that create attributes button should be able to mouser hover in the super admin attributes management page")
	public void verify_that_create_attributes_button_should_be_able_to_mouser_hover_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.create_attributes_button_should_be_able_to_mouser_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be displayed in the super admin attributes management page")
	public void verify_that_search_user_field_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.search_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be clickable in the super admin attributes management page")
	public void verify_that_search_user_field_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.search_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field place holder value should be {string} in the super admin attributes management page")
	public void verify_that_search_user_field_place_holder_value_should_be_in_the_super_admin_attributes_management_page(String string) {
		String actual= saamp.search_user_field_place_holder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field icon should be displayed in the super admin attributes management page")
	public void verify_that_search_user_field_icon_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.search_user_field_icon_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field icon should be clickable in the super admin attributes management page")
	public void verify_that_search_user_field_icon_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.search_user_field_icon_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that thread name should be displayed in the super admin attributes management page")
	public void verify_that_thread_name_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.thread_name_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that thread name asc desc button should be clickable in the super admin attributes management page")
	public void verify_that_thread_name_asc_desc_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.thread_name_asc_desc_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that thread type should be displayed in the super admin attributes management page")
	public void verify_that_thread_type_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.thread_type_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that thread type asc desc button should be clickable in the super admin attributes management page")
	public void verify_that_thread_type_asc_desc_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.thread_type_asc_desc_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that thread status should be displayed in the super admin attributes management page")
	public void verify_that_thread_status_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.thread_status_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that thread status asc dsc button should be clickable in the super admin attributes management page")
	public void verify_that_thread_status_asc_dsc_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.thread_status_asc_dsc_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that actions text should be displayed in the super admin attributes management page")
	public void verify_that_actions_text_should_be_displayed_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.actions_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menu should be clickable in the super admin attributes management page")
	public void verify_that_kebab_menu_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.kebab_menu_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menus edit button should be clickable in the super admin attributes management page")
	public void verify_that_kebab_menus_edit_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		saamp.kebab_menu_3_dot_is_clicked();
		boolean actual= saamp.kebab_menus_edit_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menus change status button should be clickable in the super admin attributes management page")
	public void verify_that_kebab_menus_change_status_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.kebab_menus_change_status_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebeb menus delete button should be clickable in the super admin attributes management page")
	public void verify_that_kebeb_menus_delete_button_should_be_clickable_in_the_super_admin_attributes_management_page() {
		boolean actual= saamp.kebeb_menus_delete_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	
	
}
