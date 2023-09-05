package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_services_management_page_objects;
import com.pages.Lookups_services_management_update_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B0803_super_admin_service_management_update_page {

	
	
	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_services_management_page_objects sasmp= new Lookups_services_management_page_objects(DriverFactory.getDriver());
	private Lookups_services_management_update_page_objects sasmu = new Lookups_services_management_update_page_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B0803_super_admin_service_management_update_page.class);

	
	
	
	
	
	
	
	@Given("Verify that super admin user is on lookups services management update page as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_lookups_services_management_update_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_mouser_masters_services_is_clicked();
		sasmp.kebab_menu_should_be_clicked();
		sasmp.kebab_menus_edit_button_should_be_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that page header text should be displayed in the super admin update services management page")
	public void verify_that_page_header_text_should_be_displayed_in_the_super_admin_update_services_management_page() {
	    boolean actual = sasmu.page_header_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb list shoud be displayed in the super admin update services management page")
	public void verify_that_breadcrumb_list_shoud_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.breadcrumb_list_shoud_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb services button should be clickable in the super admin update services mangement page")
	public void verify_that_breadcrumb_services_button_should_be_clickable_in_the_super_admin_update_services_mangement_page() {
		boolean actual = sasmu.breadcrumb_services_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that breadcrumb active page text should be displayed in the super admin update services management page")
	public void verify_that_breadcrumb_active_page_text_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.breadcrumb_active_page_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service name text above the user field should be displayed in the super admin update services management page")
	public void verify_that_service_name_text_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_name_text_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service name asterisk sign should be displayed in the super admin update services management page")
	public void verify_that_service_name_asterisk_sign_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_name_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service name user field should be clickable in the super admin update services management page")
	public void verify_that_service_name_user_field_should_be_clickable_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_name_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service name user field placeholder value should be {string} in the super admin update services management page")
	public void verify_that_service_name_user_field_placeholder_value_should_be_in_the_super_admin_update_services_management_page(String string) {
		String actual = sasmu.service_name_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category title above the user field should be displayed in the super admin update services management page")
	public void verify_that_service_category_title_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_category_title_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category asterisk sign should be displayed in the super admin update services management page")
	public void verify_that_service_category_asterisk_sign_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_category_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category dropdown should be clickable in the super admin update services management page")
	public void verify_that_service_category_dropdown_should_be_clickable_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_category_dropdown_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that service category dropdown  list should be clickable in the super admin update services management page")
	public void verify_that_service_category_dropdown_list_should_be_clickable_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.service_category_dropdown_list_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that short description title above the user field should be displayed in the super admin update services management page")
	public void verify_that_short_description_title_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.short_description_title_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that short description asterisk sign should be displayed in the super admin update services management page")
	public void verify_that_short_description_asterisk_sign_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.short_description_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that short description user field should be clickable in the super admin update services managemene page")
	public void verify_that_short_description_user_field_should_be_clickable_in_the_super_admin_update_services_managemene_page() {
		boolean actual = sasmu.short_description_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that short description user field placeholder value should be {string} in the super admin update services management page")
	public void verify_that_short_description_user_field_placeholder_value_should_be_in_the_super_admin_update_services_management_page(String string) {
		String actual = sasmu.short_description_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that long description title above the user field should be displayed in the super admin update services management page")
	public void verify_that_long_description_title_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.long_description_title_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that long description asterisk sign should be displayed in the super admin update services management page")
	public void verify_that_long_description_asterisk_sign_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.long_description_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that long description user field should be clickable in the super admin update services managemene page")
	public void verify_that_long_description_user_field_should_be_clickable_in_the_super_admin_update_services_managemene_page() {
		boolean actual = sasmu.long_description_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that long description user field placeholder value should be {string} in the super admin update services management page")
	public void verify_that_long_description_user_field_placeholder_value_should_be_in_the_super_admin_update_services_management_page(String string) {
		String actual = sasmu.long_description_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that inclusion title above the user field should be displayed in the super admin update services management page")
	public void verify_that_inclusion_title_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.inclusion_title_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that inclusion asterisk sign should be displayed in the super admin update services management page")
	public void verify_that_inclusion_asterisk_sign_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.inclusion_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that inclusion note above the user field should be displayed in the super admin update services management page")
	public void verify_that_inclusion_note_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.inclusion_note_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that inclusion user field should be clickable in the super admin update services managemene page")
	public void verify_that_inclusion_user_field_should_be_clickable_in_the_super_admin_update_services_managemene_page() {
		boolean actual = sasmu.inclusion_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that inclusion user field placeholder value should be {string} in the super admin update services management page")
	public void verify_that_inclusion_user_field_placeholder_value_should_be_in_the_super_admin_update_services_management_page(String string) {
		String actual = sasmu.inclusion_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that exclusion title above the user field should be displayed in the super admin update services management page")
	public void verify_that_exclusion_title_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.exclusion_title_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that exclusion asterisk sign should be displayed in the super admin update services management page")
	public void verify_that_exclusion_asterisk_sign_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.exclusion_asterisk_sign_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that exclusion note above the user field should be displayed in the super admin update services management page")
	public void verify_that_exclusion_note_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.exclusion_note_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that exclusion user field should be clickable in the super admin update services managemene page")
	public void verify_that_exclusion_user_field_should_be_clickable_in_the_super_admin_update_services_managemene_page() {
		boolean actual = sasmu.exclusion_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that exclusion user field placeholder value should be {string} in the super admin update services management page")
	public void verify_that_exclusion_user_field_placeholder_value_should_be_in_the_super_admin_update_services_management_page(String string) {
		String actual = sasmu.exclusion_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that upload image title above the user field should be displayed in the super admin update services management page")
	public void verify_that_upload_image_title_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.upload_image_title_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that upload image note above the user field should be displayed in the super admin update services management page")
	public void verify_that_upload_image_note_above_the_user_field_should_be_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.upload_image_note_above_the_user_field_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that upload image user field should be clickable in the super admin update services managemene page")
	public void verify_that_upload_image_user_field_should_be_clickable_in_the_super_admin_update_services_managemene_page() {
		boolean actual = sasmu.upload_image_user_field_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that uplaod image user field placeholder value should be {string} in the super admin update services management page")
	public void verify_that_uplaod_image_user_field_placeholder_value_should_be_in_the_super_admin_update_services_management_page(String string) {
		String actual = sasmu.uplaod_image_user_field_placeholder_value();
	    Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that is a ppm text is displayed in the super admin update services management page")
	public void verify_that_is_a_ppm_text_is_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.is_a_ppm_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that is a ppm switch button is displayed in the super admin update services management page")
	public void verify_that_is_a_ppm_switch_button_is_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.is_a_ppm_switch_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that is a ppm switch button yes text is displayed in the super admin update management page")
	public void verify_that_is_a_ppm_switch_button_yes_text_is_displayed_in_the_super_admin_update_management_page() {
		boolean actual = sasmu.is_a_ppm_switch_button_yes_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that is a ppm switch button no text is displayed in the super admin update management page")
	public void verify_that_is_a_ppm_switch_button_no_text_is_displayed_in_the_super_admin_update_management_page() {
		sasmu.is_a_ppm_switch_button_is_clicked();
		boolean actual = sasmu.is_a_ppm_switch_button_no_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status text is displayed in the super admin update services management page")
	public void verify_that_status_text_is_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.status_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status switch button is displayed in the super admin update services management page")
	public void verify_that_status_switch_button_is_displayed_in_the_super_admin_update_services_management_page() {
		boolean actual = sasmu.status_switch_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status switch button active text is displayed in the super admin update management page")
	public void verify_that_status_switch_button_active_text_is_displayed_in_the_super_admin_update_management_page() {
		boolean actual = sasmu.status_switch_button_active_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that status switch button inactive text is displayed in the super admin update management page")
	public void verify_that_status_switch_button_inactive_text_is_displayed_in_the_super_admin_update_management_page() {
		sasmu.status_switch_button_is_clicked();
		boolean actual = sasmu.status_switch_button_inactive_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
