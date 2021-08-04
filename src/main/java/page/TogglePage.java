package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TogglePage {
	WebDriver driver;

	// constructor
	public TogglePage(WebDriver driver) {
		this.driver = driver;
	}

	// identifying the element
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @value='on']") WebElement TOGGLE_ALL_BUTTON;
//	@FindBy(how = How.XPATH, using = "input[value='on']") WebElement TOGGLE_ALL_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @name='todo[0]']") WebElement TEST_BUTTON;
	@FindBy(how = How.XPATH, using  = "//input[@type='submit' and @value='Remove']") WebElement REMOVE_BUTTON;

//  css cannot be used in page object model	
//	driver.findElement(By.cssSelector("input[value='on']")).click;

	// interactive methods

	public void clickToggleAllButton() {
		TOGGLE_ALL_BUTTON.click();
	}

	public void verifyCheckBoxesForListItemsAreChecked() {
		Assert.assertTrue("All check boxes not checked", TOGGLE_ALL_BUTTON.isSelected());
	}
	
	public void clickTestButton() {
		TEST_BUTTON.click();
	}
	
	public void clickRemoveButton() {
		REMOVE_BUTTON.click();
	}
	
	public void verifyTestListItem0IsRemoved() {
		Assert.assertTrue("Test list item not removed", TEST_BUTTON.isSelected());
	}
	
	public void verifyRemoveButtonRemovesAllListItems() {
		Assert.assertTrue("All list items not removed", REMOVE_BUTTON.isSelected());
	}
}
