package com.scientificgames.Logicstest;

public class Excercise7_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]= {10.0,11.3,4.5,-2.0, 3.6, -3.3, 0.0};
		double min=a[0];
		double max=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if (a[i]<min) {
				min=a[i];
			}
			if (a[i]>max) {
				max=a[i];
			}

		}
		System.out.println(min);
		System.out.println(max);
		

	}

}
