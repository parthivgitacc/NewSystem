package com.stepdefinition;

import java.awt.event.AdjustmentListener;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddacationLoginStep {
	
	WebDriver driver;

	@Given("User is on the Adactin login page")
	public void user_is_on_the_adactin_login_page() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("User login {string},{string}")
	public void user_login(String userName, String password) {

		WebElement textUser = driver.findElement(By.id("username"));
		textUser.sendKeys(userName);

		WebElement textPass = driver.findElement(By.id("password"));
		textPass.sendKeys(password);

		WebElement btnLoggin = driver.findElement(By.id("login"));
		btnLoggin.click();
	}

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		WebElement locationbtn = driver.findElement(By.id("location"));
		Select select = new Select(locationbtn);
		select.selectByValue(string);

		WebElement hotelbtn = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotelbtn);
		select1.selectByValue(string2);

		WebElement roomtypebtn = driver.findElement(By.id("room_type"));
		Select select2 = new Select(roomtypebtn);
		select2.selectByValue(string3);

		WebElement roomnum = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(roomnum);
		select3.selectByValue(string4);

		WebElement datecheckin = driver.findElement(By.id("datepick_in"));
		datecheckin.sendKeys(string5);

		WebElement datecheckout = driver.findElement(By.id("datepick_out"));
		datecheckout.sendKeys(string6);

		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select select6 = new Select(adultRoom);
		select6.selectByValue(string7);

		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select select7 = new Select(childRoom);
		select7.selectByValue(string8);

		WebElement searchBtn = driver.findElement(By.id("Submit"));
		searchBtn.click();
	}

	@When("User select hotel name")
	public void user_select_hotel_name() {
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();

		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
	}

	@When("User book hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_book_hotel_and(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {

		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(string);

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(string2);

		WebElement addresstxt = driver.findElement(By.id("address"));
		addresstxt.sendKeys(string3);

		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys(string4);

		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select select10 = new Select(ccType);
		select10.selectByValue(string5);

		WebElement ccExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select select11 = new Select(ccExpMonth);
		select11.selectByValue(string6);

		WebElement ccExpYear = driver.findElement(By.id("cc_exp_year"));
		Select select12 = new Select(ccExpYear);
		select12.selectByValue(string7);

		WebElement ccCvv = driver.findElement(By.id("cc_cvv"));
		ccCvv.sendKeys(string8);

		WebElement bookbtn = driver.findElement(By.id("book_now"));
		bookbtn.click();

	}

	@Then("User should print Order Id")
	public void user_should_print_order_id() throws InterruptedException {
		Thread.sleep(8000);
		WebElement orderId = driver.findElement(By.id("order_no"));

		String text = orderId.getAttribute("value");
		System.out.println(text);
	}

}
