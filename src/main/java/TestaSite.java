import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestaSite {
    public static void main(String[] args) throws InterruptedException{
        // Setando o caminho do driver
        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        // Abrindo a página desejada
        driver.get("https://www.webpagetest.org/");

        // Digitando em uma caixa de texto com id "url"
        WebElement txtUrl = driver.findElement(By.id("url"));
        txtUrl.sendKeys("Teste com Selenium");

        // Pegando o componente(botão) que está com o contexto Start Testing
        WebElement botao = driver.findElement(By.xpath("//button[text()='Start Testing']"));
    }
}
