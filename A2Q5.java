import java.util.Scanner;

public class A2Q5 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter v0, v1, and t:");
double v0=sc.nextInt();
double v1=sc.nextInt();
double t=sc.nextInt();
double a=(v1-v0)/t;

System.out.println("The average acceleration is "+a);

	}

}
