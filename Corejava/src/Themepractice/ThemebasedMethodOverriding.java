package Themepractice;
class Bus4{
	void name() {
		System.out.println("bus name");
	}
	void ticketRate() {
		System.out.println("ticket rate");
	}
}
   class Adnary extends Bus4{
	   void name(){
		   System.out.println("adnory");  
	   }
	   void ticketRate() {
		   System.out.println("$10 for one km");
	   }
   }
   class Express extends Adnary{
	   void name() {
		   System.out.println("Express");
	   }
	   void ticketRate() {
		   System.out.println("$20 for one km");
	   }
   }
public class ThemebasedMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bus4 B=new Bus4();
       B.name();
       B.ticketRate();
       B=new Adnary();
       B.name();
       B.ticketRate();
       B=new Express();
       B.name();
       B.ticketRate();
       
       
       
	}

}
