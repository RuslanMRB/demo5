package org.example.demo5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//https://www.bing.com/

public class MainPage {

   // private WebDriver driver;

    @FindBy(css = "input#sb_form_q")
    private WebElement searchField;

    public void sendText(String text){
        searchField.sendKeys(text);
        searchField.submit();
        System.out.println("Введен текст: " + text);
        //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        // wait.until(ExpectedConditions.and(
        //       ExpectedConditions.attributeContains(By.cssSelector("h2 > a[href]"), "href", "selenium"),
        //       ExpectedConditions.elementToBeClickable(By.cssSelector("h2 > a[href]"))
        //   ));
    }

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
