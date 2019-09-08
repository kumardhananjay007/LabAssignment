import java.util.*;
public class A2Q8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number; ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println(" a     b     pow(a,b)");
	int p1=(int)Math.pow(a,b);
	System.out.println(" "+a+"     "+b+"     "+p1 );
	a++;
	b++;
	
	int p2=(int)Math.pow(a,b);
	System.out.println(" "+a+"     "+b+"     "+p2 );
	a++;
	b++;
	int p3=(int)Math.pow(a,b);
	System.out.println(" "+a+"     "+b+"     "+p3 );
	a++;
	b++;
	int p4=(int)Math.pow(a,b);
	System.out.println(" "+a+"     "+b+"     "+p4 );
	a++;
	b++;
	int p5=(int)Math.pow(a,b);
	System.out.println(" "+a+"     "+b+"     "+p5 );
	
	
	
	
}
}