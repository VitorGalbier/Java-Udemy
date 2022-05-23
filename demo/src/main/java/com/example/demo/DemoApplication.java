package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//webdriver é uma interfaceque implementa metodos, os browser seguem as regras padro~es da interface
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);

		//Webdriver methods + class methods;
		//Se eu utilizar apenas o ChromeDriver, pode ser que eu não tenha acesso a algumas funcionalidades
		//selenium vai invocar chromedriver.exe, que invoca o crhome browser
		//selenium vai buscar por webdriver.chrome.driver -> que tem o valor da variável path
		//permitir todos os ips
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		//       				chave 						valor
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\Java-Udemy\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ge.globo.com/");
		driver.getTitle();
		driver.getCurrentUrl();

		//quit X close - quit fecha todas as janelas associadas, close só a janela que está aberta
		driver.close();
	}

}
