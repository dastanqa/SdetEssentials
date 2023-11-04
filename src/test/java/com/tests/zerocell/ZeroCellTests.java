package com.tests.zerocell;

import com.utils.factory.DriverFactory;
import com.utils.zerocell.ExcelReader;
import com.utils.zerocell.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;

public class ZeroCellTests {


    @Test(dataProvider = "getData")
    public void testcase2(TestData testData) {
        WebDriver driver = DriverFactory.getDriver(testData.getBrowser());
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys(testData.getFirstname());
        if (testData.isFTE()) {
            System.out.println(testData.getPhonenumber());
        }
        driver.quit();
    }

    @Test(dataProvider = "getData")
    public void testcase1(TestData testData) {
        WebDriver driver = DriverFactory.getDriver(testData.getBrowser());
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys(testData.getFirstname());
        if (testData.isFTE()) {
            System.out.println(testData.getPhonenumber());
        }
        driver.quit();
    }

    @DataProvider(parallel = true)
    public static Object[] getData(Method method) {
        return ExcelReader.getTestdatas()
                .stream()
                .filter(e -> e.getTestcase().equalsIgnoreCase(method.getName()))
                .toArray();

    }
}
