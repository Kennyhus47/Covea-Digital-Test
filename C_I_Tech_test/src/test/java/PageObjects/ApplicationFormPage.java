package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFormPage {
	
	WebDriver driver;
	public ApplicationFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//SELECT____TYPE___CHECK
	@FindBy(css = "")
	WebElement QUOTE_PAGE;
	public void CHECK_USER_IS_ON_THE_QUOTEPAGE() {
		QUOTE_PAGE.isDisplayed();
	}
	
	@FindBy(css = "")
	WebElement dropdown_button;
	public void Select_Dropdown() {
		dropdown_button.click();
	}

	@FindBy(css = "")
	WebElement mr_button;
	public void Select_Mr_Title() {
		mr_button.click();
	}
	
	@FindBy(css = "")
	WebElement First_name;
	public void Type_First_Name (String firstname) {
		First_name.sendKeys(firstname);
	}
	
	@FindBy(css = "")
	WebElement Sur_name;
	public void Type_surname (String surname) {
		Sur_name.sendKeys(surname);
	}

	@FindBy(css = "")
	WebElement email_address;
	public void Type_Email_Address(String email) {
		email_address.sendKeys(email);
	}
	
	@FindBy(css = "")
	WebElement confirm_email;
	public void Type_Confirm_Email_Address(String confirmemail) {
		email_address.sendKeys(confirmemail);
	}
	
	@FindBy(css = "")
	WebElement telephone;
	public void Type_Password(String tel) {
		telephone.sendKeys(tel);
	}
	
	@FindBy(css = "")
	WebElement valid_postcode;
	public void Type_Postcode(String postcode) {
		valid_postcode.sendKeys(postcode);
	}
	
	@FindBy(css = "")
	WebElement continue_button;
	public void Select_Login() {
		continue_button.click();
	}
	
	@FindBy(css = "")
	WebElement error_message;
	public void Check_Error_Message() {
		error_message.getText();
	}

	@FindBy(css = "")
	WebElement no_error_message;
	public void Check_Welcome_Message() {
		no_error_message.isDisplayed();
	}
	
	@FindBy(css = "")
	WebElement list_of_address;
	public void Check_List_Of_Address() {
		list_of_address.isDisplayed();
	}
	
	@FindBy(css = "")
	WebElement full_address;
	public void Select_List_Of_Address() {
		full_address.click();
	}
	
	@FindBy(css = "")
	WebElement summarymessage;
	public void Check_Summary_Message() {
		summarymessage.isDisplayed();
	}
}
