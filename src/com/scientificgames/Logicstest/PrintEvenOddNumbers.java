package com.scientificgames.Logicstest;

public class PrintEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 30;
		System.out.println("Printing Even numbers using for loop");
		for (int i = 0; i <= limit; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Prinitng Even numbers using while loop");
		int i = 0;
		while (i <= 30) {
			System.out.print(i + " ");
			i = i + 2;
		}
		System.out.println();
		System.out.println("Printing odd numbers using for loop");
		for (i = 1; i <= limit; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Prinitng odd numbers using while loop");
		i = 1;
		while (i <= 30) {
			System.out.print(i + " ");
			i = i + 2;
		}
	}

}
