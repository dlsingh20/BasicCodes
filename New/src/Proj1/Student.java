package Proj1;

public class Student 
{
	int rollno;
	String name;
	
	void insertdata(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayInfo()
	{
		System.out.println(rollno + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
Student s2=new Student();
s1.insertdata(20, "komal");
s2.insertdata(90, "shubham");
	s1.displayInfo();
	s2.displayInfo();}


}
