package org.example.step;

import com.sun.xml.internal.bind.v2.model.core.ElementInfo;
import com.thoughtworks.gauge.Step;
import org.example.test.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepImplementation extends BaseTest {
    WebDriver driver;
    private List<String> stringList=new ArrayList<>();
    private List<String> stringList2=new ArrayList<>();
    private List<String> stringList3=new ArrayList<>();
    @Step("<xpath> xpath'li element gorunur olana kadar bekle")
    public void gorunurbekleXpath(String xpath){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    @Step("<element> xpath'li elemente tikla")
    public void clickXpath(String element) {
        driver.findElement(By.xpath(element)).click();
    }
    @Step({"Go to <url> address"})
    public void goToUrl(String url) {
        driver.get(url);
    }
    @Step({"<xpath> alanına kaydır"})
    public void scrollToElement(String element) {
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(element))).build().perform();
    }

    @Step("<xpath> elementin text degeri bir dizine at")
    public void getTextList(String element){
        String text = driver.findElement(By.xpath(element)).getText();
        stringList.add(text);
    }
    @Step("<xpath> elementin text degeri ikinci bir dizine at")
    public void getTextList2(String element){
        String text = driver.findElement(By.xpath(element)).getText();
        stringList.add(text);
    }
    @Step("<xpath> elementin text degeri ucuncu bir dizine at")
    public void getTextList3(String element){
        String text = driver.findElement(By.xpath(element)).getText();
        stringList.add(text);
    }
    @Step("<xpath> li elementin oldugu kontrol edilir")
    public void checkElement(String element){
        Assert.assertTrue( "Elementi gördü",driver.findElement(By.xpath(element)).isDisplayed());

    }
    @Step("<id> id'li elemente <text> text degerini gonder")
    public void sendKeys(String id,String text){
        driver.findElement(By.id(id)).sendKeys(text);
    }

    @Step("string listenin iki elementinin esit oldugunu kontrol et")
    public void compareList(){
        assertEquals(stringList.get(0),stringList.get(1));
    }
    @Step("string2 listesinin iki elementinin esit oldugunu kontrol et")
    public void compareList2(){
        assertEquals(stringList2.get(0),stringList2.get(1));
    }
    @Step("string3 listesinin iki elementinin esit oldugunu kontrol et")
    public void compareList3(){
        assertEquals(stringList3.get(0),stringList3.get(1));
    }
}
