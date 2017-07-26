package com.chandlertu.junit;

import org.junit.Assert;
import org.junit.Test;

public class PackageClassTest {

	@Test
	public void testPublicAdd() {
		PackageClass packageClass = new PackageClass();
		int returnValue = packageClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Test
	public void testProtectedAdd() {
		PackageClass packageClass = new PackageClass();
		int returnValue = packageClass.protectedAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Test
	public void testPackageAdd() {
		PackageClass packageClass = new PackageClass();
		int returnValue = packageClass.packageAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

}
