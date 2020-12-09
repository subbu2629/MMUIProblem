package com.mm.qa.pages;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mm.qa.Util.TestBase;


public class loginPage extends TestBase{

	//Page objects initialization
	public loginPage(){
		
		PageFactory.initElements(driver, this);
	}

		
	@FindBy(id = "lbl_val_1")
	private WebElement Value1;
	public WebElement getValue1()
	{
		return Value1;
	}
	@FindBy(id = "lbl_val_2")
	private WebElement Value2;
	public WebElement getValue2()
	{
		return Value2;
	}
	@FindBy(id = "lbl_val_3")
	private WebElement Value3;
	public WebElement getValue3()
	{
		return Value3;
	}
	@FindBy(id = "lbl_val_4")
	private WebElement Value4;
	public WebElement getValue4()
	{
		return Value4;
	}
	@FindBy(id = "lbl_val_5")
	private WebElement Value5;
	public WebElement getValue5()
	{
		return Value5;
	}
	@FindBy(id = "lbl_ttl_val")
	private WebElement totalBalance;
	public WebElement gettotalBalance()
	{
		return totalBalance;
	}
	@FindBy(id = "txt_val_1")
	private WebElement txtval1;
	public WebElement gettxtval1()
	{
		return txtval1;
	}
	@FindBy(id = "txt_val_2")
	private WebElement txtval2;
	public WebElement gettxtval2()
	{
		return txtval2;
	}
	@FindBy(id = "txt_val_3")
	private WebElement txtval3;
	public WebElement gettxtval3()
	{
		return txtval3;
	}
	@FindBy(id = "txt_val_4")
	private WebElement txtval4;
	public WebElement gettxtval4()
	{
		return txtval4;
	}
	@FindBy(id = "txt_val_5")
	private WebElement txtval5;
	public WebElement gettxtval5()
	{
		return txtval5;
	}
	@FindBy(id = "txt_ttl_val")
	private WebElement txtttlval;
	public WebElement gettxtttlval()
	{
		return txtttlval;
	}
	
	@FindBy(xpath="//*[contains(@id, 'lbl_val')]")
	private WebElement allval;
	public WebElement getallval()
	{
		return allval;
	}

	@FindBy(xpath="//*[contains(@id, 'txt_val')]")
	private WebElement alltxtval;
	public WebElement getalltxtval()
	{
		return alltxtval;
	}
	
	//this calculates the count of value cells
	public int valueCount()
	{
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'lbl_val')]"));
		return list.size();
		
	}
	
	//This method is used to identify all the values are greater than zero
	public boolean valueGreaterThanZero() throws ParseException
	{
		int nonzero=0;
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'txt_val')]"));
		//System.out.println(list);
		for(WebElement el: list)
		{ 
			ArrayList<String> strlist=new ArrayList<String>();
			strlist.add(el.getText());
			//System.out.println(strlist);
			
			for(String s: strlist)
			{
				Locale locale = Locale.US;
				final NumberFormat format = NumberFormat.getNumberInstance(locale);
				if (format instanceof DecimalFormat) {
				        ((DecimalFormat) format).setParseBigDecimal(true);			
			       }
				Number number=format.parse(s.replaceAll("[$,]", ""));
				Double d=number.doubleValue();
				//System.out.println(String.format("%.2f", d));
				if(!(d>0.00))
				{
					nonzero=-1;
					break;
				}
		    }
		
	    }
		if(nonzero==-1)
		{return false;
		}else return true;
	}
	
	//This method is used to identify the text is in string format
	public boolean currencyFormat()
	{   
		int result = 0;
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'txt_val')]"));
		//System.out.println(list);
		for(WebElement el: list )
		{ 
			String text= el.getText();
			if(!text.startsWith("$"))
			{
				result= -1;
				break;
		    }
	    }
		if(result==-1)
		{return false;
	    }else return true;
			
	}

	//This method is used to calculate the total balance based on the cell values 
    public boolean totalBalanceVerify() throws ParseException
    {
    	double amount=0.00;
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'txt_val')]"));
		Locale locale = Locale.US;
		String totalbal= driver.findElement(By.id("txt_ttl_val")).getText();
		final NumberFormat nf = NumberFormat.getNumberInstance(locale);
		if (nf instanceof DecimalFormat) {
		        ((DecimalFormat) nf).setParseBigDecimal(true);			
	       }
		Number no=nf.parse(totalbal.replaceAll("[$,]", ""));
		Double totalbaldouble=no.doubleValue();
		//System.out.println(list);
		for(WebElement el: list)
		{ 
			
			ArrayList<String> strlist=new ArrayList<String>();
			strlist.add(el.getText());
			//System.out.println(strlist);
			
			for(String s: strlist)
			{
				
				final NumberFormat format = NumberFormat.getNumberInstance(locale);
				if (format instanceof DecimalFormat) {
				        ((DecimalFormat) format).setParseBigDecimal(true);			
			       }
				Number number=format.parse(s.replaceAll("[$,]", ""));
				Double d=number.doubleValue();
				amount=amount+d;
			}
			System.out.println(amount);
			
		}
		System.out.println(amount);
    	if(Double.compare(amount, totalbaldouble)==0)
    	{
    	return true;
	   }else return false;

}
}

