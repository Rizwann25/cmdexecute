package com.atmecs.executioncmd.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.executioncmd.pages.ContactUsPage;
import com.atmecs.executioncmd.setup.SetUp;

	public class ContactUs extends SetUp {
		@Test(priority = 3)
		public void contactus() {
			ContactUsPage contact = new ContactUsPage();
			contact.contactUs();
		}
}
