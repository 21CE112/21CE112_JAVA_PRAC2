//This program is created by Aryaan Rabara 21CE112
//Aim:Design a class named Circle containing following attributes and behavior.
//• One double data field named radius. The default value is 1.
//• A no-argument constructor that creates a default circle.
//• A Single argument constructor that creates a Circle with the specified radius.
// A method named getArea() that returns area of the Circle.
//• A method named getPerimeter() that returns perimeter of it.

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Testcylinder {
	public static void main(String args[])
	{
		double height;
		double radius;

				Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hieght:");
		height = sc.nextDouble();
		System.out.println("Enter the Radius:");
		radius = sc.nextDouble();
        //first creating an object of type cylinder inside the class Testcylinder
        // in order to access the functions of cylinder class  
		cylinder c = new cylinder(height,radius);
        //now we can pass the values to the data members using the constructors we have made 
		radius = c.getarea();
        //after that we just have to invoke the  getArea  and getPerimeter functions to get the results.
		System.out.println("The area of Cylinder is : " + radius);
        System.out.println("This program is created by Aryaan Rabara 21CE112");
	}
	

}
	