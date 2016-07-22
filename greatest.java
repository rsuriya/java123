import java.util.Scanner;


public class Sample {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the numbers one by one");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("the greatest among three numbers is : "+a);
		}
		else if(b>c)
		{
			System.out.println("the greatest among three numbers is : "+b);
		}
		else
		{
			System.out.println("the greatest among three numbers is : "+c);
		}
	}
}