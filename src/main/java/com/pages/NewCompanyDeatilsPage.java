package com.pages;

import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;

public class NewCompanyDeatilsPage {
	@FindBy(xpath = "//input[@formcontrolname='CompanyName']")
	WebElement company_Name;

	@FindBy(xpath = "//input[@class='ui-inputtext ui-corner-all ui-state-default ui-widget']")
	WebElement eIN;

	@FindBy(xpath = "//input[@formcontrolname='AddressLine1']")
	WebElement address1;

	@FindBy(xpath = "//input[@formcontrolname='AddressLine2']")
	WebElement address2;

	@FindBy(xpath = "//input[@formcontrolname='City']")
	WebElement city;

	@FindBy(css = "select[formcontrolname='StateID']")
	WebElement drop_Down;

	@FindBy(xpath = "//input[@formcontrolname='ZipCode']")
	WebElement zip_Code;

	@FindBy(xpath = "//input[@formcontrolname='ContactNo']")
	WebElement contact_Number;

	@FindBy(xpath = "//input[@formcontrolname='CompanyHREmailID']")
	WebElement e_mail;

	@FindBy(xpath = "//input[@formcontrolname='PayrollID']")
	WebElement pay_roll_Id;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save_Button;

	@FindBy(css = "button[icon = 'pi pi-upload']")
	WebElement upload_Button;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancel_Button;

	@FindBy(css = "div[role = 'checkbox']")
	WebElement toggle;

	@FindBy(css = "input[formcontrolname='EverifyUserName']")
	WebElement Everify_User_Name;

	@FindBy(css = "input[formcontrolname='EverifyPassword']")
	WebElement Everify_Password;

	@FindBy(xpath = "//p-inputswitch[@formcontrolname = 'isAcaEnabled']/div[@role = 'checkbox']")
	WebElement EnabledACA;

	@FindBy(xpath = "//button[@type='button']/span[contains(text(),'Yes')]/parent::button")
	WebElement delete_Button;

	WebDriver driver;

	public NewCompanyDeatilsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enter_Company_name(String companyName) {
		company_Name.sendKeys(companyName);
	}

	public void enter_EIN(String number) {
		WebDriverUtil.waitForElementVisiblity(eIN);
		WebDriverUtil.passTheValueUsingJavaScript(eIN, number);
		eIN.click();
	}

	public void enter_Address(String address) {
		address1.sendKeys(address);
	}

	public void enter_Address2(String address1) {
		address2.sendKeys(address1);
	}

	public void enter_City(String City) {
		city.sendKeys(City);
	}

	public void select_drop_Down(String text) throws InterruptedException {
		WebDriverUtil.waitForElementVisiblity(drop_Down);
		WebDriverUtil.selectText(drop_Down, text);
	}

	public void enter_Zip_Code(String code) {
		zip_Code.sendKeys(code);
	}

	public void enter_Contact_Number(String number) {
		WebDriverUtil.waitForElementVisiblity(contact_Number);
		contact_Number.sendKeys(number);
	}

	public void enter_Email(String mail) {
		e_mail.sendKeys(mail);
	}

	public void enter_Pay_Roll(String payRoll) {
		pay_roll_Id.sendKeys(payRoll);
	}

	public void click_Save_Button() {
		save_Button.click();
	}

	public void click_Upload_Button() {
		upload_Button.click();
	}

	public void click_Save_Button_And_Check_Data(String searccompany_Name) throws Throwable {
		save_Button.click();
		Thread.sleep(2000);
		CompanyDetailsPage companyAccount = new CompanyDetailsPage(DriverFactory.getDriver());
		companyAccount.text_Of_Success_Message();
		WebElement company_Name = driver
				.findElement(By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/a"));
		company_Name.click();
		Thread.sleep(4000);
		cancel_Button.click();
	}

	public void click_Save_Button_And_Check_Data_Edit(String searccompany_Name) throws Throwable {
		save_Button.click();
		Thread.sleep(2000);
		CompanyDetailsPage companyAccount = new CompanyDetailsPage(DriverFactory.getDriver());
		companyAccount.text_Of_Success_Message();
		WebElement company_Name1 = driver
				.findElement(By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/a"));
		company_Name1.click();
		Thread.sleep(2000);
		company_Name.sendKeys("TestUpdated");
	}

	public void company_Match(String searccompany_Name) throws Throwable {
		save_Button.click();
		Thread.sleep(2000);

		WebElement company_Name_Searched = driver
				.findElement(By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/a"));

		System.out.println(company_Name_Searched.getText());
		String company1 = company_Name_Searched.getText();

		WebElement company_Name = driver.findElement(
				By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/following::td[6]"));
		company_Name.click();

		WebElement company_Name_Found = driver
				.findElement(By.xpath("//b[contains(text(),'" + searccompany_Name + "')]"));

		System.out.println(company_Name_Found.getText());
		String company2 = company_Name_Found.getText();

		if (company1.equals(company2)) {
			System.out.println("Company Matched");
		} else {
			System.out.println("Company Not matched");
		}
		Assert.assertEquals(company1, company2);
		Thread.sleep(2000);
	}

	public void click_Yes_Button() throws InterruptedException {
		delete_Button.click();
		Thread.sleep(4000);
	}

	public void upadteAndCheckForUpdate(String searccompany_Name) throws Throwable {
		save_Button.click();
		Thread.sleep(2000);
		CompanyDetailsPage companyAccount = new CompanyDetailsPage(DriverFactory.getDriver());
		companyAccount.text_Of_Success_Message();
		WebElement company_Name1 = driver
				.findElement(By.xpath("//a[contains(text(),'" + searccompany_Name + "')]/parent::div/a"));
		company_Name1.click();
		Thread.sleep(4000);
	}

	public void drop() throws InterruptedException {
		Select dropDown = new Select(drop_Down);
		List<WebElement> elementCount = dropDown.getOptions();
		int itemSize = elementCount.size();
		System.out.println(
				"=================================================================================================================================================================");
		System.out.println("Size of DropDown options is : " + itemSize + "\n");
		System.out.println("DropDown options are : ");
		for (int i = 1; i < itemSize; i++) {
			String optionsValue = elementCount.get(i).getText();
			System.out.println(optionsValue);
		}
		System.out.println(
				"=================================================================================================================================================================");
	}

	public void drop_Down_Alphabetical_Order() throws InterruptedException {
		Select dropDown = new Select(drop_Down);
		List<WebElement> elementCount = dropDown.getOptions();
		List<String> options = new ArrayList<String>();
		for (WebElement optionElement : elementCount) {
			options.add(optionElement.getText());
		}
		options.remove("Select");
		System.out.println("Options in dropdown with Default order :" + options);
		List<String> tempList = new ArrayList<String>(options);
		Collections.sort(tempList);
		System.out.println("Sorted List " + tempList);
		boolean ifSortedAscending = options.equals(tempList);
		if (ifSortedAscending) {
			System.out.println("DropDown is in Alphabetical order...");
		} else
			System.out.println("DropDown is not in Alphabetical order...");
	}

	public void toggle() throws InterruptedException {
		WebDriverUtil.waitForElementVisiblity(toggle);
		Thread.sleep(2000);
		toggle.click();
		Thread.sleep(1000);
		toggle.click();
		Thread.sleep(1000);
	}

	public void checkToggle() throws InterruptedException {
		toggle.click();
		Thread.sleep(2000);
	}

	public void ACA_toggle() throws InterruptedException {
		EnabledACA.click();
		Thread.sleep(1000);
		EnabledACA.click();
		Thread.sleep(1000);
	}

	public void enter_username_Everify(String EverifyUsername) {
		Everify_User_Name.sendKeys(EverifyUsername);
	}

	public void enter_Password_Everify(String EverifyPassword) {
		Everify_Password.sendKeys(EverifyPassword);
	}

	public void click_Cancel_Button() {
		cancel_Button.click();
	}

}
