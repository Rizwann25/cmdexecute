package com.atmecs.executioncmd.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.executioncmd.pages.LoginPage;
import com.atmecs.executioncmd.setup.SetUp;

	public class Login extends SetUp {
		@Test( priority=2)
		public void login() {
			LoginPage log = new LoginPage();
			log.doLogin();
		}
}
