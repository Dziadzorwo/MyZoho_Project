package com.selenium.ZOHO.project.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PotentialTest {
	@Test (priority=1)
	public void createPotentialTest(){
	}
	@Test(priority=2, dependsOnMethods={"createPotentialTest"})
	public void deletePotentialAccountTest(){
	}
}
