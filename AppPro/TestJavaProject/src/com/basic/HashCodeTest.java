package com.basic;

public class HashCodeTest {
	
		@Override
		public int hashCode() {
			
			return 123;
		}
		
		@Override
		public String toString() {
		return "sarfaraz@Test";
		}
	public static void main(String[] args) {
		
		HashCodeTest test = new HashCodeTest();
		System.out.println(test.hashCode());
		System.out.println(test.toString());

	}

}