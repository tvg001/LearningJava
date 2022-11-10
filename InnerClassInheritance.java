package com.LearnNestedClass;
public  class InnerClassInheritance{
	private int number =12;
	public void print() {
		System.out.println("I am parent");
		
	}
	
	public class OuterInner{
		int value =0;
		public void read() {
			System.out.println("Hello I am reading");
		}
	}
	public static void main(String[] args) {
		InnerClassInheritance out = new InnerClassInheritance();
		InnerClassInheritance.OuterInner = out.OuterInner();
	}
}



