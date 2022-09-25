package Themepractice;
class Emp{
	int eid;
	double salary;
	static String company;
	
	Emp(int eid,double salary){
		this("Infosis");
		this.eid=eid;
		this.show();
		this.salary=salary;	
  }
	Emp(String company){
		Emp.company=company;
	}
void show() {
	System.out.println("Id="+eid);
	System.out.println("salary="+salary);
	System.out.println("company="+company);
}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp venkat=new Emp(109,2000);
        venkat.show();
        
       Emp shiva=new Emp(112,4000);
       shiva.show();
        
	}

}
