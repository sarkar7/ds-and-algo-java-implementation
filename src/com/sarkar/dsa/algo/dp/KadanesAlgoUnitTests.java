package com.sarkar.dsa.algo.dp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KadanesAlgoUnitTests {

	@Test
	public void test1() {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		Assert.assertEquals(7, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test2() {
		int[] arr = { 2, 3, 4, 1, 2, 1, 5, 3 };
		Assert.assertEquals(21, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test3() {
		int[] arr = { 5 };
		Assert.assertEquals(5, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test4() {
		int[] arr = {};
		Assert.assertEquals(0, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test5() {
		int[] arr = { -1, -2, -3, -4, -5, -6, -7, -8 };
		Assert.assertEquals(-1, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test6() {
		int[] arr = { -8, -7, -6, -5, -4, -3, -2, -1 };
		Assert.assertEquals(-1, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test7() {
		int[] arr = { -2, 1, 1 };
		Assert.assertEquals(2, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test8() {
		int[] arr = { 1, -2, 3 };
		Assert.assertEquals(3, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test9() {
		int[] arr = { 1, -2, };
		Assert.assertEquals(1, KadanesAlgo.findMaxSumContiguousSubArray(arr));
	}

	@Test
	public void test10() {
		int[] actual = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int[] expected = { 4, -1, -2, 1, 5 };
		Assert.assertArrayEquals(expected, KadanesAlgo.findRangeOfMaxSumContiguousSubArray(actual));
	}

}
