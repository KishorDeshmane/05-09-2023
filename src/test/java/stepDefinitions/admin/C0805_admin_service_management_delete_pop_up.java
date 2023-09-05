package stepDefinitions.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_services_management_delete_pop_up_objects;
import com.pages.Lookups_services_management_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class C0805_admin_service_management_delete_pop_up {

	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_services_management_page_objects sasmp= new Lookups_services_management_page_objects(DriverFactory.getDriver());
	private Lookups_services_management_delete_pop_up_objects sasad = new Lookups_services_management_delete_pop_up_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(C0805_admin_service_management_delete_pop_up.class);

	
	
	
	
	@Given("Verify that admin user is on lookups services management delete pop up as expected page title is {string}")
	public void verify_that_admin_user_is_on_lookups_services_management_delete_pop_up_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_mouser_masters_services_is_clicked();
		sasmp.kebab_menu_should_be_clicked();
		sasmp.kebeb_menus_delete_button_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that warning i icon should be displayed in the admin services management delete pop up")
	public void verify_that_warning_i_icon_should_be_displayed_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.warning_i_icon_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that are you sure text should be displayed in the admin services management delete pop up")
	public void verify_that_are_you_sure_text_should_be_displayed_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.are_you_sure_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that you want to delete this category text should be displayed in the admin services managment delete pop up")
	public void verify_that_you_want_to_delete_this_category_text_should_be_displayed_in_the_admin_services_managment_delete_pop_up() {
		boolean actual = sasad.you_want_to_delete_this_category_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that yes delete it button should be displayed in the admin services management delete pop up")
	public void verify_that_yes_delete_it_button_should_be_displayed_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.yes_delete_it_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that yes delete it button should be clickable in the admin services management delete pop up")
	public void verify_that_yes_delete_it_button_should_be_clickable_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.yes_delete_it_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that yes delete it button should be able to mouse hover in the admin services management delete pop up")
	public void verify_that_yes_delete_it_button_should_be_able_to_mouse_hover_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.yes_delete_it_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be displayed in the admin services management delete pop up")
	public void verify_that_cancel_button_should_be_displayed_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.cancel_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be clickable in the admin services management delete pop up")
	public void verify_that_cancel_button_should_be_clickable_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.cancel_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be able to mouse hover in the admin services management delete pop up")
	public void verify_that_cancel_button_should_be_able_to_mouse_hover_in_the_admin_services_management_delete_pop_up() {
		boolean actual = sasad.cancel_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
