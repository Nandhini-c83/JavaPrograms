package Week1.Day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "$$Welcome to 2nd Class of Automation$$";
int letter = 0; int space = 0; int num = 0; int specialChar = 0;
char[] test1 = test.toCharArray();
for (int i=0; i<test1.length; i++)
{if(Character.isLetter(test1[i])) {
letter++;
}
else if(Character.isDigit(test1[i]))
	{num++;
	}
else if (Character.isSpaceChar(test1[i]))
	{	space++;
	}	
	else
	
specialChar++;		
	}

System.out.println("letter: " +letter);
System.out.println("space: " +space);
System.out.println("space: " +num);
System.out.println("specialcharacter: "+specialChar);
}
	}
