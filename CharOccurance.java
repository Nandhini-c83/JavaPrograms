package Week1.Day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "welcome to chennai";
int occurance = 0;
char[] str1 = str.toCharArray();
int len = str1.length;
for (int i=0; i<str1.length-1; i++) {
	if (str1[i] =='e') {
		occurance++;
	}
	}
System.out.println("The occurance of character e is " +occurance);
}
}
