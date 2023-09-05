package stepDefinitions.super_admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_services_management_change_status_pop_up_objects;
import com.pages.Lookups_services_management_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class B0804_super_admin_service_management_change_status_pop_up {


	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_services_management_page_objects sasmp= new Lookups_services_management_page_objects(DriverFactory.getDriver());
	private Lookups_services_management_change_status_pop_up_objects sacs = new Lookups_services_management_change_status_pop_up_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B0804_super_admin_service_management_change_status_pop_up.class);

	
	
	
	@Given("Verify that super admin user is on lookups services management change status pop up as expected page title is {string}")
	public void verify_that_super_admin_user_is_on_lookups_services_management_change_status_pop_up_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Super_Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_mouser_masters_services_is_clicked();
		sasmp.kebab_menu_should_be_clicked();
		sasmp.kebab_menus_change_status_button_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that change status text should be displayed in super admin services management change status pop up")
	public void verify_that_change_status_text_should_be_displayed_in_super_admin_services_management_change_status_pop_up() {
	    boolean actual = sacs.change_status_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cross button should be displayed in the super admin services management change status pop up")
	public void verify_that_cross_button_should_be_displayed_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.cross_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cross button should be clickable in the super admin services management change status pop up")
	public void verify_that_cross_button_should_be_clickable_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.cross_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that switch button should be displayed in the super admin services management change status pop up")
	public void verify_that_switch_button_should_be_displayed_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.switch_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that switch button should be clickable in the super admin services management change status pop up")
	public void verify_that_switch_button_should_be_clickable_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.switch_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that switch button active or inactive text is displayed in the super admin services management change status pop up")
	public void verify_that_switch_button_active_or_inactive_text_is_displayed_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.switch_button_active_or_inactive_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that close button should be displayed in the super admin services management change status pop up")
	public void verify_that_close_button_should_be_displayed_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.close_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that close buttton should be clickable in the super admin services management change status pop up")
	public void verify_that_close_buttton_should_be_clickable_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.close_buttton_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that close button should be able to mouse hover in super admin services management change status pop up")
	public void verify_that_close_button_should_be_able_to_mouse_hover_in_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.close_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be displayed in the super admin services management change status pop up")
	public void verify_that_submit_button_should_be_displayed_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.submit_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be clickable in the super admin services management change status pop up")
	public void verify_that_submit_button_should_be_clickable_in_the_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.submit_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be able to mouse hover in super admin services management change status pop up")
	public void verify_that_submit_button_should_be_able_to_mouse_hover_in_super_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.submit_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}


	
	
}

	
	
	
	
