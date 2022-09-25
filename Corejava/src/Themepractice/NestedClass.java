package Themepractice;
class TranspoStation{
	Busdepo employee =new Busdepo();
	
	void salary() {
		System.out.println("the salary is 30000");
		employee.access();
	}
	class Busdepo{
		void access() {
			System.out.println("only empolyees are allowed");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TranspoStation T=new  TranspoStation();
		 T.salary();
	}

}
