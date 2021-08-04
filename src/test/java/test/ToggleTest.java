package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TogglePage;
import util.BrowserFactory;

public class ToggleTest {
	WebDriver driver;

	@Test
	public void AllCheckBoxesForListItemsAreChecked() {

		driver = BrowserFactory.init();
		
		TogglePage togglepage = PageFactory.initElements(driver, TogglePage.class);
		togglepage.clickToggleAllButton();
		togglepage.clickRemoveButton();
		
//		togglepage.verifyRemoveButtonRemovesAllListItems();
		
		togglepage.verifyCheckBoxesForListItemsAreChecked();
		
		togglepage.clickTestButton();
		togglepage.clickRemoveButton();
		togglepage.verifyTestListItem0IsRemoved();
		
		BrowserFactory.tearDown();
	}

}
