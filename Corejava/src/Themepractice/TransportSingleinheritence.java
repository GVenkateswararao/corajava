package Themepractice;
import java.util.Scanner;
class Bus3{
	int a;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the a number  ");
		a=sc.nextInt();		
	}
	void busno() {
		System.out.println("Bus number ="+a);
	}
	
}
class Transport1 extends Bus3{
	String b;
	void output() {
		System.out.println("Enter b value");
	   b=sc.next();
	}
	void name() { 
		System.out.println("transpot name="+b);
	}
}
public class TransportSingleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Transport1 T=new Transport1();
       T.input();
       T.busno();
       T.output();
       T.name();
	}

}
