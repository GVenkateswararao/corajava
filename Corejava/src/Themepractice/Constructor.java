package Themepractice;
class Employe{
	int eid;
	double salary;
	  
	Employe(){
		eid=109;
		salary=20000;
			}
void show() {
	System.out.println("Id="+eid);
	System.out.println("salary="+salary);
}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employe venkat=new Employe();
        venkat.show();
        
	}

}
