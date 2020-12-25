package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static WebDriver driver;
    public static final String PASSWORD = "302911AsD";

    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    public static void main( String[] args ) throws InterruptedException {
        getDriver();
        test1(driver);
        test2(driver);
        driver.quit();


    }

    public static void test1(WebDriver driver) {
        driver.get("https://www.diary.ru/");
        System.out.println("Page title is: " + driver.getTitle());
        WebElement input = driver.findElement(By.id("drop-login"));
        input.click();
        WebElement login = driver.findElement(By.id("usrlog2"));
        login.click();
        login.sendKeys("Дино_завр");
        WebElement password = driver.findElement(By.id("usrpass2"));
        password.click();
        password.sendKeys(PASSWORD);
        WebElement input1 = driver.findElement(By.xpath("//*[@id=\"loginform\"]/form/button"));
        input1.click();
        WebElement check1 = driver.findElement(By.linkText("Дино_завр"));
        new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(check1));
        WebElement drop = driver.findElement(By.id("drop"));
        drop.click();
        WebElement exit = driver.findElement(By.linkText("Выход"));
        exit.click();


    }

    public static void test2(WebDriver driver) {
        driver.get("https://www.diary.ru");
        System.out.println("Page title is: " + driver.getTitle());
        WebElement input = driver.findElement(By.id("drop-login"));
        input.click();
        WebElement login = driver.findElement(By.id("usrlog2"));
        login.click();
        login.sendKeys("Дино_завр");
        WebElement password = driver.findElement(By.id("usrpass2"));
        password.click();
        password.sendKeys(PASSWORD);
        WebElement input1 = driver.findElement(By.xpath("//*[@id=\"loginform\"]/form/button"));
        input1.click();
        WebElement check1 = driver.findElement(By.linkText("Дино_завр"));
        new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(check1));
        WebElement newRecord = driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div/ul[2]/li[2]/a"));
        newRecord.click();
        WebElement check2 = driver.findElement(By.linkText("Динозаврыч"));
        new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(check2));
        WebElement title = driver.findElement(By.id("postTitle"));
        title.click();
        title.sendKeys("AutoTestWeb");
        WebElement msg = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        msg.click();
        msg.sendKeys("Auto test№2 OK");
        WebElement save = driver.findElement(By.id("rewrite"));
        save.click();
        WebElement drop = driver.findElement(By.id("drop"));
        drop.click();
        WebElement exit = driver.findElement(By.linkText("Выход"));
        exit.click();
        driver.quit();




    }
}
