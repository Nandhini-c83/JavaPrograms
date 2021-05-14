package Week1.Day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "Tes12Le79af65";
int sum=0;
char[] text1 = text.toCharArray();
for (int i=0; i<text1.length; i++)
{
	if (Character.isDigit(text1[i])) {
int temp = Character.getNumericValue(text1[i]);
sum=sum+temp;
	}
}
System.out.println("Sum of all digits: "+sum);
	}

}
