package guvi;
import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		String a;
		System.out.println("enter the character");
		Scanner in=new Scanner(System.in);
		a=in.next();
	if(a.equals("a")||a.equals("e")||a.equals("i") ||a.equals("o") ||a.equals("u"))
		{
			System.out.println("the character is a vowel");
		}
		else
		{
		System.out.println("the character is a consonant");	
		}

	}

}
