package Themepractice;
import java.util.Scanner;
class Bus{
	void running(int x, int y ) {
		System.out.println("Enter the bus1 timing of startin and ending ");
	}
	void running(float x,float y) {
		System.out.println("Enter the bus2 timings of starting and ending ");
	}
}

public class Transpot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Bus Bu=new Bus();
       System.out.println("Enter the bus numbers");
       int x=sc.nextInt();
       int y=sc.nextInt();
       Bu.running(x,y);
       float a=sc.nextFloat();
       float b=sc.nextFloat();
       Bu.running(a,b);   
	}

}
