package util;

public class constants {
	//sign in
 public static final String gitUrl = "https://github.com/";
 public static final String SignIn="Sign";
 public static final String username="login";
 public static final String password="password";
 public static final String SignInButton="commit";
 public static final String startFreeTrial="//td[.='Start Free trial']";
 
 
 // new Repositories
 
 public static final String newRepo="New";
 public static final String newRepoName="repository_name";
 public static final String description="repository_description";
 public static final String readMeCheckbox="repository_auto_init";
 public static final String createRepository="//button[contains(text(),'Create')]";
 
 
 //issues creation
 
 public static final String issues="//span[contains(text(),'Issues')]";
 public static final String newIssue="//span[.='New issue']";
 public static final String title="issue_title";
 public static final String submitNewIssue="//button[contains(text(),'Submit new issue')] [not(contains(@class,'btn-block'))]";
 public static final String header="//span[@class='gh-header-number']";
 public static final String comment="issue_body";
 public static final String newComment="new_comment_field";
 public static final String commentAgain="//button[contains(text(),'Comment')]";
 public static final String emoji="(//summary[@aria-label='Add your reaction'])[1]";
 public static final String firstEmoji="(//*[@class='emoji'])[1]";
 
 public static final String settings="//span[contains(text(),'Settings')]";
 public static final String deleteThisRepository="//strong[.='Delete this repository']/../details/summary";
 public static final String author="//a[@rel='author']";
 public static final String repoName="//strong[@itemprop='name']";
 public static final String verify="(//input[contains(@aria-label,'Type ')])[last()]";
 public static final String delete="(//button[@type='submit'])[last()]";
 
}
