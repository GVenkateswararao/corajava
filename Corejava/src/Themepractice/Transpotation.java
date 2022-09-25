package Themepractice;
class BusTranspot{
   void goToBustand() {
	System.out.println("reach the bus stand ");
}
   void seeTheTimings() {
	  System.out.println("select the time");
	  
   }
   void reachTheBus() {
	   System.out.println("sit in the bus");
   }
   String payTheBill() {
	   return "Ticket";
	   
   }
   void reachTheTarget() {
	   System.out.println("Reach the target");
   }

}
public class Transpotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BusTranspot Bus=new BusTranspot();
        Bus.goToBustand();
        Bus.seeTheTimings();
        Bus.reachTheBus();
        System.out.println("Ticket is given "+Bus.payTheBill());
        Bus.reachTheTarget();
	}

}
