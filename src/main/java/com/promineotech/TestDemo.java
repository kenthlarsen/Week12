package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
		int total = 0;
		if(a > 0 && b > 0) {
			total = a + b;
		} else if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Invalid Parameters");
		}
		return total;
	
	}
	
	public int multiplyPositive(int c, int d) {
		int total = 0;
		if (c > 0 && d > 0) {
			total = c * d;
		} else if (c <= 0 || d <= 0) {
			throw new IllegalArgumentException("Invalid Parameters");
		}
		return total;
		
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;		
	}

	public int randomNumberSquared() {
		int randomNumber = getRandomInt();
	 	int randomNumberSquared = randomNumber * randomNumber;
	 	return randomNumberSquared;
	}
}
