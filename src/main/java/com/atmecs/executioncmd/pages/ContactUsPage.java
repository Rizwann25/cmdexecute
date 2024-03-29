package com.atmecs.executioncmd.pages;

	import java.util.Properties;

	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.executioncmd.constant.constant;
import com.atmecs.executioncmd.helper.HelperClass;
import com.atmecs.executioncmd.reader.PropertyReader;
import com.atmecs.executioncmd.setup.SetUp;

	public class ContactUsPage extends SetUp {

			Properties loc_path;
			Properties data_path;

			public void contactUs() {
				loc_path = PropertyReader.readProperties(constant.locators_file);
				data_path = PropertyReader.readProperties(constant.testdata_file);

				HelperClass.clickElement(driver, loc_path.getProperty("ContactUs"));

				HelperClass.sendKeys(driver, loc_path.getProperty("ContactEmail"), data_path.getProperty("ContactEmail"));
				HelperClass.sendKeys(driver, loc_path.getProperty("ContactName"), data_path.getProperty("ContactName"));
				HelperClass.sendKeys(driver, loc_path.getProperty("Message"), data_path.getProperty("Message"));

				HelperClass.clickElement(driver, loc_path.getProperty("SendMessageButton"));
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();
			}
}
