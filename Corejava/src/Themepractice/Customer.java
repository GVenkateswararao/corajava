package Themepractice;
class Bank{
	void form() {
		System.out.println("Details age-name-");
		
	}
	void submitProof(String id,String addres) {
		 System.out.println("id="+id+"and adress="+addres);
	}
	String passBook() {
		return"passBook";
		
	}
	String deposit(int amount) {
		System.out.println("Amount is given"+amount);
		return "deposited";
	}
}
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bank SBI=new Bank();
           SBI.form();
           SBI.submitProof("pan:BJIWDK3E","adhar:12120");
           System.out.println("Bank given "+SBI.passBook());
           System.out.println("Amount"+SBI.deposit(345));
	}
	
	

}
