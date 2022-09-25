package Themepractice;
class Bus2{
     Bus2(int salary){
    	 System.out.println("conductor salary "+salary);
     }
}
class Transpotation2 extends Bus2{
	Transpotation2(long income){
		super(20000);
		System.out.println("total income of transpotation "+income);
	}

}
public class SuperTranspotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Transpotation2 TR=new Transpotation2(100000000);
	}

}
