package Themepractice;
class Student{
	int id;
	float marks;
	String name;
	String gender;
	String branch;
	static String college;
}
class Employee{
	 int empid;
	 double salary;
	 String compinyname;
	 char male;
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class VariblesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student venkat=new Student();
        venkat.id=109;
        venkat.marks=70.5f;
        venkat.name="venky";
        venkat.gender="male";
        venkat.college="MIST";
        System.out.println(venkat.id);
        System.out.println(venkat.marks);
        System.out.println(venkat.name);
        System.out.println(venkat.gender);
        System.out.println(venkat.college);
        
        Employee shiva=new Employee();
        shiva.empid=122;
        shiva.salary=20000;
        System.out.println("id="+shiva.empid);
        System.out.println("salary="+shiva.salary);
        
        
	}

}
