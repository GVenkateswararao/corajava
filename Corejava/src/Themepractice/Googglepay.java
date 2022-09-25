package Themepractice;
class BankDetails{
	 long acc_no;
	 String branchname;
	 static String bankname;
	 double showbalance;
	 
	 
}
public class Googglepay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankDetails SBI=new BankDetails();
        SBI.acc_no=12256369;
        SBI.branchname="State Bank Of India vmbanjar";
        SBI.bankname="StateBankofIndia";
        SBI.showbalance=121213;
        System.out.println("the acount number is "+ SBI.acc_no);
        System.out.println("Branch name is "+ SBI.branchname);
        System.out.println("Bnak name "+SBI.bankname);
        System.out.println("Balance "+SBI.showbalance);		
       
	}

}
