/*
 * Emma Elliott
April 15,2020
Subroutines math program, user will choose one from five different math equations and this program will be executed.
 */
package subroutines;

import java.util.Scanner;   
/**
 *
 * @author gregelliott
 */
public class Subroutines {

    /**
     * @param num1
     * @param num2
     * @return 
     */
//Sum of two numbers
public static int sum2nums (int num1,int num2)
{
    int sum= num1+num2;
    return (sum);  
}
//Finding the volume of a rectangular prism
public static int volOfrectangularprism (int length, int width, int height)
{
    int volume=length*width*height;
    return (volume);
}
//Find the circumference of a circle
public static double circles (double radius)
{
    double circumference= Math.PI*2*radius;
    return(circumference);
}
// FInd the average of 4 numbers
public static void average (int n1, int n2, int n3, int n4)
{
    double average= (n1+n2+n3+n4)/4;
    System.out.println("The average of your 4 numbers is "+ average);
}
//Find the factors of a number
public static void factors (int number)
{
    int i;
        
    for(i = 1; i <= number; i++) {
      if(number%i == 0) {
        System.out.format(" %d  ", i);
        }
    }
}
//Asks user to enter the number of the program they wish to complete
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int userchoice;
        
        do
        {
        System.out.println("Enter the number of the mathematical statement you wish to complete");
        System.out.println("1. Sum of 2 numbers");
        System.out.println("2. Volume of a rectangle");
        System.out.println("3. Circumference of a circle");
        System.out.println("4. Average of 4 numbers");
        System.out.println("5. Factors of a number");
        System.out.println("6. Exit");
        
        userchoice=keyboard.nextInt();
        //Choice 1
            if (userchoice==1)
            {
                int n1, n2;
        
                System.out.println("Enter the first number");
                n1=keyboard.nextInt();
        
                System.out.println("Enter the second number");
                n2=keyboard.nextInt();
        
                System.out.println("The sum of the two numbers is "+sum2nums (n1,n2));
            }
        //Choice 2
            else if (userchoice==2)
            {
                int length, width, height;
                
                System.out.println("Enter the length");
                length=keyboard.nextInt();
        
                System.out.println("Enter the width");
                width=keyboard.nextInt(); 
                
                System.out.println("Enter the height");
                height=keyboard.nextInt(); 
                
                System.out.println("The volume of the rectangular prism is "+ volOfrectangularprism (length, width, height));
            }
        //Choice 3
            else if (userchoice==3)
            {
                double radius; 
                
                System.out.println("Enter the radius of the circle");
                radius=keyboard.nextInt();
                
                System.out.println("The circumfence of the circle is "+ circles (radius));
            }
        //Choice 4
            else if (userchoice ==4)
            {
                int num1, num2, num3, num4;
                
                System.out.println("Enter the first number" );
                num1=keyboard.nextInt();
                System.out.println("Enter the second number" );
                num2=keyboard.nextInt();
                System.out.println("Enter the third number" );
                num3=keyboard.nextInt();
                System.out.println("Enter the fourth number" );
                num4=keyboard.nextInt();
                
                average (num1,num2,num3,num4);
            }
        //Choice 5
            else if (userchoice==5)
            {
                int number; 
                
                System.out.println("Enter a number" );
                number=keyboard.nextInt();
                
                System.out.println("The factors of " + number +" are:");
                factors (number);
                System.out.println(" ");
            }
        //Choice 6 (exit from the program)
        }while (userchoice !=6);
        
        
    }
}
