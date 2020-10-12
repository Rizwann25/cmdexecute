package com.atmecs.executioncmd.testscripts;

	import org.testng.annotations.Test;

import com.atmecs.executioncmd.pages.AddToCartPage;
import com.atmecs.executioncmd.setup.SetUp;

	public class AddToCart extends SetUp {
		@Test(priority = 4)
		public void addtoCart() throws Exception {
			AddToCartPage adding = new AddToCartPage();
			adding.addToCart();

		}
}
