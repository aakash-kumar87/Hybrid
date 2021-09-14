package com.lifecycle.testscripts.Release302;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.reporting.Reporting;

@Test(groups = { "regression","CUR-1351"})
public class VerifyURLIsOpenedInNewTab extends BaseDriverUtil{
	
	private boolean flag;

	@Test(groups = { "regression", "TSFS" ,"CUR-1618"})
	
	public void VerifyUrl ()
	{
		Reporting.setReportingValues(this.getClass().getName());
		try 
		{
			setup(driver);
			CurriculumHomePage home = new CurriculumHomePage(driver);
			home.search("3409");
			ActionDriver action = new ActionDriver(driver);
			List<WebElement> url=driver.findElements(By.xpath("//div[@id='intro']//p//a"));
			
			for (WebElement webElement : url) {
				
				flag = action.isElementDisplayed(By.xpath("//div[@id='intro']//a[contains(text(),'Read More ')]"));
				if (flag)
				{
					action.click(By.xpath("//div[@id='intro']//a[contains(text(),'Read More ')]"), "Read more link ");
					Thread.sleep(500);
				}
				
				action.newTabOpened(webElement);
				
			}
			
			
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
}
