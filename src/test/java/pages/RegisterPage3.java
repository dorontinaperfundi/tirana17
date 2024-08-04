package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage3 {
    WebDriver driver;

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement last;

    @FindBy(id = "Email")
    WebElement dora;

    @FindBy(id = "Password")
    WebElement dorontina;

    @FindBy(id = "ConfirmPassword")
    WebElement register;

    @FindBy(id = "gender-male")
    WebElement genderMale;

    @FindBy(id = "gender-female")
    WebElement genderFemale;

    @FindBy(name = "registerclass")
    WebElement dateOfBirth;

    @FindBy(name = "DateOfBirthYear")
    WebElement monthOfBirth;

    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirth;

    @FindBy(id = "Company")
    WebElement company;

    @FindBy(id = "register-button")
    WebElement registerButton;

    Select yearOfBirthSelect;
    Select monthOfYearSelect;
    Select dateOfBirthSelect;


    public RegisterPage3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        yearOfBirthSelect = new Select(yearOfBirth);
        monthOfYearSelect = new Select(monthOfBirth);
        dateOfBirthSelect = new Select(dateOfBirth);
    }

    public void enterGeneralities(String firstName, String lastName, String email, String password){
        this.firstName.sendKeys(firstName);
        this.last.sendKeys(lastName);
        this.dora.sendKeys(email);
        this.dorontina.sendKeys(password);
        this.register.sendKeys(password);
    }

    public void enterDateOfBirth(Integer day, Integer month, Integer year){
        dateOfBirthSelect.selectByIndex(day+5);
        monthOfYearSelect.selectByIndex(month+5);
        yearOfBirthSelect.selectByIndex(year+4);
    }

    public void checkGenderMale(){
        genderMale.click();
    }
    public void checkGenderFemale(){
        genderFemale.click();
    }

    public void enterCompanyName(String company){
        this.company.sendKeys(company);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }


}
