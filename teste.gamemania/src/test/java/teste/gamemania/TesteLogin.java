package teste.gamemania;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:4200");
		
		//*[@id="menu"]/a[6]
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[6]")).click();
	}
	
	@Test
	public void TestarLogin( ) {
		
		WebElement campoEmail = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]"));
		WebElement campoSenha = driver.findElement(By.xpath("//*[@id=\"inputPassword\"]"));
		WebElement botao = driver.findElement(By.tagName("button"));
		
		String[] listaEmails = {"vinicius@hotmail.com", "jose@gmail.com", "ana@yahoo.com"};
		String[] listaSenhas = {"senhaaleatoria", "senhaaleatoria", "ana123"};
		
		try {
		
			for (int contador = 0; contador < 3; contador++ ) {
				campoEmail.sendKeys(listaEmails[contador]);
				campoSenha.sendKeys(listaSenhas[contador]);
				botao.click();
						
				
				Thread.sleep(3000);
				
				campoEmail.clear();
				campoSenha.clear();
			}
			
			
			
			
		/*	
			//caso de teste de Email Incorreto - OK com mensagem
			campoEmail.sendKeys("vinicius@hotmail.com");
			campoSenha.sendKeys("senhaaleatoria");
			botao.click();
					
			
			Thread.sleep(3000);
			
			campoEmail.clear();
			campoSenha.clear();
			
			//Senha incorreta para Email cadastrado - OK mensagem
			
			campoEmail.sendKeys("jose@gmail.com");
			campoSenha.sendKeys("senhaaleatoria");
			botao.click();
			
			Thread.sleep(3000);
			
			campoEmail.clear();
			campoSenha.clear();

			// Usuario correto - Nao passou para a pagina home
			
			campoEmail.sendKeys("ana@yahoo.com");
			campoSenha.sendKeys("ana123");
			botao.click();
			
			Thread.sleep(5000);
			*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@After
	public void EncerrarTeste( ) {
		driver.quit();
	}
	
}
