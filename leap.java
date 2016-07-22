import java.util.Scanner;


public class Sample {

	public static void main(String[] args) {
	int year;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the year");
	year=in.nextInt();
	if(year%400==0)
	{
		System.out.println("it is leap year");
	}
	else if(year%4==0&&year%100!=0)
	{
		System.out.println("it is  leap year");
	}
	else
	{
		System.out.println("not leap year");
	}
			
	}
}
	