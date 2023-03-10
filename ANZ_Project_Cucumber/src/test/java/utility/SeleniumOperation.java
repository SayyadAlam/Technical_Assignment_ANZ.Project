package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperation
{    
	
	public static ChromeDriver driver=null;
	public static void blaunch(Object[]inputParameters)
	{
		String strkey=(String) inputParameters[0];
		String strval=(String) inputParameters[1];
		System.setProperty("webdriver.chrome.driver", strval);
		 driver=new ChromeDriver();  
		 driver.manage().window().maximize();
		} 
	
	public static void openApp(Object[]inputParameters)
	{
		String strurl=(String) inputParameters[0];
		driver.get(strurl);
	}
	public static void clickOnElement(Object[]inputParameters)
	{
	String Xpath=(String) inputParameters[0];
	driver.findElementByXPath(Xpath).click();
	}
	public static void select(Object[]inputParameters)
	{
		String Xpath=(String) inputParameters[0];

		Select dependant=new Select(driver.findElementByXPath(Xpath));
		dependant.selectByIndex(0);
	}
	public static void sendKeys(Object[]inputParameters)
	{
		String Xpath=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.findElementByXPath(Xpath).sendKeys(value);
	}
	
	public static void main(String[] args)
	{
		Object[] input1=new Object[2];
		input1[0]="chrome";
		input1[1]="./Drivers\\chromedriver.exe";
		SeleniumOperation.blaunch(input1);
		
		Object[] input2=new Object[1];
		input2[0]="https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";
		SeleniumOperation.openApp(input2);
		
		Object[] input3=new Object[1];
		input3[0]="//*[@for='application_type_single']";
        SeleniumOperation.clickOnElement(input3);
        
        Object[] input4=new Object[1];
        input4[0]="//*[@title='Number of dependants']";
	    SeleniumOperation.select(input4);
	    
	    Object[] input5=new Object[1];
		input5[0]="//*[@for='borrow_type_home']";
        SeleniumOperation.clickOnElement(input5);
	    
        Object[] input6=new Object[2];
		input6[0]="(//*[@value='0'])[1]";
		input6[1]="80000";
		SeleniumOperation.sendKeys(input6);
		
		Object[] input7=new Object[2];
		input7[0]="(//*[@value='0'])[2]";
		input7[1]="10000";
		SeleniumOperation.sendKeys(input7);
		
		Object[] input8=new Object[2];
		input8[0]="//*[@class='required']";
		input8[1]="500";
		SeleniumOperation.sendKeys(input8);
		
		Object[] input9=new Object[2];
		input9[0]="//*[@id='homeloans']";
		input9[1]="0";
		SeleniumOperation.sendKeys(input9);

		Object[] input10=new Object[2];
		input10[0]="//*[@id='otherloans']";
		input10[1]="100";
		SeleniumOperation.sendKeys(input10);
		
		Object[] input11=new Object[2];
		input11[0]="(//*[@value='0'])[8]";
		input11[1]="0";
		SeleniumOperation.sendKeys(input11);
		
		Object[] input12=new Object[2];
		input12[0]="(//*[@value='0'])[9]";
		input12[1]="10000";
		SeleniumOperation.sendKeys(input12);
		
		Object[] input13=new Object[1];
		input13[0]="//*[@id='btnBorrowCalculater']";
        SeleniumOperation.clickOnElement(input13);
		
	}
}
