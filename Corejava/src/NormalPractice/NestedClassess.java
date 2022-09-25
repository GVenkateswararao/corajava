package NormalPractice;
class Jntuh{
	Department civil =new Department();
	void announcement() {
		System.out.println("exams will be conducted on oct 23rd");
		civil.preapare();
		
	}
	class Department{
		void preapare() {
			System.out.println("papers should be prepared in 12 days");
		}
	}
}
public class NestedClassess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Jntuh J=new Jntuh();
        J.announcement();
	}

}
