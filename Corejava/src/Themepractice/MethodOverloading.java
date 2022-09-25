package Themepractice;
import java.util.Scanner;
class Sum{
	void add(int X,int Y){
		System.out.println("Integer sum "+(X+Y));
		
	}
	void add(float X,float Y) {
		System.out.println("Decimal sum "+(X+Y));
		
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        Sum su=new Sum();
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        su.add(a,b);
        float X=sc.nextFloat();
        float Y=sc.nextFloat();
        su.add(X,Y);
        
        
	}

}
