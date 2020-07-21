package io;

public class RecursiveFactorial {

	public static void main(String[] args) {
		int num = 6;
		long factorial = multiplyNumbers(num);
		System.out.println("Factorial of " + num + " = " + factorial);
	}

	public static long multiplyNumbers(int num) {
		if (num >= 1)
			return num * multiplyNumbers(num - 1); //recursion
		else
			return 1; // terminate
	}

}
