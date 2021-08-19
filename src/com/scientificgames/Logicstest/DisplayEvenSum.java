package com.scientificgames.Logicstest;

public class DisplayEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=50,sum=0;
		for(int i=0;i<=50;i+=2)
		{
			sum=sum+i;
			
		}
System.out.println("sum of even number is "+ sum);
if(sum%2==0)
	System.out.println(sum+" is even number");
else 
	System.out.println(sum +"is odd number");
	}

	
}
