package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.factory.WebDriverUtil;

public class CompanyPage1 {
	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	WebElement toggle_Button;

	@FindBy(xpath = "//a[contains(text(),'Add New')]")
	WebElement add_New;

	@FindBy(xpath = "//a[contains(text(),'Import')]")
	WebElement import_btn;

	@FindBy(css = "button[icon = 'pi pi-upload']")
	WebElement upload_Button;

	@FindBy(xpath = "//button[@type='button']/span[contains(text(),'Yes')]/parent::button")
	WebElement delete_Button;

	@FindBy(xpath = "//div[@class='ui-growl-message']")
	WebElement successfull_Message;

	@FindBy(xpath = "//div[@class='ui-growl-icon-close pi pi-times']")
	WebElement successfull_Delete_Message;

	@FindBy(xpath = "//input[@type = 'file']")
	WebElement select_File;

	@FindBy(xpath = "//button[contains(text(),' Download Sample File ')]")
	WebElement download_File;

	@FindBy(xpath = "//button[contains(text(),' Cancel ')]")
	WebElement import_Page_Cancel_Btn;

	@FindBy(xpath = "//div[@class = 'user-icon']")
	WebElement logout_Icon;

	@FindBy(xpath = "//i[@class = 'fa fa-power-off']")
	WebElement logout;

	@FindBy(xpath = "//button[@class = 'btn dropdown-toggle']")
	WebElement export_Icon;

	@FindBy(xpath = "//a[contains(text(),'PDF')]")
	WebElement export_PDF;

	@FindBy(xpath = "//a[contains(text(),'Excel')]")
	WebElement export_Excel;

	WebDriver driver;

	public CompanyPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickon_ToggleButton() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(toggle_Button);
		WebDriverUtil.waitForElementJavaScript(toggle_Button);
	}

	public void clickon_Export_Icon() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(export_Icon);
		WebDriverUtil.waitForElementJavaScript(export_Icon);
	}

	public void clickon_PDF_Button() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(export_PDF);
		WebDriverUtil.waitForElementJavaScript(export_PDF);
	}

	public void clickon_Excel_Button() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(export_Excel);
		WebDriverUtil.waitForElementJavaScript(export_Excel);
	}

	public void clickon_Logout_Icon() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(logout_Icon);
		WebDriverUtil.waitForElementJavaScript(logout_Icon);
	}

	public void clickon_Logout() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(logout);
		WebDriverUtil.waitForElementJavaScript(logout);
	}

	public void add_NewEmployee() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(add_New);
		WebDriverUtil.waitForElementJavaScript(add_New);
	}

	public void import_File() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(import_btn);
		WebDriverUtil.waitForElementJavaScript(import_btn);
	}

	public void select_File_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyAdd.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void select_File_To_Be_Updated_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyUpdate.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void update_Company_Through_Import_File() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyUpdateAddress.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void select_File_To_Update_Phone_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyUpdatePhone.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
	}

	public void select_File_To_Update_Everify_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyUpdateEverify.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
	}

	public void select_File_To_Update_Everify_Username_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyUpdateEverifyUsername.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
	}

	public void select_File_To_Check_Duplicate_EIN_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyDuplicateEIN.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void select_File_To_Check_Invalid_Zip_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyInvalidZip.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void select_File_To_Check_Add_New_And_Click_Upload_Button() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyAddNew.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void Add_New_Company() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyAddAndDelete.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void update_Company_State() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanySatateUpdate.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
	}

	public void update_Company_City() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyUpdateCity.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
	}

	public void check_EIN() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyInvalidEIN.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void update_Address() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyAddressUpdate.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void update_Company_Name() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyNameUpdate.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void delete_Company_Through_Import_File() throws Throwable {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyDelete.xlsx");
		Thread.sleep(2000);
		upload_Button.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(4000);
	}

	public void download_File() throws InterruptedException {
		WebDriverUtil.waitForElementStatus(download_File);
		WebDriverUtil.waitForElementJavaScript(download_File);
		Thread.sleep(2000);
		driver.get("https://betaapi.subsource.com/Files/SampleFile/Company%20Sample%20File.xlsx");
		Thread.sleep(5000);
	}

	public void upload_File() throws InterruptedException {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\CompanyImportFile.xlsx");
	}

	public void upload_Wrong_File_Format() throws InterruptedException {
		Thread.sleep(2000);
		select_File.sendKeys("E:\\SubSource\\CodeBase\\CompanyImport\\Wrong_Format.txt");
	}

	public void findElementUsingText(String searccompany_Name) {
		WebElement company_Name = driver.findElement(
				By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/following::td[6]"));
		company_Name.click();
	}

	public void check_Company(String searccompany_Name) {
		WebElement company_Name = driver
				.findElement(By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/a"));
		company_Name.click();
	}

	public void click_delete_Button() throws Throwable {
		WebDriverUtil.waitForElementVisiblity(delete_Button);
		delete_Button.click();
		Thread.sleep(2000);
	}

	public void text_Of_Success_Message() {
		WebDriverUtil.waitForElementVisiblity(successfull_Message);
		System.out.println("Success full message : " + successfull_Message.getText());
	}

	public void successfull_Delete() {
		WebDriverUtil.waitForElementVisiblity(successfull_Delete_Message);
		successfull_Delete_Message.click();
	}

	public void import_Page_Cancel() {
		WebDriverUtil.waitForElementStatus(import_Page_Cancel_Btn);
		WebDriverUtil.waitForElementJavaScript(import_Page_Cancel_Btn);
	}

}
