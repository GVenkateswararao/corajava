package Themepractice;
  abstract class Transpot4{
	 abstract void travel();
	 abstract void time();	 
 }
  class Bus5 extends Transpot4{
	  void travel() {
		  System.out.println("Bus reaches the with the time");
	  }
	  void time() {
		  System.out.println("the time taken is 20 mintes per 10 km");
	  }
  }
  class Train extends Bus5{
	  void travel(){
		  System.out.println("train reaches the with the time");
	  }
	  void time() {
		  System.out.println("the time taken is 10 minutes per 10 km");
	  }
  }
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Transpot4 T;
   T=new Bus5();
   T.travel();
   T.time();
   T=new Train();
   T.travel();
   T.time();  
   
	}

}
