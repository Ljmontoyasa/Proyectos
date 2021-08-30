package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	private Questions questions;
	
	@FindBy(how = How.XPATH, using = "//input[@type = 'submit']")
	private WebElement btnLogin;

	@FindBy(how = How.CSS, using = "#menu_pim_viewPimModule")
	private WebElement btnPim;

	@FindBy(how = How.ID, using = "menu_pim_addEmployee")
	private WebElement btnAddEmployee;
	
	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;

	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.questions = new Questions();

	}

	public void btnLogin() {
		btnLogin.isDisplayed();
		btnLogin.click();
	}

	public void btnPim() {
		questions.tiempoSegundos(1);
		btnPim.isDisplayed();
		btnPim.click();
	}

	public void btnAddEmployee(WebDriver driver) {
		questions.tiempoSegundos(3);
		btnAddEmployee.isDisplayed();
		btnAddEmployee.click();
		questions.tiempoSegundos(1);
		questions.screenShot(driver);
	}
	
	public void btnSave() {
		btnSave.isDisplayed();
		btnSave.click();
	}
}
