package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");//
        WebElement input = driver.findElement(By.cssSelector("input[title='Поиск']"));
        input.click();
        input.sendKeys("github");
        input.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        WebElement wikiLink = driver.findElement(By.linkText("Википедия"));
        String wikiLinkString = wikiLink.getAttribute("href");
        System.out.println(wikiLinkString);
        driver.quit();
    }
}
