package uaMultiplex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        driver.findElement(By.xpath("html/body//div[@class=\"selector\"]")).click();//select date
        Thread.sleep(1000);
        driver.findElement(By.xpath("html/body//li[@data-selector=\"11072019\"]")).click();//choose film on thursday 11.07.19
        Thread.sleep(3000);

//        WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body//div[@class=\"ns \"]//p[@class=\"time\"]//span[text()=\"10:15\"]/..")));
        driver.findElement(By.xpath("html/body//div[@data-id=\"0000000020-39423\"]//p[@class=\"time\"]//span[text()=\"23:10\"]/..")).click();// chose hour 23:10

        Thread.sleep(4000);

//        driver.findElement(By.xpath("html/body//div[@id=\"div5011\"]//span[text()=\"18\"]/..")).click();//choose tickets
//        driver.findElement(By.xpath("html/body//div[@id=\"div5000\"]//span[text()=\"19\"]/..")).click();//choose tickets
//
//        driver.findElement(By.xpath("html/body//button[@id=\"button_order_new\"]")).click();//continue
//        driver.findElement(By.xpath("html/body//span[@class=\"payment-type-icon\"]/..")).click();//payment
//        driver.findElement(By.xpath("html/body//div[@class=\"buy-field-holder\"]//input")).sendKeys("Orest");//input name Orest
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("html/body//div[@class=\"buy-field-holder phone-holder\"]//input")).sendKeys("674310581");//phone number
//        Thread.sleep(1500);

      
    }
//
//    @AfterTest
//    public void afterTest() {
//        driver.close();
//    }

}

