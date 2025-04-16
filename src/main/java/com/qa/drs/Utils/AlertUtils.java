package com.qa.drs.Utils;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertUtils {
    private WebDriver driver;

    public AlertUtils(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAlertPresent() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void acceptAlert() {
        
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert accepted: " + alert.getText());
            alert.accept();
        
    }

    public void dismissAlert() {
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert dismissed: " + alert.getText());
            alert.dismiss();
        }
    }

    public String getAlertText() {
        if (isAlertPresent()) {
            return driver.switchTo().alert().getText();
        }
        return null;
    }

    public void sendTextToAlert(String input) {
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys(input);
            alert.accept();
        }
    }
}
