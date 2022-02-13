/**
 * 
 */
package Nithish_preWorkAssignmentSolution;

import java.util.Scanner;

/**
 * @author NithishDongreT
 *
 */
public class Nithish_preWorkAssignmentSolution {
	
	 

	Scanner sc = new Scanner(System.in);

	 

	           //function to checkPalindrome

	       public void checkPalindrome()  {
	    	   
	    	   System.out.println("Please Enter a Positive Integer Number");
	    	   String number = sc.next();
	    	   
	    	   if(number.isBlank()){
	    		   System.out.println("Please Enter a Positive Integer Number");
	    		   System.out.println();
	    	   } else if (number.matches("\\d+")) {
	    		   int actual_number = Integer.parseInt(number);// Converting a String to number
	    		   if (actual_number <= 0) {
	    			   System.out.println("Please Enter Positive Integer Number");
	    		   } else {
	    			   int copy_number = actual_number, reversed = 0;
		    		   for(;actual_number != 0; actual_number /= 10) {
			    		   int digit = actual_number % 10;
			    		   reversed = reversed * 10 + digit;
			    	    }
		    		   if(reversed == copy_number) {
		    			   System.out.println(copy_number + " Number is Palindrome");
		    		   } else {
		    			   System.out.println(copy_number + " Number is not Palindrome");
		    		   }
	    		   }
	    	   } else {
	    		   System.out.println("Please Enter a Positive Integer Number");
	    		   System.out.println();
	    	   }

	      }

	 

	            //function to printPattern

	       public void printPattern() {
	    	   System.out.println("Please Enter a Positive Integer Number");
	    	   String number = sc.next();
	    	   
	    	   if(number.isBlank()){
	    		   System.out.println("Please Enter a Positive Integer Number");
	    		   System.out.println();
	    	   } else if (number.matches("\\d+")) {
	    		   int actual_number = Integer.parseInt(number);// Converting a String to number
	    		   if (actual_number <= 0) {
	    			   System.out.println("Please Enter Positive Integer Number");
	    		   } else {
	    			   for (int i= actual_number-1; i>=0 ; i--)
		    		   {
		    			   for (int j=0; j<=i; j++)
		    			   {
		    				   System.out.print("*");
		    			   }
		    			   System.out.println();
		    		   }
	    		   }
	    	   } else {
	    		   System.out.println("Please Enter a Positive Integer Number");
	    		   System.out.println();
	    	   }

	      }

	 

	          //function to check no is prime or not

	        public void checkPrimeNumber() {
		    	   System.out.println("Please Enter a Positive Integer Number");
		    	   String number = sc.next();
		    	   
		    	   if(number.isBlank()){
		    		   System.out.println("Please Enter a Positive Integer Number");
		    		   System.out.println();
		    	   } else if (number.matches("\\d+")) {
		    		   int actual_number = Integer.parseInt(number);// Converting a String to number
		    		   for(int i = 2; i < actual_number; i++) {
		    			   if(actual_number % i == 0) {
		    				   System.out.println(actual_number + " Number is not prime number");
		    				   return;
		    			   }
		    		   }
		    		   System.out.println(actual_number + " Number is a prime number");
		    	   } else {
		    		   System.out.println("Please Enter a Positive Integer Number");
		    		   System.out.println();
		    	   }
	        }

	         

	          // function to print Fibonacci Series

	          public void printFibonacciSeries() {
	        	  //initialize the first and second value as 0,1 respectively.
	        	  int first = 0, second = 1;

		    	  System.out.println("Please Enter a Positive Integer Number");
		    	  String number = sc.next();
		    	  
		    	  if(number.isBlank()){
		    		   System.out.println("Please Enter a Positive Integer Number");
		    		   System.out.println();
		    	   } else if (number.matches("\\d+")) {
		    		   int actual_number = Integer.parseInt(number);// Converting a String to number
		    		   if (actual_number == 1) {
		    			   System.out.println(first);
		    			   return;
		    		   } else if(actual_number == 2) {
		    			   System.out.print(first + ", ");
			    		   System.out.println(second);
			    		   return;
		    		   } else if(actual_number == 0) {
		    			   System.out.println("Please Enter a Integer Number greater than 0");
		    		   } else {
		    			   System.out.print(first + ", ");
			    		   System.out.print(second + ", ");
		    			   for (int i = 0;i <= actual_number-3; i++) {
			    			   int temp = first + second;
			    			   if (i == actual_number-3) {
			    				   System.out.print(temp);
			    				   return;
			    			   }
			    			   System.out.print(temp + ", ");
			    			   first = second;
			    			   second = temp;
			    			   }return;
		    		   }
		    	   }

	          }

	 

	//main method which contains switch and do while loop

	      public static void main(String[] args) {

	                Nithish_preWorkAssignmentSolution obj = new Nithish_preWorkAssignmentSolution();

	                int choice;

	                Scanner sc = new Scanner(System.in);

	do {

	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();

	 

	choice = sc.nextInt();

	switch (choice) {

	 

	case 0:

	choice = 0;

	break;

	 

	case 1: {

	obj.checkPalindrome();

	}

	break;

	 

	case 2: {

	 

	obj.printPattern();

	}

	break;

	 

	case 3: {

	obj.checkPrimeNumber();

	}

	break;

	 

	case 4: {

	 

	obj.printFibonacciSeries();

	}

	break;

	 

	default:

	System.out.println("Invalid choice. Enter a valid no.\n");

	}

	 

	} while (choice != 0);

	System.out.println("Exited Successfully!!!");

	sc.close();

	}

}
