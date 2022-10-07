package core.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
private int eid;
private String ename;
private int salary;
	public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Employee> list=new ArrayList<Employee>();
   list.add(new Employee(101,"krishna",10000));
   list.add(new Employee(103,"deekshitha",20000));
   list.add(new Employee(104,"kamal",30000));
   list.add(new Employee(105,"swathi",40000));
   list.add(new Employee(106,"havinash",50000));
   list.add(new Employee(108,"srividya",60000));
   list.add(new Employee(109,"venkat",70000));
   list.add(new Employee(111,"lakshmi",80000));
   
   Iterator<Employee> li=list.iterator();
   
   while(li.hasNext()) {
	   Employee ee=li.next();
	   if(ee.getSalary()==70000) {
		   System.out.println(ee.getEid()+" "+ee.getEname()+" "+ee.getSalary());
	   }
   }
   List<Employee> f1=list.stream().filter(x->x.getSalary()==70000).collect(Collectors.toList());
   f1.forEach(t->System.out.println(t.getEid()+"--- "+t.getEname()+"---- "+t.getSalary()));
   
   List<Employee> f2=list.stream().filter(x->x.getSalary()==60000).collect(Collectors.toList());
   f2.forEach(t->System.out.println(t.getEid()+"--- "+t.getEname()+"---- "+t.getSalary()));
	}

}
