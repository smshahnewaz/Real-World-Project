package com.collection;

public class FizBuz {
	public static void main(String[] args) {
		for(int i=1; i<50; ++i) {
			System.out.println(i);
			if((i%3==0 && i%5==0)){
				System.out.println("FizzBuzz!");
			}else if((i%3==0)) {
				System.out.println("Fiz!");
			}else if((i%5==0)) {
				System.out.println("Buz!");
			}
		}
	}

}
