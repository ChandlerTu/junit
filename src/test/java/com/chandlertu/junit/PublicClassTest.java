package com.chandlertu.junit;

import org.junit.Assert;
import org.junit.Test;

public class PublicClassTest {

	@Test
	public void testPublicAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Test
	public void testProtectedAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.protectedAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Test
	public void testPackageAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.packageAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

}
