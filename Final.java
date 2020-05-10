import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit ;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Final {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// 1st Rail
				 DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
			        // current Date
			        Date date = new Date();
			        String curDate= dateFormat.format(date);
			        Date currentDate = dateFormat.parse(curDate);
			         
			        System.setProperty("webdriver.chrome.driver","D:\\Greedygame\\chromedriver.exe");
			        WebDriver dr = new ChromeDriver();
			        dr.manage().window().maximize();
			        
			        dr.get("https://play.google.com/store/apps/top");
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        
			        //1st rail
			        for (int i=1;i<7;i++){
			              //1st Rail 1st element
			        dr.findElement(By.xpath("//body//c-wiz//c-wiz//c-wiz//c-wiz[1]//c-wiz[1]//div[1]//div[2]//div["+i+"]//c-wiz[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]")).click();
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        String name = dr.findElement(By.xpath("//h1[contains(@class,'AHFaub')]//span")).getText();
			        String reviews = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/c-wiz/div/div/div/div/div/div/c-wiz/span/span[1]")).getText();;
			        String lupdate = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/div/div/div/div[1]/span[1]/div[1]/span[1]")).getText();
			       
			        Date relaseDate1 = dateFormat.parse(lupdate);
			        long diffInMillies1 = Math.abs(currentDate.getTime() - relaseDate1.getTime());
			        long lastUpdate = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
			        
			        //calculate score
			        long review1 = Long.parseLong(reviews.replace(",",""));
			        double score1 = ((double)review1/lastUpdate);

			        dr.navigate().back();
			        System.out.println("Name of Application = "+ name);
			        System.out.println("Reviews = " +reviews);
			        System.out.println("Days of last updated ="+lastUpdate);
			        System.out.println("Score = "+score1);
			        System.out.println();
			        }
			        
			        //2nd Rail
			        for (int i=1;i<7;i++){
			              //2nd Rail 1st element
			        dr.findElement(By.xpath("//c-wiz[2]//c-wiz[1]//div[1]//div[2]//div["+i+"]//c-wiz[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]")).click();
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        String name1 = dr.findElement(By.xpath("//h1[contains(@class,'AHFaub')]//span")).getText();
			        String reviews1 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/c-wiz/div/div/div/div/div/div/c-wiz/span/span[1]")).getText();;
			        String lupdate1 = dr.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div[2]//span[1]//div[1]//span[1]")).getText();
			       
			        Date relaseDate1 = dateFormat.parse(lupdate1);
			        long diffInMillies1 = Math.abs(currentDate.getTime() - relaseDate1.getTime());
			        long lastUpdate1 = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
			        
			        //calculate score
			        long review1 = Long.parseLong(reviews1.replace(",",""));
			        double score1 = ((double)review1/lastUpdate1);

			        dr.navigate().back();
			        System.out.println("Name of Application = "+ name1);
			        System.out.println("Reviews = " +reviews1);
			        System.out.println("Days of last updated ="+lastUpdate1);
			        System.out.println("Score = "+score1);
			        System.out.println();
			        }
			        
			        //3rd Rail
			        for (int i=1;i<7;i++){
			              //3rd Rail 1st element
			        dr.findElement(By.xpath("//c-wiz[3]//c-wiz[1]//div[1]//div[2]//div["+i+"]//c-wiz[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]")).click();
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        String name2 = dr.findElement(By.xpath("//h1[contains(@class,'AHFaub')]//span")).getText();
			        String reviews2 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/c-wiz/div/div/div/div/div/div/c-wiz/span/span[1]")).getText();;
			        String lupdate2 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/div/div/div/div[1]/span[1]/div[1]/span[1]")).getText();
			       
			        Date relaseDate2 = dateFormat.parse(lupdate2);
			        long diffInMillies1 = Math.abs(currentDate.getTime() - relaseDate2.getTime());
			        long lastUpdate2 = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
			        
			        //calculate score
			        long review2 = Long.parseLong(reviews2.replace(",",""));
			        double score1 = ((double)review2/lastUpdate2);

			        dr.navigate().back();
			        System.out.println("Name of Application = "+ name2);
			        System.out.println("Reviews = " +reviews2);
			        System.out.println("Days of last updated ="+lastUpdate2);
			        System.out.println("Score = "+score1);
			        System.out.println();
			        }
			        
			        //4th Rail
			        for (int i=1;i<7;i++){
			              //4th Rail 1st element
			        dr.findElement(By.xpath("//c-wiz[4]//c-wiz[1]//div[1]//div[2]//div["+i+"]//c-wiz[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]")).click();
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        String name3 = dr.findElement(By.xpath("//h1[contains(@class,'AHFaub')]//span")).getText();
			        String reviews3 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/c-wiz/div/div/div/div/div/div/c-wiz/span/span[1]")).getText();;
			        String lupdate3 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/div/div/div/div[1]/span[1]/div[1]/span[1]")).getText();
			       
			        Date relaseDate3 = dateFormat.parse(lupdate3);
			        long diffInMillies1 = Math.abs(currentDate.getTime() - relaseDate3.getTime());
			        long lastUpdate3 = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
			        
			        //calculate score
			        long review2 = Long.parseLong(reviews3.replace(",",""));
			        double score1 = ((double)review2/lastUpdate3);

			        dr.navigate().back();
			        System.out.println("Name of Application = "+ name3);
			        System.out.println("Reviews = " +reviews3);
			        System.out.println("Days of last updated ="+lastUpdate3);
			        System.out.println("Score = "+score1);
			        System.out.println();
			        }
			        
			      //5th Rail
			        for (int i=1;i<7;i++){
			              //5th Rail 1st element
			        dr.findElement(By.xpath("//c-wiz[5]//c-wiz[1]//div[1]//div[2]//div["+i+"]//c-wiz[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]")).click();
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        String name4 = dr.findElement(By.xpath("//h1[contains(@class,'AHFaub')]//span")).getText();
			        String reviews4 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/c-wiz/div/div/div/div/div/div/c-wiz/span/span[1]")).getText();;
			        String lupdate4 = dr.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div[2]//span[1]//div[1]//span[1]")).getText();
			       
			        Date relaseDate4 = dateFormat.parse(lupdate4);
			        long diffInMillies1 = Math.abs(currentDate.getTime() - relaseDate4.getTime());
			        long lastUpdate4 = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
			        
			        //calculate score
			        long review1 = Long.parseLong(reviews4.replace(",",""));
			        double score1 = ((double)review1/lastUpdate4);

			        dr.navigate().back();
			        System.out.println("Name of Application = "+ name4);
			        System.out.println("Reviews = " +reviews4);
			        System.out.println("Days of last updated ="+lastUpdate4);
			        System.out.println("Score = "+score1);
			        System.out.println();
			        }

			        //6th Rail
			        for (int i=1;i<7;i++){
			              //6th Rail 1st element
			        dr.findElement(By.xpath("//c-wiz[6]//c-wiz[1]//div[1]//div[2]//div["+i+"]//c-wiz[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]")).click();
			        dr.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
			        String name5 = dr.findElement(By.xpath("//h1[contains(@class,'AHFaub')]//span")).getText();
			        String reviews5 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/c-wiz/div/div/div/div/div/div/c-wiz/span/span[1]")).getText();;
			        String lupdate5 = dr.findElement(By.xpath("//body/div/div/c-wiz/div/div/div/div/div/c-wiz/div/div/div/div[1]/span[1]/div[1]/span[1]")).getText();
			       
			        Date relaseDate5 = dateFormat.parse(lupdate5);
			        long diffInMillies1 = Math.abs(currentDate.getTime() - relaseDate5.getTime());
			        long lastUpdate5 = TimeUnit.DAYS.convert(diffInMillies1, TimeUnit.MILLISECONDS);
			        
			        //calculate score
			        long review5 = Long.parseLong(reviews5.replace(",",""));
			        double score5 = ((double)review5/lastUpdate5);

			        dr.navigate().back();
			        System.out.println("Name of Application = "+ name5);
			        System.out.println("Reviews = " +reviews5);
			        System.out.println("Days of last updated ="+lastUpdate5);
			        System.out.println("Score = "+score5);
			        System.out.println();
			        }
			        

	}

}
