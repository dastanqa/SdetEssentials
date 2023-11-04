package com.tests.owner;

import com.utils.owner.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerWithOwnerLibrary {

    //if property file and the framework config interface are in same package it will auto recognize
    //but they are always seperate
    //so we must tell where the prperty file is present in the interface
    public static void main(String[] args) {
        FrameworkConfig frameworkConfig = ConfigFactory.create(FrameworkConfig.class);
        System.out.println(frameworkConfig.browser());

        frameworkConfig.browser().name();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(frameworkConfig.timeout(), frameworkConfig.value());

        if(frameworkConfig.takesscreenshot()){
            //code
        }

        frameworkConfig.favtools().forEach(System.out::println);
        System.out.println(frameworkConfig.timeout());
    }
}
