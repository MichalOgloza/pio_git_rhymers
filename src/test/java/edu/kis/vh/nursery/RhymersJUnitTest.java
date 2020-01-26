package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peek());
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		Assert.assertTrue(rhymer.callCheck());

		rhymer.countIn(888);

		Assert.assertFalse(rhymer.callCheck());
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			Assert.assertFalse(rhymer.isFull());
			rhymer.countIn(888);
		}

		Assert.assertTrue(rhymer.isFull());
	}

	@Test
	public void getTotalTest() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peek());
		int testValue = 4;

		for(int i = 0; i <= testValue; i++)
			rhymer.countIn(i);

		Assert.assertEquals(testValue, rhymer.getTotal());

	}

	@Test
	public void testPeek() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peek());

		int testValue = 4;
		rhymer.countIn(testValue);

		Assert.assertEquals(testValue, rhymer.peek());

		Assert.assertEquals(testValue, rhymer.peek());
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

		int testValue = 4;
		rhymer.countIn(testValue);


		Assert.assertEquals(testValue, rhymer.countOut());

		Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
	}

}
