package com.atmecs.executioncmd.pages;

	import java.util.Properties;

import com.atmecs.executioncmd.constant.constant;
import com.atmecs.executioncmd.helper.HelperClass;
import com.atmecs.executioncmd.reader.PropertyReader;
import com.atmecs.executioncmd.setup.SetUp;

	public class LoginPage extends SetUp {
		Properties loc_path;
		Properties data_path;

		public void doLogin() {
			loc_path = PropertyReader.readProperties(constant.locators_file);
			data_path = PropertyReader.readProperties(constant.testdata_file);

			HelperClass.clickElement(driver, loc_path.getProperty("Login"));

			HelperClass.sendKeys(driver, loc_path.getProperty("LoginUsername"), data_path.getProperty("LoginUsername"));
			HelperClass.sendKeys(driver, loc_path.getProperty("LoginPassword"), data_path.getProperty("LoginPassword"));

			HelperClass.clickElement(driver, loc_path.getProperty("LoginButton"));

		}
}
