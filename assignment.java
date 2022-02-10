import java.util.Scanner;

 

public class Main {
Scanner sc = new Scanner(System.in);  

//function to checkPalindrome
       public void checkPalindrome()  
       {
    	   System.out.println("Enter a number");
    	   int a=sc.nextInt();
           int b=a;
           int remainder=0;
           while(b!=0)
           {
        	   remainder = (remainder*10) + b%10;
        	   b=b/10;
           }
           if(remainder==a)
           {
        	   System.out.println("Entered number is a palindrome");
           }
           else
           {
        	   System.out.println("Entered number is not a palindrome");
           }

       }

       
//function to printPattern       
       public void printPattern() 
       {
    	 System.out.println("Enter a number");  
         int a=sc.nextInt();
         for(int i=1;i<=a;i++)
         {
        	 for(int j=a;j<=i;j--)
        	 {
        		 System.out.print("*");
        	 }
           System.out.println();
         }   
       }

 

//function to check no is prime or not

        public void checkPrimeNumber()
        {
           System.out.println("Enter a number");
           int a=sc.nextInt();
		   if(a==1)
		   {
		      System.out.println("Entered number is not a prime no.");
			}   
          else if(a==2 || a==3)
           {
        	   System.out.prinln("Entered number is a prime no.");
           }
           else if(a%6==5 || a%6==1)
           {
        	   System.out.println("Entered number is a prime no.");
           }
           else
           {
        	   System.out.println("Entered number is not a prime no.");
           }
        }

         

// function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           System.out.println("Enter a number");
           int a=sc.nextInt();
           int b=0;
           System.out.print(first + " " + second);
           for(int i=1;i<=(a-2);i++)
           { 
        	   b=first+second;    
        	   System.out.print(" "+b);    
        	   first=second;    
        	   second=b;
           }
           

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

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