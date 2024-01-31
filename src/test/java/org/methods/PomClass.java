package org.methods;

import java.io.IOException;

import org.basePom.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.AdactinPom;

public class PomClass extends BaseClass {
	public static void main(String[] args) throws IOException {

		getDriver("Chrome");
		driver.get("https://adactinhotelapp.com/");

		AdactinPom j = new AdactinPom();

		WebElement username = j.getUsername();
		username.sendKeys("deepanraj4444");
		

		WebElement password = j.getPassword();
		password.sendKeys("12345678");

		WebElement login = j.getLogin();
		login.click();

		WebElement location = j.getLocation();
		selectMethod(location, excelRead(1, 0));

		WebElement hotels = j.getHotels();
		selectMethod(hotels, excelRead(1, 1));

		WebElement roomtype = j.getRoomtype();
		selectMethod(roomtype, excelRead(3, 1));

		WebElement numberOfRoom = j.getNumberOfRoom();
		selectMethod(numberOfRoom, excelRead(2, 1));

		WebElement dateCheckin = j.getDateCheckin();
		textSendBasedOnJS(excelRead(4, 1), dateCheckin);

		WebElement dateCheckout = j.getDateCheckOut();
		textSendBasedOnJS(excelRead(5, 1), dateCheckout);

		WebElement adultsPerRoom = j.getAdultsPerRoom();
		selectMethod(adultsPerRoom, excelRead(6, 1));

		WebElement submit = j.getSubmit();
		submit.click();

		WebElement radiobutton = j.getRadiobutton();
		radiobutton.click();

		WebElement next = j.getNext();
		next.click();

		WebElement firstname = j.getFirstname();
		textSendBasedOnJS(excelRead(7, 1), firstname);

		WebElement lastname = j.getLastname();
		textSendBasedOnJS(excelRead(8, 1), lastname);

		WebElement address = j.getAddress();
		address.sendKeys("1/274,gandhinagar paramathi velur namakkal dt");

		WebElement cardNumber = j.getCardNumber();
		textSendBasedOnJS(excelRead(10, 1), cardNumber);

		WebElement cardType = j.getCardType();
		selectMethod(cardType, excelRead(11, 1));

		WebElement expMonth = j.getExpMonth();
		selectMethod(expMonth, excelRead(12, 1));

		WebElement expYear = j.getExpYear();
		selectMethod(expYear, excelRead(13, 1));

		WebElement Cvv = j.getCvv();
		textSendBasedOnJS(excelRead (14,1), Cvv);

		WebElement BookNow = j.getBookNow();
		BookNow.click();
	}
}
