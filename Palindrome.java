package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palin="madam";
String rev = "";
int len = palin.length();
for(int i=len-1; i>=0; i--)
{rev = rev + palin.charAt(i);

}
if (palin.equals(rev))
{
System.out.println("is a palindrome");

}
	else
	{System.out.println("is not a palindrome");
	
	}
}

}