package LoginAutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainLoginPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("the title is " + driver.getTitle());
        Scanner UserName = new Scanner(System.in);
        String UN;
        Scanner Password = new Scanner(System.in);
        String Pass;
        System.out.println("Please Enter The User Name");
        UN = UserName.nextLine();
        System.out.println("Please Enter The Password");
        Pass = Password.nextLine();
        //if (UN == "standard_user" && Pass == "secret_sauce") {
            driver.findElement(By.name("user-name")).sendKeys(UN);
            driver.findElement(By.name("password")).sendKeys(Pass);
            driver.findElement(By.name("login-button")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();



        // }
        }
    }

