package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //giving path to where chrome driver is downloaded
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi.Arora\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximizing the window which opens
        driver.manage().window().maximize();
        //deleting all the cookies and cache
        driver.manage().deleteAllCookies();
        //adding pageLoadTimeout of 30secs so that the page is fully loaded before performing any action
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_SUBTRACT);
//        robot.keyRelease(KeyEvent.VK_SUBTRACT);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        //opening facebook
//        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805904%7Cb%7Cgooglefacebook%7C&placement=&creative=550525805904&keyword=googlefacebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221672%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-10747043725%26loc_physical_ms%3D1007765%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIxeqYzb3h_wIVJJnCCh0kFwHREAAYASAAEgL5_fD_BwE");
//        //clicking on First name input box
//        driver.findElement(By.name("firstname")).click();
//        //creating Actions class
//        Actions action = new Actions(driver);
//        //using keyboard actions to press down and shift and send the name in capital
//        action.keyDown(Keys.SHIFT);
//        action.sendKeys("Pallavi");
//        action.keyUp(Keys.SHIFT).build().perform();
//        //selecting the name
//        action.keyDown(Keys.CONTROL);
//        action.sendKeys("a");
//        action.keyUp(Keys.CONTROL).build().perform();
//        //copying the name
//        action.keyDown(Keys.CONTROL);
//        action.sendKeys("c");
//        action.keyUp(Keys.CONTROL).build().perform();
//        //clicking on last name
//        driver.findElement(By.name("lastname")).click();
//        //pasting the name in last name field
//        action.keyDown(Keys.CONTROL);
//        action.sendKeys("v");
//        action.keyUp(Keys.CONTROL).build().perform();
//        //mobile number
//        driver.findElement(By.name("reg_email__")).sendKeys("9876543212");

        //clicking on suggest password and choosing password
        //code is written below. This action can't be performed as we need to sign in to chrome to perform this
//        action.contextClick(driver.findElement(By.name("reg_passwd__"))).perform();
//        WebElement suggestPassword = driver.findElement(By.id("suggested"));
//        suggestPassword.click();

            //opening given url
            driver.get("https://smallseotools.com/plagiarism-checker/");

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,700)","");
            Actions actions = new Actions(driver);
            //uploading file
//            WebElement scroll = driver.findElement(By.name("fileUpload"));
//            js.executeScript("argument[0].scrollIntoView();",scroll);
//            driver.findElement(By.name("fileUpload")).sendKeys("C:\\Users\\Pallavi.Arora\\Downloads\\Selenium-3.0-Course-Content.pdf");

            Thread.sleep(3000);
            WebElement uploadButton = driver.findElement(By.name("fileUpload"));
            actions.moveToElement(uploadButton);
            uploadButton.sendKeys("C:\\Users\\Pallavi.Arora\\Downloads\\Selenium-3.0-Course-Content.pdf");
        }
    }