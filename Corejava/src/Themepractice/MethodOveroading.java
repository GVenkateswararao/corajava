package Themepractice;
import java.util.Scanner;
class Overloading{
	void add(int a,float b) {
		System.out.println("sum the values "+(a+b));
	}
	void add(float a,int b) {
		System.out.println("sum the values "+(a+b));
	}
	
}
public class MethodOveroading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Overloading OV=new Overloading();
        System.out.println("Enter the two values ");
        int a=sc.nextInt();
        float b=sc.nextFloat();
        OV.add(a,b);
        float x=sc.nextFloat();
        int y=sc.nextInt();
        OV.add(x,y);
        
	}

}
