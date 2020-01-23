package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import GoogleMainClass.Bases;

public class GooglePageObject extends Bases {
	
	public GooglePageObject() {

		PageFactory.initElements(driver, this);

	}


	
	
	@FindBy(how = How.XPATH, using= "//input[@class='gLFyf gsfi']")
	private WebElement inputData;
	
	@FindBy(how = How.XPATH, using = "//div[@class='hsuHs']")
	private WebElement enterData;
	

	public void inputDataInBox(String Data1) {
		inputData.sendKeys(Data1);
	}
	
	public void enterDataFromBox() {
		enterData.sendKeys(Keys.ENTER);
	}

public String pageTitle() {

	String Google = driver.getTitle();
	return Google;
}

}


