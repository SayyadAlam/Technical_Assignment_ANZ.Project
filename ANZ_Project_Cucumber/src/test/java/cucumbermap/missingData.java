package cucumbermap;

import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class missingData 
{


@When("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_open_browser_with_exe(String arg1, String arg2) throws Throwable {
		Object[] input1=new Object[2];
		input1[0]=arg1;
		input1[1]=arg2;
		SeleniumOperation.blaunch(input1);
	}

	@When("^user enter url as \"([^\"]*)\"$")
	public void user_enter_url_as(String arg1) throws Throwable {
		Object[] input2=new Object[1];
		input2[0]=arg1;
		SeleniumOperation.openApp(input2);
	}

	@When("^user click on Single Application type$")
	public void user_click_on_Single_Application_type() throws Throwable {
		Object[] input3=new Object[1];
		input3[0]="//*[@for='application_type_single']";
        SeleniumOperation.clickOnElement(input3);
	}

	@When("^user select (\\d+)as Number of dependants$")
	public void user_select_as_Number_of_dependants(int arg1) throws Throwable {
		Object[] input4=new Object[1];
        input4[0]="//*[@title='Number of dependants']";
	    SeleniumOperation.select(input4); 
	}

	@When("^user click on Home to live ins$")
	public void user_click_on_Home_to_live_ins() throws Throwable {
		Object[] input5=new Object[1];
		input5[0]="//*[@for='borrow_type_home']";
        SeleniumOperation.clickOnElement(input5);
	    
	}

	@When("^user enter \"([^\"]*)\" as a Your annual income$")
	public void user_enter_as_a_Your_annual_income(String arg1) throws Throwable {
		  Object[] input6=new Object[2];
			input6[0]="(//*[@value='0'])[1]";
			input6[1]=arg1;
			SeleniumOperation.sendKeys(input6);
	}

	@When("^user enter \"([^\"]*)\" as a Your annual other income$")
	public void user_enter_as_a_Your_annual_other_income(String arg1) throws Throwable {
		Object[] input7=new Object[2];
		input7[0]="(//*[@value='0'])[2]";
		input7[1]=arg1;
		SeleniumOperation.sendKeys(input7);  
	}

	@When("^user enter \"([^\"]*)\" as a Monthly living expenses$")
	public void user_enter_as_a_Monthly_living_expenses(String arg1) throws Throwable {
		Object[] input8=new Object[2];
		input8[0]="//*[@class='required']";
		input8[1]=arg1;
		SeleniumOperation.sendKeys(input8);
	}

	@When("^user enter \"([^\"]*)\" as a Current home loan monthly repayments$")
	public void user_enter_as_a_Current_home_loan_monthly_repayments(String arg1) throws Throwable {
		Object[] input9=new Object[2];
		input9[0]="//*[@id='homeloans']";
		input9[1]=arg1;
		SeleniumOperation.sendKeys(input9); 
	}

	@When("^user enter \"([^\"]*)\" as a Other loan monthly repayments$")
	public void user_enter_as_a_Other_loan_monthly_repayments(String arg1) throws Throwable {
		Object[] input10=new Object[2];
		input10[0]="//*[@id='otherloans']";
		input10[1]=arg1;
		SeleniumOperation.sendKeys(input10);
	}

	@When("^user enter \"([^\"]*)\" as a Other monthly commitments$")
	public void user_enter_as_a_Other_monthly_commitments(String arg1) throws Throwable {
		Object[] input11=new Object[2];
		input11[0]="(//*[@value='0'])[8]";
		input11[1]=arg1;
		SeleniumOperation.sendKeys(input11);
	}

	@When("^user enter \"([^\"]*)\" as a Total credit card limits$")
	public void user_enter_as_a_Total_credit_card_limits(String arg1) throws Throwable {
		Object[] input12=new Object[2];
		input12[0]="(//*[@value='0'])[9]";
		input12[1]=arg1;
		SeleniumOperation.sendKeys(input12);
	}

	@When("^user click on work out how much I can borrow$")
	public void user_click_on_work_out_how_much_I_can_borrow() throws Throwable {
		Object[] input13=new Object[1];
		input13[0]="//*[@id='btnBorrowCalculater']";
        SeleniumOperation.clickOnElement(input13);
	  
	}
}
