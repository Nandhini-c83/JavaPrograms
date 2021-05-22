package org.student;

import org.department.Department;

public class Students extends Department{
	public void studentName()
	{
		System.out.println("Student Name: Nandhini");
	}
	public void studentDept()
	{
		System.out.println("Dept: CS1");
	}
public void studentId()
{
	System.out.println("ID: 6789");
}
public static void main(String[] args) {
	{
		Students obj = new Students();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
}
	
}
}
