import java.util.*;
public class A2Q10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three points for a triangle:");
	double x1=sc.nextDouble();
	double y1=sc.nextDouble();
	double x2=sc.nextDouble();
double y2=sc.nextDouble();
double x3=sc.nextDouble();
double y3=sc.nextDouble();
double a1=x2-x1;
double b1=y2-y1;
double a2=x3-x2;
double b2=y3-y2;
double a3=x1-x3;
double b3=y1-y3;
double A1=(double)Math.pow(a1, 2);
double B1=(double)Math.pow(b1, 2);
double A2=(double)Math.pow(a2, 2);
double B2=(double)Math.pow(b2, 2);
double A3=(double)Math.pow(a3, 2);
double B3=(double)Math.pow(b3, 2);
double A=A1+B1;
double B=A2+B2;
double C=A3+B3;
double s1=(double)Math.sqrt(A);
double s2=(double)Math.sqrt(B);
double s3=(double)Math.sqrt(C);
	double s=(s1+s2+s3)/2;
	double a=s*(s-s1)*(s-s2)*(s-s3);
	double ar=(double)Math.sqrt(a);
	System.out.println("The area of the triangle is "+ar);
	
	
	
	
	
	
	
	
	}
}
