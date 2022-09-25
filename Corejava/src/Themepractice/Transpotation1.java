package Themepractice;
class Bus1{
	long profit;
	int loss;
	
	Bus1(){
		profit=100000;
		loss=2000;
	}
	void show(){
		System.out.println("profit"+profit);
		System.out.println("loss"+loss);
	}
	
}
public class Transpotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bus1 B=new Bus1();
      System.out.println();
      B.show();
	}

}
