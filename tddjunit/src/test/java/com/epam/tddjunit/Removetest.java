package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Removetest {

	RemoveAA removeA;
    @BeforeEach
	void setup() {
		removeA=new RemoveAA();
	}
	@Test
	void test1() {
		assertEquals("BCD", removeA.remove("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD", removeA.remove("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD", removeA.remove("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA", removeA.remove("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",removeA.remove("AABAA"));
	}
}