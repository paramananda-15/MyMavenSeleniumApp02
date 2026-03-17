package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        driver.findElement(By.id("username")).sendKeys("student");

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        driver.findElement(By.id("password")).sendKeys("Password123");

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        driver.findElement(By.id("submit")).click();

        try { Thread.sleep(5000); } catch (InterruptedException e) {}

        System.out.println("Page Title After Login: " + driver.getTitle());

        driver.quit();
    }
}
