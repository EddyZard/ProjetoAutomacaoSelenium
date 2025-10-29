import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestaSite2 {

    public static void main(String[] args) throws InterruptedException{
        // Setando o caminho do driver
        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        // Abrindo a página desejada
        driver.get("https://www.webpagetest.org/");

        //maximizando a janela do browser
        driver.manage().window().maximize();

        //redirezionar o browser  para o site da Udemy
        driver.navigate().to("https://www.udemy.com/");

        //printando qual é a URL atual
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        //dando f5 na página
        driver.navigate().refresh();

        WebElement txtbusca = driver.findElement(By.id(("search-form-autocomplete--6032")));
        txtbusca.sendKeys("Curso de Java");
        txtbusca.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        //fechando o navegador
        driver.quit();

    }
}
