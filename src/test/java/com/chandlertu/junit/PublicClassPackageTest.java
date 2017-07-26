package com.chandlertu.junit;

import org.junit.Assert;
import org.junit.Ignore;

class PublicClassPackageTest {

	@Ignore("The class com.chandlertu.junit.PublicClassPackageTest is not public")
	public void publicTestPublicAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

}
