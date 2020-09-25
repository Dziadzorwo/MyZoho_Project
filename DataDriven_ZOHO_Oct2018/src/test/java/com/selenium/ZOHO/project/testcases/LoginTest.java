package com.selenium.ZOHO.project.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.ZOHO.project.base.BaseTest;
import com.selenium.ZOHO.project.util.DataUtil;
import com.selenium.ZOHO.project.util.Xls_Reader;

import java.util.HashMap;
import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{

	String testCaseName = "LoginTest";
	SoftAssert softAssert;
	Xls_Reader xls;
	
	@BeforeMethod
	public void init() {
		softAssert = new SoftAssert();
	}
	
	
	@Test(dataProvider = "getData")
	public void doLoginTest(Hashtable<String, String> data) {
		// log test progress
		test = rep.startTest("LoginTest");
		test.log(LogStatus.INFO , data.toString());
		
		if(!DataUtil.isRunnable(testCaseName, xls)|| data.get("Runmode").equals("N")) {
			test.log(LogStatus.SKIP, "Skipping the test as runmode is N");
			throw new SkipException("Skipping the test as runmode is N");
		}
		
		openBrowser(data.get("Browser"));
		navigate("appurl");
		doLogin(data.get("Username"), data.get("Password"));
		
		//boolean actualResult = doLogin(data.get("Username"), data.get("Password"));
		
		/* boolean expectedResult = false;
		if(data.get("ExpectedResult").equals("Y")&& actualResult==true) {
			expectedResult = true;
			reportPass("Login Test Passed");
			
		}else {
			expectedResult = false;
			reportFailure("Login Test Failed");
		}
		*/
		
		
	}
	
	
	
	
	@AfterMethod
	public void quit(){
		try{
			softAssert.assertAll();
		}catch(Error e){
			test.log(LogStatus.FAIL, e.getMessage());
		}
		if(rep!=null){
			rep.endTest(test);
			rep.flush();
		}
		
		if(driver!=null)
			driver.close();
	}
	
	
	@DataProvider (parallel = false)
	public Object[][] getData(){
		super.init();
		xls = new Xls_Reader(prop.getProperty("xlspath"));
		return DataUtil.getTestData(xls, testCaseName);
		
	}
	
}
