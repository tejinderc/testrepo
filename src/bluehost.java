import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bluehost {

	public static int i;
	public static int j;
	public static int k;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TJ\\Desktop\\Eclipse Workplace\\Drivers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   driver.get("http://bluehost.com");
		   Thread.sleep(1100);
		   String title1 = driver.getTitle();
		   System.out.println(title1);
		   driver.findElement(By.className("btn-lg")).click();
		   Thread.sleep(1100);
		   String title2 = driver.getTitle();
		   System.out.println(title2);
		   driver.findElement(By.className("btn-md")).click();
		   Thread.sleep(1100);
		   String title3 = driver.getTitle();
		   System.out.println(title3);
		   driver.findElement(By.id("domain")).sendKeys("testingpracticelenovo");
		   Thread.sleep(1100);
		   driver.findElement(By.xpath("//input[@class='notransform btn_secondary']")).click();
		   Thread.sleep(1100);
		   String title4 = driver.getTitle();
		   System.out.println(title4);
		   driver.findElement(By.name("firstname")).sendKeys("cello");
		   Thread.sleep(1100);
		   driver.findElement(By.name("lastname")).sendKeys("milton");
		   
		   WebElement selectcountry = driver.findElement(By.xpath("//select[@id='country_input']"));
		   Select c = new Select(selectcountry);
		   Thread.sleep(1100);
		   c.selectByIndex(2);
		   Thread.sleep(11000);
		   c.selectByValue("CA");
		   Thread.sleep(12000);
		   c.selectByVisibleText("India");
		   
		   List<WebElement> option = c.getOptions();
		   int si = option.size();
		   System.out.println("Number od countries = " + si);
		   
		   for(i=0;i<si;i++)
		   {
			   WebElement options = option.get(i);
			   String countrytext = options.getText();
			   System.out.println(countrytext);
		   }
		   
		   driver.findElement(By.id("address")).sendKeys("70, kavoor road");
		   driver.findElement(By.id("city")).sendKeys("mangalore");
		   
		   WebElement stateoptions = driver.findElement(By.xpath("//select[@id='state_input']"));
		   Select state = new Select(stateoptions);
		   Thread.sleep(12000);
		   state.selectByVisibleText("Karnataka");
		   
		   List<WebElement> optionsstate = state.getOptions();
		   int sa = optionsstate.size();
		   System.out.println("Number of state option available =" + sa);
		   
		   for (j=0;j<sa;j++)
		   {
			 WebElement optionst = optionsstate.get(j);
			 String statetext = optionst.getText();
			 System.out.println(statetext);
		   }

		   driver.findElement(By.id("zip")).sendKeys("575015");
		   driver.findElement(By.id("phone")).sendKeys("9999888800");
		   driver.findElement(By.id("email")).sendKeys("sample@fndmail.com");
		  
		   WebElement planptions = driver.findElement(By.xpath("//select[@id='term']"));
		   Select pl =new Select(planptions);
		   Thread.sleep(12000);
		   pl.selectByValue("cpanel:basic-24");
		   
		   List<WebElement> Listoptions = pl.getOptions();
		   int sl = Listoptions.size();
		   System.out.println("Number of ter plan available = " + sl);
		   Thread.sleep(12000);
		   
		   for(k=0;k<sl;k++)
		   {
			   WebElement termoption = Listoptions.get(k);
			   String term = termoption.getText();
			   System.out.println(term);
		   }
		   
		   Thread.sleep(12000);
		   boolean codestatus = driver.findElement(By.id("codeguard_basic")).isSelected();
		   System.out.println("default codeguard status is " + codestatus);
		   
		   Thread.sleep(12000);
		   driver.findElement(By.id("codeguard_basic")).click();
		   
		   Thread.sleep(12000);
		   boolean checkstatus = driver.findElement(By.id("codeguard_basic")).isSelected();
		   System.out.println("codeguard check box status is : " + checkstatus);
		   
		   Thread.sleep(12000);
		   String cost = driver.findElement(By.id("totalcost")).getText();
		   System.out.println("Total cost for term plan = " + cost );
		   
		   Thread.sleep(12000);
		   boolean checkstatus1 = driver.findElement(By.id("tos_agree")).isSelected();
		   System.out.println("tos check box status is : " + checkstatus1);
		   
		   Thread.sleep(12000);
		   driver.findElement(By.id("tos_agree")).click();
		   boolean checkstatus2 = driver.findElement(By.id("tos_agree")).isSelected();
		   Thread.sleep(12000);
		   System.out.println("tos check box status is : " + checkstatus2);
		   
		   driver.close();
		   
	}	   
		   
	}