package com.junit005;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Junit005Test {
	

	
	@Test
	void test() {
		Junit005 junit005 = new Junit005();
		assertEquals(100, junit005.sum(50,50));
		
		// assertEquals 객체 x와 y가 일치함을 확인
	}

	
	@Test
	void test1() {
		int var = 10;
		int var2 = 20;
		assertTrue(var < var2);
		
		//assertTrue 특정 조건이 true인지 판단 
	}
	
	@Test
	void test2() {
		String str = "Junit";
		String str2 = "Junit";
		assertSame(str, str2);
		
		//assertSame 두 변수가 동일한 객체를 참조하는지 확인 
	}
	
	@Test
	void test3() {
		int[] array = {10,20,30};
		int[] array2 = {10,20,30};
		assertArrayEquals(array, array2);
		
		//assertArrayEquals 두 배열이 같은지 확인 
	}
//	@Test
//	void test3_() {
//		char[] expected = {'j', 'u', 'n', 'i','t'};
//		char[] actual = "junitt".toCharArray();
//		assertArrayEquals(expected, actual);
//		
//		//assertArrayEquals 두 배열이 다를 경우 Junit 오류 확인  
//	}
	
	@Test
	void test4() {
		Junit005 junit005 = new Junit005();
		assertNotNull(junit005.sum(0, 0));
		
		//assertNotNull 객체의 null 여부를 확인 
	}
	
}
