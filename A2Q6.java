import java.util.*;
public class A2Q6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter weight in pounds:");
	System.out.println("Enter height in inches:");
	double p=sc.nextDouble();
	double i=sc.nextDouble();
	double w=0.45359237 * p;
	double h=0.0254 * i;
	double b= w/(h*h);
	
	System.out.println("BMI is "+b);
	
	
	

	}

}
