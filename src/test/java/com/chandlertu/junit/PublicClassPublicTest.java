package com.chandlertu.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PublicClassPublicTest {

	@Test
	public void publicTestPublicAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Ignore("Method protectedTestPublicAdd() should be public")
	protected void protectedTestPublicAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Ignore("Method packageTestPublicAdd() should be public")
	void packageTestPublicAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

	@Ignore("Method privateTestPublicAdd() should be public")
	private void privateTestPublicAdd() {
		PublicClass publicClass = new PublicClass();
		int returnValue = publicClass.publicAdd(1, 2);
		Assert.assertEquals(3, returnValue);
	}

}
