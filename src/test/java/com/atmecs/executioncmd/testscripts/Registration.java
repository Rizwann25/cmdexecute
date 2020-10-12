package com.atmecs.executioncmd.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.executioncmd.pages.RegistrationPage;
import com.atmecs.executioncmd.setup.SetUp;

	public class Registration extends SetUp {
		@Test(priority = 1)
		public void register() {
			RegistrationPage register = new RegistrationPage();
			register.doRegister();
			
		}
}
