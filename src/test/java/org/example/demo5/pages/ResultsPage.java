package org.example.demo5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultsPage {

    @FindBy(css = "input#sb_form_q")
    private WebElement searchField;

    @FindBy(css = "h2 > a[href]")
    private List<WebElement> results;


    public void clickElement(int num){
        results.get(num).click();
        System.out.println("Нажатие на результат под номером " + num);

    }

    public ResultsPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
}
