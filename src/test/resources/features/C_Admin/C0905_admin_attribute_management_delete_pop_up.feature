@Admin_attributes_management_delete_pop_up
Feature: Validate admin attributes management delete pop up functionality

  @Smoke
  Scenario: Validate that elements is present with admin attributes management delete pop up
    Given Verify that admin user is on lookups attributes management delete pop up page as expected page title is "Shield"
    Then Verify that warning i icon should be displayed in the admin attributes management delete pop up
    Then Verify that are you sure text should be displayed in the admin attributes management delete pop up
    Then Verify that you want to delete this category text should be displayed in the admin attributes managment delete pop up
    Then Verify that yes delete it button should be displayed in the admin attributes management delete pop up
    Then Verify that yes delete it button should be clickable in the admin attributes management delete pop up
    Then Verify that yes delete it button should be able to mouse hover in the admin attributes management delete pop up
    Then Verify that cancel button should be displayed in the admin attributes management delete pop up
    Then Verify that cancel button should be clickable in the admin attributes management delete pop up
    Then Verify that cancel button should be able to mouse hover in the admin attributes management delete pop up
