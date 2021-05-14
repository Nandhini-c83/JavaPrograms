package Week1.Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "changeme";
String test1="";
char test2[] = test.toCharArray();
for (int i=0; i<test2.length; i++)
{
	if(i%2==0)
	{
		test2[i]=test2[i];
	}
	else {
		test2[i]=Character.toUpperCase(test2[i]);
		}
test1=test1+test2[i];
}
System.out.println("oddIndex to uppercase="+test1);

}
}
