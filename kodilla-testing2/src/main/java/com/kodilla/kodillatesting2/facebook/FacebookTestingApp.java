package com.kodilla.kodillatesting2.facebook;

import com.kodilla.kodillatesting2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIES = "//div[@class=\"_al64\"]/button[2]";
    public static final String XPATH_SIGNUP = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com/");

        while (!webDriver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).isDisplayed());

        WebElement acceptCookies = webDriver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        acceptCookies.click();

        WebElement signUp = webDriver.findElement(By.xpath(XPATH_SIGNUP));
        signUp.click();

        WebElement day = webDriver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(9);

        WebElement month = webDriver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(7);

        WebElement year = webDriver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(1);
    }
}
