
public class Ass03 {

	public static void main(String[] args) {
		
int a,i,n,sum=0;
a=Integer.parseInt(args[0]);
n=a;
while(a!=0)
{
	i=a%10;
	sum=sum*10+i;
	a=a/10;
}
if(n==sum)
{
	System.out.println("number is pallindrome");
}
else
	{
	System.out.println("number is not pallindrome");}
	}

}
