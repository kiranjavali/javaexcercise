package com.scientificgames.Logicstest;

public class MultiplyTable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,ec=0,oc=0; 
		for (int i=1;i<=30 ;i++)
		{
					System.out.println(num+" X "+ i+ " = "+ (num*i));
					if((num*i)%2==0)
					{
						System.out.println((num*i)+ " is even");
						ec=ec+1;
					}
					else 
					{
						System.out.println((num*i)+ " is odd");
						oc=oc+1;
					}
						

	}
		System.out.println("Count of even number is "+ ec);
		System.out.println("Count of even number is "+ oc);
		
	}
}
