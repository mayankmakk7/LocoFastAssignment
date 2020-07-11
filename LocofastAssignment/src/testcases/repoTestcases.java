package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.createRepo;
public class repoTestcases extends testbase {
	
	
	@BeforeSuite
	public void initiate()
	{
		init();
	}
	@Test()
	public void repositoryTestcases() throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		createRepo tp=PageFactory.initElements(driver, createRepo.class);
		tp.loginToGit();	
		tp.newRepoCreation();
		tp.createIssues();
		tp.commentToIssues();
		tp.mentionIssue();
		tp.deleteRepository();
		
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		
	}

}
