package Collection;

import java.util.Vector;
import java.util.List;

public class VectorListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>Li=new Vector<Integer>();
	      Li.add(22);
         Li.add(null);
	      Li.add(44);
	      Li.add(55);
	      Li.add(22);
	      Li.add(34);
	      Li.add(66);
	      Li.add(77);
	      Li.add(88);
	      Li.add(99);
	      Li.add(100);
	      System.out.println(Li);
	     Li.add(4,98);
	     System.out.println(Li);

	}

}
