import java.util.*;

public class A2Q4 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number between 0 and 1000:");
int a=sc.nextInt();
int b=(a%10) + (a/10)%10 + (a/100);
System.out.println("The sum of the digits is "+b );


	}

}
