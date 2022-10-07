package NormalPractice;

public class NullpointerExceptiion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s= null;
   System.out.println("Before  NullpointerException   ");
   try {
	   System.out.println(s.length());
   }
   catch(Exception e){
	   e.printStackTrace();  
   }
   System.out.println("Before  NullpointerException");
	}

}
