import java.util.Scanner;



public class Sample {

	public static void main(String[] args) {
	int n;
	int sum=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the value of n");
	n=in.nextInt();
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("the sum is :"+sum);
	}	

}
