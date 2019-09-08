import java.util.*;
public class A2Q11 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter investment amount:");
	System.out.println("Enter annual interest rate in percentage:");
	System.out.println("Enter number of years:");
	double ia=sc.nextDouble();
	double Ai=sc.nextDouble();
	double Y=sc.nextDouble();
	double Mi=(Ai/100)/12;
	double x=1+Mi;
	double y=Y*12;
	double z=(double)Math.pow(x, y);
	double f=ia *z;
	System.out.println("Accumulated value is $"+f);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
