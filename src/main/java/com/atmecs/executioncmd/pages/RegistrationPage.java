package com.atmecs.executioncmd.pages;

	import java.util.Properties;

import com.atmecs.executioncmd.constant.constant;
import com.atmecs.executioncmd.helper.HelperClass;
import com.atmecs.executioncmd.reader.PropertyReader;
import com.atmecs.executioncmd.setup.SetUp;


	public class RegistrationPage extends SetUp {

			Properties loc_path;
			Properties data_path;

			public void doRegister() {
				loc_path = PropertyReader.readProperties(constant.locators_file);
				data_path = PropertyReader.readProperties(constant.testdata_file);
				HelperClass.clickElement(driver, loc_path.getProperty("Signup"));
				HelperClass.sendKeys(driver, loc_path.getProperty("SignupUsername"),
						data_path.getProperty("SignupUsername"));
				HelperClass.sendKeys(driver, loc_path.getProperty("SignupPassword"),
						data_path.getProperty("SignupPassword"));
				HelperClass.clickElement(driver, loc_path.getProperty("SignupButton"));
			}

}
