package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.constants;

public class createRepo {
	
	public static WebDriver driver;
	public createRepo(WebDriver dr)
	{
		
		driver=dr;
	}
	@FindBy(partialLinkText = constants.SignIn)
	WebElement SignIn;
	@FindBy(name = constants.username)
	WebElement username;
	@FindBy(id = constants.password)
	WebElement password;
	@FindBy(name = constants.SignInButton)
	WebElement SignInButton;
	
	public void loginToGit() throws Exception
	{
		
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get(constants.gitUrl);
		wait.until(ExpectedConditions.visibilityOf(SignIn));
		SignIn.click();
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("mayank994");
		password.sendKeys("Mayank@85912");
		SignInButton.click();
		

		
	}
	@FindBy(partialLinkText = constants.newRepo)
	WebElement newRepo;
	@FindBy(id = constants.newRepoName)
	WebElement newRepoName;
	@FindBy(id = constants.description)
	WebElement description;
	@FindBy(id = constants.readMeCheckbox)
	WebElement readMeCheckbox;
	@FindBy(xpath = constants.createRepository)
	WebElement createRepository;
	public void newRepoCreation() throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try
		{
			
			driver.findElement(By.partialLinkText("Create")).click();
		}
		catch(Exception e)
		{
			newRepo.click();

		}
		wait.until(ExpectedConditions.visibilityOf(newRepoName));
		newRepoName.sendKeys("TestRepo");
		description.sendKeys("Hey this is a description");
		readMeCheckbox.click();
		createRepository.click();

		
		
		
	}
	@FindBy(id = constants.title)
	WebElement title;
	@FindBy(xpath = constants.issues)
	WebElement issues;
	@FindBy(xpath = constants.newIssue)
	WebElement newIssue;
	@FindBy(xpath = constants.header)
	WebElement header;
	@FindBy(xpath = constants.submitNewIssue)
	WebElement submitNewIssue;
	@FindBy(id = constants.comment)
	WebElement comment;
	public void createIssues() throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(issues));
		issues.click();
		wait.until(ExpectedConditions.visibilityOf(newIssue));
		newIssue.click();
		wait.until(ExpectedConditions.visibilityOf(title));
		title.sendKeys("Issue1");
		submitNewIssue.click();
		//issue2
		wait.until(ExpectedConditions.visibilityOf(header));
		String idOFFirstIssue=header.getText();
		issues.click();
		wait.until(ExpectedConditions.visibilityOf(newIssue));
		newIssue.click();
		wait.until(ExpectedConditions.visibilityOf(title));
		title.sendKeys("Issue2 "+idOFFirstIssue+"");
		comment.sendKeys(idOFFirstIssue);
		submitNewIssue.click();
		



		
		
	}
	
	@FindBy(id = constants.newComment)
	WebElement newComment;
	@FindBy(xpath = constants.commentAgain)
	WebElement commentAgain;
	@FindBy(xpath = constants.emoji)
	WebElement emoji;
	@FindBy(xpath = constants.firstEmoji)
	WebElement firstEmoji;
	public void commentToIssues() throws Exception
	{
		newComment.sendKeys("Hey this issue was created by me");
		
		commentAgain.click();
		emoji.click();
		firstEmoji.click();
		
		
		
		
	}
	public void mentionIssue() throws Exception
	{
		String newheader=header.getText();
		driver.findElement(By.xpath("(//*[@placeholder='Leave a comment'])[3]")).sendKeys(newheader);
		commentAgain.click();

		
		driver.findElement(By.linkText(newheader)).click();
		
		
	}
	
	@FindBy(xpath =  constants.settings)
	WebElement settings;
	@FindBy(xpath = constants.author)
	WebElement author;
	@FindBy(xpath = constants.repoName)
	WebElement repoName;
	@FindBy(xpath = constants.delete)
	WebElement delete;
	@FindBy(xpath = constants.verify)
	WebElement verify;
	@FindBy(xpath = constants.deleteThisRepository)
	WebElement deleteThisRepository;
	public void deleteRepository() throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		settings.click();
		wait.until(ExpectedConditions.visibilityOf(author));
		String user=author.getText();
		String repo=repoName.getText();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("arguments[0].scrollIntoView();", deleteThisRepository);
        deleteThisRepository.click();
		wait.until(ExpectedConditions.visibilityOf(verify));
		verify.sendKeys(user+"/"+repo);
		delete.click();
		try
		{
			if(repoName.isDisplayed())
			{
				Assert.assertTrue(false, "Something went wrong ");
			}
		}
		catch(Exception e)
		{
			
			System.out.println("Successfully Deleted");
		}




		
		
		
	}

}
