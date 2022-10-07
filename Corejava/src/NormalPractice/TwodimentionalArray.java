package NormalPractice;

public class TwodimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[][]=new int[2][2];
       a[0][0]=2;
       a[0][1]=5;
       a[1][0]=4;
       a[1][1]=5;
       
       for(int[]x:a) {
    	   for(int y:x) {
    		   System.out.print("["+y+"]");
    		   
    	   }
    		System.out.println("");  
       }
       
      
	}

}
