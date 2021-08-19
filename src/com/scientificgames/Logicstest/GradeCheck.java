package com.scientificgames.Logicstest;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 59;

		if (mark > 90) {
			System.out.println("A");

		} else if (mark < 90 && mark >= 80) {
			System.out.println("B");
		} else if (mark < 80 && mark >= 60) {
			System.out.println("C");
		} else
			System.out.println("F");

	}

}
