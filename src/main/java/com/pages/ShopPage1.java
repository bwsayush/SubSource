package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.factory.WebDriverUtil;

public class ShopPage1 {
	@FindBy(css = "button[class = 'btn dropdown-toggle act']")
	WebElement toggle_Button;

	@FindBy(xpath = "//*[@id='accordion']/li[2]/div/ul/li[1]/a")
	WebElement add_New_Button;

	@FindBy(xpath = "//*[@id='accordion']/li[2]/div/ul/li[3]/a")
	WebElement Edit_Misc;

	@FindBy(xpath = "//span[@class = 'ui-button-icon-left ui-clickable pi pi-check']")
	WebElement delete_Button;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/div/span/a")
	WebElement shopNo;

	@FindBy(css = "input[formcontrolname = 'City']")
	@CacheLookup
	WebElement city_Text;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save_Button;

	@FindBy(css = "input[formcontrolname = 'Cost']")
	@CacheLookup
	WebElement cost_Text;

	@FindBy(xpath = "//button[text() = ' Cancel ']")
	WebElement cancel_btn;

	@FindBy(xpath = "//td[@class='day' and text() = '5']")
	WebElement startDate;

	@FindBy(xpath = "//td[@class='day' and text() = '6']")
	WebElement endDate;

	@FindBy(xpath = "//i[@class = 'fa fa-share-square-o']")
	WebElement export_Button;

	@FindBy(xpath = "//i[@class = 'fa fa-file-pdf-o']")
	WebElement pdf_Button;

	@FindBy(xpath = "//i[@class = 'fa fa-file-excel-o']")
	WebElement excel_Button;

	@FindBy(xpath = "//span[@class = 'ui-button-icon-left ui-clickable pi pi-times']")
	WebElement no_Button;

	@FindBy(xpath = "//span[@class = 'pi pi-fw pi-times']")
	WebElement cross_Button;

	@FindBy(xpath = "//span[contains(text(),'Shop Wrong Format.txt: Invalid file type,')]")
	WebElement error_file_format_msg1;

	@FindBy(xpath = "//span[contains(text(),'allowed file types: .xlsx.')]")
	WebElement error_file_format_msg2;

	@FindBy(xpath = "//a[text() = 'Import']")
	WebElement import_button;

	@FindBy(xpath = "//input[@type = 'file']")
	WebElement select_File;

	@FindBy(xpath = "//button[contains(text(),' Download Sample File ')]")
	WebElement download_File;
	
	WebDriver driver;

	public ShopPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_Toggle_Button() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(toggle_Button);
		WebDriverUtil.waitForElementJavaScript(toggle_Button);
	}

	public void click_AddNew() throws InterruptedException {
		WebDriverUtil.waitForElementVisiblity(add_New_Button);
		add_New_Button.click();
	}

	public void click_Edit_Misc() throws InterruptedException {
		WebDriverUtil.waitForElementVisiblity(Edit_Misc);
		Edit_Misc.click();
	}

	public void click_shop() throws InterruptedException {
		WebDriverUtil.waitForElementVisiblity(shopNo);
		shopNo.click();
	}

	public void delete(String Shop) throws InterruptedException {
		WebElement element = driver
				.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/parent::div/following::td[9]"));
		WebDriverUtil.waitForElementVisiblity(element);
		element.click();
		delete_Button.click();
	}

	public void click_Cancel() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(cancel_btn);
		WebDriverUtil.waitForElementJavaScript(cancel_btn);
	}

	public void update_City(String Shop) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		WebDriverUtil.waitForElementVisiblity(element);
		element.click();
		Thread.sleep(2000);
		city_Text.click();
		city_Text.clear();
		Thread.sleep(1000);
		city_Text.sendKeys("Mumbai");
		Thread.sleep(2000);
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB);
		startDate.click();
		cost_Text.click();
		cost_Text.sendKeys(Keys.TAB, Keys.TAB);
		endDate.click();
		save_Button.click();
	}

	public void check_Update(String Shop) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		WebDriverUtil.waitForElementVisiblity(element);
		element.click();
		Thread.sleep(2000);
		cancel_btn.click();
	}

	public void click_On_Shop(String Shop) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		WebDriverUtil.waitForElementVisiblity(element);
		element.click();
		Thread.sleep(2000);
	}

	public void remove_Email(String email) throws InterruptedException {
		WebElement element = driver
				.findElement(By.xpath("//div[contains(text(),'" + email + "')]/parent::div/delete-icon/span"));
		WebDriverUtil.waitForElementVisiblity(element);
		element.click();
		Thread.sleep(1000);
	}

	public void scroll_Down() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void scroll_Up() throws InterruptedException {
		WebElement Element = driver.findElement(By.xpath("//div[@class = 'user-icon']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void shop_Match(String Shop) throws Throwable {
		Thread.sleep(2000);
		WebElement shop_number_Searched = driver.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/a"));
		System.out.println(shop_number_Searched.getText());
		String shop1 = shop_number_Searched.getText();
		WebElement shop_Delete_Icon = driver
				.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/parent::div/following::td[9]"));
		shop_Delete_Icon.click();
		WebElement shop_Number_Found = driver.findElement(By.xpath("//b[contains(text(),'" + Shop + "')]"));
		System.out.println(shop_Number_Found.getText());
		String shop2 = shop_Number_Found.getText();
		if (shop1.equals(shop2)) {
			System.out.println("Shop Matched");
		} else {
			System.out.println("Shop Not matched");
		}
		Assert.assertEquals(shop1, shop2);
		Thread.sleep(2000);
	}

	public void clickOn_Delete_Yes_Button() throws InterruptedException {
		delete_Button.click();
	}

	public void clickOn_Export() throws InterruptedException {
		export_Button.click();
	}

	public void clickOn_PDF() throws InterruptedException {
		pdf_Button.click();
	}

	public void clickOn_Excel() throws InterruptedException {
		excel_Button.click();
	}

	public void delete_Icon(String Shop) throws InterruptedException {
		WebElement shop_Delete_Icon = driver
				.findElement(By.xpath("//a[text() ='" + Shop + "']/parent::span/parent::div/following::td[9]"));
		shop_Delete_Icon.click();
	}

	public void clickOn_No_Button() throws InterruptedException {
		no_Button.click();
	}

	public void clickOn_Cross_Button() throws InterruptedException {
		cross_Button.click();
	}

	public void clickOn_Import_Button() throws InterruptedException {
		import_button.click();
	}

	public void select_Wrong_File() throws Throwable {
		Thread.sleep(1000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\ShopImport\\Shop Wrong Format.txt");
		Thread.sleep(1000);
		String actual = error_file_format_msg1.getText() + error_file_format_msg2.getText();
		String expected = "Shop Wrong Format.txt: Invalid file type,allowed file types: .xlsx.";
		Assert.assertEquals(expected, actual);
		cancel_btn.click();
		System.out.println(actual);
		System.out.println(expected);
	}
	
	public void download_File() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(download_File);
		WebDriverUtil.waitForElementJavaScript(download_File);
		Thread.sleep(2000);
		driver.get("https://betaapi.subsource.com/Files/SampleFile/Store%20Sample%20File.xlsx");
		Thread.sleep(5000);
	}
}
