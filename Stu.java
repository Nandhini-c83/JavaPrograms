package org.student;

public class Stu {
	public void getStuInfo (int id)
	{
		System.out.println("Student Id: "+id);
	}
	public void getStuInfo(String name)
	{
		System.out.println("Student Name: "+name);
	}
	public void getStuInfo(String email, long phoneno)
	{
		System.out.println("email id: "+email);
		System.out.println("phonenumber: "+phoneno);
	}
	public static void main(String[] args) {
		Stu obj=new Stu();
		obj.getStuInfo(67);
		obj.getStuInfo("Nandhini");
		obj.getStuInfo("nand.cm@gmail.com",79045644);
	}
}
