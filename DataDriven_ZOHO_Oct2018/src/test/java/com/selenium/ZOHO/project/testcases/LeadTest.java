package com.selenium.ZOHO.project.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LeadTest {
	//

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
