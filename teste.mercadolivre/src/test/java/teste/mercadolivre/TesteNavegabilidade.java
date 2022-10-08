package teste.mercadolivre;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNavegabilidade {
	private WebDriver driver;

	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mercadolivre.com.br/");
		
	}
	
	@Test
	public void TestarBusca() {
		driver.findElement(By.xpath("//*[@id=\"cb1-edit\"]")).sendKeys("amaciante");
		driver.findElement(By.xpath("//*[@id=\"cb1-edit\"]")).sendKeys(Keys.ENTER);
	}
	
}
