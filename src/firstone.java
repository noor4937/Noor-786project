import org.openqa.selenium.chrome.ChromeDriver;

public class firstone {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		

	}

}
