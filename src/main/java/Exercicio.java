import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Exercicio {
    public static void main(String[] args) throws InterruptedException{
        //Setando o Driver
        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        //Acessando o site
        driver.get("https://practicetestautomation.com/practice-test-login");

        Thread.sleep(2000); //Pequena espera

        //Encontrar a caixa de username e depois digitar o username
        WebElement txtUsername = driver.findElement(By.id("username"));
        txtUsername.sendKeys("student");
        Thread.sleep(2000);

        // Encontrar a caixa de password e depois digitar a senha
        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("Password123");
        Thread.sleep(2000);

        //Encontrar o botão Submit e pressionar o botão
        WebElement buttonSubmit = driver.findElement(By.id("submit"));
        Thread.sleep(2000);
        buttonSubmit.click();



    }
}
