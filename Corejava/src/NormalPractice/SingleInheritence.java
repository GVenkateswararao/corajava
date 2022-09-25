package NormalPractice;
import java.util.Scanner;
class Square{
	int a;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter a value");
		a=sc.nextInt();
		
	}
	void sqr() {
		System.out.println("square= "+(a*a));
		
	}
}
class Addition extends Square{
	int b;
	void accept() {
		System.out.println("Enter b value: ");
		b=sc.nextInt();
		
	}
	void add() {
		System.out.println("sun= "+(a+b));
	}
}
public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Addition A=new Addition();
     A.input();
     A.sqr();
     A.accept();
     A.add();
     
	}

}
