package stepDefinitions.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.applicationHooks.AppHooks;
import com.pages.Administrator_dashboard_page_objects;
import com.pages.Administrator_log_in_page_objects;
import com.pages.Landing_page_objects;
import com.pages.Lookups_attributes_management_change_status_pop_up_objects;
import com.pages.Lookups_attributes_management_page_objects;
import com.qa.factory.DriverFactory;
import com.qa.utility.ElementUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinitions.super_admin.B0904_super_admin_attribute_management_change_status_pop_up;

public class C0904_admin_attribute_management_change_status_pop_up {
	
	
	private Landing_page_objects lp = new Landing_page_objects(DriverFactory.getDriver());
	private Administrator_log_in_page_objects salogin = new Administrator_log_in_page_objects(DriverFactory.getDriver());
	private Administrator_dashboard_page_objects samain = new Administrator_dashboard_page_objects(DriverFactory.getDriver());
	private Lookups_attributes_management_page_objects saamp = new Lookups_attributes_management_page_objects(DriverFactory.getDriver());
	private Lookups_attributes_management_change_status_pop_up_objects sacs = new Lookups_attributes_management_change_status_pop_up_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(B0904_super_admin_attribute_management_change_status_pop_up.class);

	
	
	
	
	@Given("Verify that admin user is on lookups attributes management change status pop up page as expected page title is {string}")
	public void verify_that_admin_user_is_on_lookups_attributes_management_change_status_pop_up_page_as_expected_page_title_is(String string) {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		lp.user_log_in_to_super_admin_page();
		salogin.administrator_log_enter_email_into_the_user_field(AppHooks.prop.getProperty("Admin_email"));
		salogin.administrator_log_enter_password_into_the_user_field(AppHooks.prop.getProperty("Admin_password"));
		salogin.administrator_sign_in_button_is_clicked();
		samain.user_dashboard_lookups_button_is_clicked();
		samain.user_dashboard_lookups_attributes_is_clicked();
		saamp.kebab_menu_3_dot_is_clicked();
		saamp.kebab_menu_change_Status_button_is_clicked();
		String actual = ElementUtil.eu.current_page_title(DriverFactory.getDriver());
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	@Then("Verify that change status text should be displayed in admin attributes management change status pop up")
	public void verify_that_change_status_text_should_be_displayed_in_admin_services_management_change_status_pop_up() {
	    boolean actual = sacs.change_status_text_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cross button should be displayed in the admin attributes management change status pop up")
	public void verify_that_cross_button_should_be_displayed_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.cross_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cross button should be clickable in the admin attributes management change status pop up")
	public void verify_that_cross_button_should_be_clickable_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.cross_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that switch button should be displayed in the admin attributes management change status pop up")
	public void verify_that_switch_button_should_be_displayed_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.switch_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that switch button should be clickable in the admin attributes management change status pop up")
	public void verify_that_switch_button_should_be_clickable_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.switch_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that switch button active or inactive text is displayed in the admin attributes management change status pop up")
	public void verify_that_switch_button_active_or_inactive_text_is_displayed_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.switch_button_active_or_inactive_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that close button should be displayed in the admin attributes management change status pop up")
	public void verify_that_close_button_should_be_displayed_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.close_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that close buttton should be clickable in the admin attributes management change status pop up")
	public void verify_that_close_buttton_should_be_clickable_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.close_buttton_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that close button should be able to mouse hover in admin attributes management change status pop up")
	public void verify_that_close_button_should_be_able_to_mouse_hover_in_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.close_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be displayed in the admin attributes management change status pop up")
	public void verify_that_submit_button_should_be_displayed_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.submit_button_should_be_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that submit button should be clickable in the admin attributes management change status pop up")
	public void verify_that_submit_button_should_be_clickable_in_the_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.submit_button_should_be_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that submit button should be able to mouse hover in admin attributes management change status pop up")
	public void verify_that_submit_button_should_be_able_to_mouse_hover_in_admin_services_management_change_status_pop_up() {
		boolean actual = sacs.submit_button_should_be_able_to_mouse_hover();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
}
