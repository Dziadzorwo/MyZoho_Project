package com.selenium.ZOHO.project.testcases;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;
//package com.selenium.zoho.project.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.selenium.ZOHO.project.base.BaseTest;
import com.selenium.ZOHO.project.util.DataUtil;
import com.selenium.ZOHO.project.util.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;


public class LeadTest {


@Test (priority=1)
public void createLeadTest(){
}
@Test(priority=2, dependsOnMethods={"createLeadTest"})
public void convertLeadTest(){
}
@Test(priority=3, dependsOnMethods={"createLeadTest","convertLeadTest" })
public void deleteLeadAccountTest(){
}
}
