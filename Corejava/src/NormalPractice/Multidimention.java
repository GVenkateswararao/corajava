package NormalPractice;
import java.util.Scanner;

class Array{

		int ar[][]=new int[4][4];
		Scanner sc=new Scanner(System.in);
		void A() {
			for(int i=0;i<4; i++) {
			 for(int j=0; j<4; j++) {
			System.out.println("Enter the elements");
	             	ar[i][j]=sc.nextInt();
			}
		}
	}
		void B() {
			for(int []X: ar) {
			   for(int P: X) {
				   System.out.print( " "+P+" ");
			   }
			   System.out.println();
			   System.out.println();
			}
		}
}	
		
public class Multidimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array R=new Array();
		R.A();
		R.B();
	
	}

}
