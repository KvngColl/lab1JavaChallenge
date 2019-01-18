package lab1JavaChallenge;
import java.util.Scanner;

public class QuestionThree {

	static Scanner r = new Scanner(System.in);
	   public static void main(String args[])
	   {
	      System.out.print("What is the radius? ");
	      
	      double radius = r.nextDouble(); //double as the user might enter decimals
	      
	      double area = Math.PI * (radius * radius); //Area of circle is PI*radius*radius
	      System.out.printf("The area of circle is " + "%.2f", area); //Print area
	     
	      double circumference= Math.PI * 2*radius; //Circumference is 2*PI*radius
	      System.out.printf(" of circumference of " + "%.2f", circumference); //Print circumference
	   }
}

