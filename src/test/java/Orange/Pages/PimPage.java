package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

public class PimPage {

	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement txtFirstName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement txtLastName;

	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions();
	}

	public void diligenciarAddEmployee(WebDriver driver) {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee(driver);
		questions.assertWelcome(driver);

	}

	public void llenarAddEmployee(String firtName, String lastName) {
		txtFirstName.sendKeys(firtName);
		txtLastName.sendKeys(lastName);
		buttonPages.btnSave();

	}
}