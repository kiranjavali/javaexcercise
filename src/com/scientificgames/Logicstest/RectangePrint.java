package com.scientificgames.Logicstest;

public class RectangePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	   
	        int l = 5;
	        int w = 10;

	 

	    for (int m = 0; m < l; m++)
	        {
	            if (m == 0 || m == (l - 1)) 
	            {
	                
	                for (int j = 0; j < w; j++) 
	                    {
	                        System.out.print("*");
	                    }
	                
	                System.out.println("\n");
	            }

	 

	            if (m>0 && m<(l-1))
	                {
	                    for (int k = 0; k < w; k++) 
	                    {
	                        if (k == 0 || k == w-2)
	                            {
	                                System.out.print("*");
	                            }
	                            System.out.print(" ");

	 

	                    }
	                            System.out.println("\n");
	                }

	 

	        }

	 

	    }

	 		
		}


	
