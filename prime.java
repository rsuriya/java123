
public class Ass02 {

	public static void main(String[] args) {
		int a,count=0,i;
	a=Integer.parseInt(args[0]);
	if(a==1&&a==0)
	{
		System.out.println("number is neither prime nor composite");
	}
	for(i=1;i<=a;i++)
	{
	 if(a%i==0)
	{
		++count;
	}
	
	}
	if(count==2)
		{
		System.out.println("number is prime");}
		
	else
	{
		System.out.println("number is  composite");
	}

}
}
