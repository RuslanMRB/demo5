package org.example.demo5.tests;

import org.example.demo5.pages.MainPage;
import org.example.demo5.pages.ResultsPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BingSearchTest {
    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bing.com/");


    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {
        String input = "Selenium";
        MainPage mp = new MainPage(driver);
        mp.sendText(input);
        //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        // wait.until(ExpectedConditions.and(
        //        ExpectedConditions.attributeContains(By.cssSelector("h2 > a[href]"), "href", "selenium"),
        //       ExpectedConditions.elementToBeClickable(By.cssSelector("h2 > a[href]"))
        //  ));
        ResultsPage rp = new ResultsPage(driver);
        rp.clickElement(0);
       // ArrayList tabs = new ArrayList<> (driver.getWindowHandles());
        // driver.switchTo().window(tabs.get(1).toString());
        //  String url = driver.getCurrentUrl();
        // assertEquals(url, "https://www.selenium.dev/");
        // WebElement searchField = driver.findElement(By.cssSelector("input#sb_form_q"));
        // searchField.sendKeys(input);
        // searchField.submit();
        //List<WebElement> fff = driver.findElements(By.cssSelector("h2 > a[href]"));
        //for (WebElement el : fff){
         //System.out.println(el.getText());
        //}
     // fff.get(0).click();
       // List results = driver.findElements(By.cssSelector("h2 > a[href]"));
     //clickElement(fff, 0);
       // ArrayList tabs = new ArrayList<> (driver.getWindowHandles());
       // driver.switchTo().window(tabs.get(1).toString());
       // String url = driver.getCurrentUrl();
        //assertEquals(url, "https://www.selenium.dev/");
        //WebElement searchPageField = driver.findElement(By.cssSelector("#sb_form_q"));
        //assertEquals(input, searchPageField.getAttribute("value"));
    }
   //public void clickElement(List<WebElement> fff, int nomer){
     //   fff.get(nomer).click();
   //}
}
