package Collection;

import java.util.LinkedList;
import java.util.Spliterator;

public class SplitIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer>  names=new LinkedList<Integer>();
	       
	       names.add(10);
	       names.add(11);
	       names.add(14);
	       names.add(15);
	       names.add(16);
	       names.add(17);
	       System.out.println("______Splite_____");
	       Spliterator<Integer> namesSpliterator = names.spliterator();
	       namesSpliterator.forEachRemaining(System.out::println);		
	  
	       
	}

}
