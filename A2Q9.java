import java.util.*;
public class A2Q9 {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter x1 and y1:");
System.out.println("Enter x2 and y2:");
double x1=sc.nextDouble();
double y1=sc.nextDouble();
double x2=sc.nextDouble();
double y2=sc.nextDouble();
double a=x2-x1;
double b=y2-y1;
double A=(double)Math.pow(a, 2);
double B=(double)Math.pow(b, 2);
double d=A+B;
double D=(double)Math.sqrt(d);
System.out.println("The distance between the two points is "+D);


}
}