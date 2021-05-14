package Week1.Day2;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1 = "stops";
String text2 = "potss";
int count=1;
int len1=text1.length();
int len2=text2.length();
if(len1==len2)
{
	char[] text3 = text1.toCharArray();
	System.out.println(text3);
	char[] text4 = text2.toCharArray();
	System.out.println(text4);
	Arrays.sort(text3);
	Arrays.sort(text4);
		for (int i=0;i<len1-1;i++) {
		if (text3[i]==text4[i])
			count++;
	}
}
if (count==len1)
{	System.out.println("The word is a Anagram");
}else
{
	System.out.println("The word is not a Anagram");
}
}

}
