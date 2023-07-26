package Cucumber_ornge;

import cucumber_orangeHrm.OrangeHRM_Driver_Class;
import cucumber_orangeHrm.Orange_HRM_Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Seanarios
{
	@Given("Url: {string}")
	public void url(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
		OrangeHRM_Driver_Class .WebDriver();
	}

	@Then("orangeHrm login page is opened sucessfully")
	public void orange_hrm_login_page_is_opened_sucessfully()
	{
	    System.out.println("orange hrm page is opened successfully");
	}

	@Given("valid UserName {string}")
	public void valid_user_name(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		 Orange_HRM_Login_page.username_keys(string); 
	}

	@Then("UserName entered sucessfully")
	public void user_name_entered_sucessfully() 
	{
	   System.out.println("Entered name sucessfully");
	}

	@Given("valid Password {string}")
	public void valid_password(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		 Orange_HRM_Login_page.password_keys(string);
	}

	@Then("Password entered sucessfully")
	public void password_entered_sucessfully() 
	{
	   System.out.println("password entered succfully");
	}

	@Then("click on login button")
	public void click_on_login_button()
	{
	    // Write code here that turns the phrase above into concrete actions
		 Orange_HRM_Login_page.loginbutton_keys();
	}

	@Then("dashboard page is displayed sucessfully")
	public void dashboard_page_is_displayed_sucessfully() {
	   System.out.println("dashboard dislpayed successfully");
	}


}
