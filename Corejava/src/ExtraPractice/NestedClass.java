package ExtraPractice;
class SBI{
	Locker key=new Locker();
	void bankBalance() {
		System.out.println("bank balance is 20 lack");
		key.access();
		
	}
	class 	Locker{
		void access() {
			System.out.println("bank employees only have acess to open the locker");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SBI B=new SBI();
   B.bankBalance();
	}

}
