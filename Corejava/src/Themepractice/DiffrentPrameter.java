package Themepractice;
import java.util.Scanner;
class Different{
	void add(int x,int y) {
		System.out.println("add the two numbers "+(x+y));
	}
	 void add(int a,int b,int c) {
		 System.out.println("add the three numbers "+(a+b+c));
		 		
	 }
}
public class DiffrentPrameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Different D=new Different();
      System.out.println("Enter the two numbers");
      int x=sc.nextInt();
      int y=sc.nextInt();
      D.add(x,y);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      D.add(a,b,c);
      
	}

}
