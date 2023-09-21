package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.abhibus.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("bus-link")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
      
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
        
        driver.findElement(By.xpath("//a[text()='Today']")).click();
        
        String text = driver.findElement(By.xpath("//h5[text()='Yolo Bus']")).getText();
        System.out.println(text);
        
        driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
        
        String text2 = driver.findElement(By.xpath("//div[@class='text-grey']")).getText();
        System.out.println(text2);
        
        driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
        
        driver.findElement(By.xpath("//span[text()='Available']")).click();
        
        driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
        
        driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
        
        String text3 = driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']")).getText();
        System.out.println(text3);
        
        String title = driver.getTitle();
        System.out.println(title);
        
        
        
       
        
        
        

	}

}
