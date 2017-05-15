package com.kwave.java.intro;

public class IntroGates {

	int addTwoDigits(int n) {
	    
	    int ten = n/10;
	    int one = (n-(ten*10))%10;
	    return ten + one;
	}
	
	
	public int largestNumber(int n) {

	    int temp = 0;
	        
	        temp = (int)Math.pow(10,n);
	        System.out.println(temp);

	    return temp-1;
	}
	
	
	int candies(int n, int m) {
		System.out.println((m/n)*n);
 	   return (m/n)*n;
 
	}
	
	
	int seatsInTheater(int nCols, int nRows, int col, int row) {

	    int sum = nCols * nRows;
	    System.out.println(sum);
	    int empty_cols = row * nCols;
	    System.out.println(empty_cols);
	    int empty_rows = (col-1) * nRows;
	    System.out.println(empty_rows);
	    int common = (col-1)*row;
	    System.out.println(common);
	    System.out.println(sum-empty_cols-empty_rows+common);
	    return sum-empty_cols-empty_rows+common;
	}
	
	
	int maxMultiple(int divisor, int bound) {

	    int temp = 0;
	    int i = 0;
	        for(i =0; i<bound;i++)
	        {

	                temp = i*divisor;
	                if(temp>bound)
	                    break;
	        }
	    int temp1 = (i-1)*divisor;
	    System.out.println(temp1);
	    return temp1;
	}
	
	
	int circleOfNumbers(int n, int firstNumber) {
		   int temp;
		  
		        if(n<=(n/2)+firstNumber)
		        {
		             temp= ((n/2)+firstNumber)-n;
		        }
		        else{
		                temp = (n/2)+firstNumber;
		        }
		   
		    return temp;
		}

	
	
	int lateRide(int n) {
	    int hour = 0;
	    int minute = 0;
	    hour = n/60;
	    minute = n-60*hour;
	    int hour_temp = 0;
	    int hour_temp1 = 0;
	    int minute_temp = 0;
	    int minute_temp1 = 0;
	    if(hour>=10)
	    {
	        hour_temp = hour/10;
	    }
	        hour_temp1 = hour%10; 
	    if(minute>=10)
	    {
	        minute_temp = minute/10;
	    }
	        minute_temp1 = minute%10;
	    
	        System.out.println(hour_temp+hour_temp1+minute_temp+minute_temp1);
	    return hour_temp+hour_temp1+minute_temp+minute_temp1;
	}	
	
	
	
	int phoneCall(int min1, int min2_10, int min11, int s) {

	    
	    int temp = min1+(min2_10*9);
	    int one = 0;
	    int ten = 0;
	    if(s<temp)
	    {
	        one = (s-min1)/min2_10;
	        System.out.println(one+1);
	        return 1+one;
	    
	    }
	    else{
	        ten = (s-min1-(min2_10*9))/min11;
	        System.out.println(10+ten);
	        return 10+ten;
	    }
	    
	}
}
