package org.student;
import org.student.AxisBank;
public class AxisBank extends BankInfo{
public void deposit()
{
	System.out.println("Method override");
	System.out.println("Deposit: 10000");
}
public static void main(String[] args) {
AxisBank obj = new AxisBank();
obj.saving();
obj.fixed();
obj.deposit();
}
}
