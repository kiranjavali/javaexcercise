package com.scientificgames.Logicstest;

public class Excercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				if (k == 1) {
					System.out.print(k);
					k--;
					continue;
				}
				if (k == 0) {
					System.out.print(k);
					k++;
					continue;
				}
			}
			System.out.println();
		}

	}

}
