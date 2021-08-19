package com.scientificgames.Logicstest;

public class Excercise9_NC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =43423;
		int sn=2,count=0,rem=0;
		
		while(num>0)
		{
			rem=num%10;
			if (rem==sn) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

	}

}
