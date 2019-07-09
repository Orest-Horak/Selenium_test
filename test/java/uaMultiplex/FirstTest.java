package uaMultiplex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;


public class FirstTest {
    WebDriver driver;

    @BeforeTest
    public void launch() {
        System.setProperty("webdriver.chrome.driver", "D:\\SOFTSERVE\\Silenium_test1\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://multiplex.ua/ua/");
    }

    @Test
    public void order() throws InterruptedException {
        driver.manage().window().maximize();//open page for a full screen
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"tocinemas\"]/div")).click();//open what city we want to choose
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body//div[@class=\"citylist\"]//span[text()=\"Львів\"]/..")).click();//choose lviv
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body//div[@class=\"rm_clist\"]//span[text()=\"Victoria Gardens\"]/..")).click();// choose cinema in Victoria Gardens
        driver.findElement(By.xpath("html/body//div[@class=\"mp_toright\"]")).click();//scroll right
        Thread.sleep(1000);
        driver.findElement(By.xpath("html/body//a[@class=\"mpp_title\"]//span[text()=\"Людина-павук: Далеко від дому\"]/..")).click();//choose film

        driver.findElement(By.xpath("html/body//div[@class=\"ns \"]//p[@class=\"time\"]//span[text()=\"22:20\"]/..")).click();//choose film on 22:20
        Thread.sleep(4000);
        driver.findElement(By.xpath("html/body//div[@class=\"seat-good-pm\"]//span[text()=15]")).click();//close tickets
        driver.findElement(By.xpath("html/body//div[@class=\"seat-good-pm\"]//span[text()=16]")).click();//close tickets
        driver.findElement(By.xpath("html/body//div[@class=\"seat-good-pm\"]//span[text()=17]")).click();//close tickets
        driver.findElement(By.xpath("html/body//button[@id=\"button_order_new\"]")).click();//continue
        driver.findElement(By.xpath("html/body//span[@class=\"payment-type-icon\"]/..")).click();//payment
        driver.findElement(By.xpath("html/body//div[@class=\"buy-field-holder\"]//input")).sendKeys("Orest");//input name Orest
        Thread.sleep(1000);
        driver.findElement(By.xpath("html/body//div[@class=\"buy-field-holder phone-holder\"]//input")).sendKeys("674310581");//phone number
        Thread.sleep(1500);

    }
//
//    @AfterTest
//    public void afterTest() {
//        driver.close();
//    }

}

