package Collection;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public final class LinkedIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>Li=new Vector<Integer>();
	      Li.add(22);
	      Li.add(44);
	      Li.add(55);
	      Li.add(22);
	      Li.add(34);
	      Li.add(66);
	      Li.add(77);
	      Li.add(100);
	      System.out.println(Li);
	      ListIterator i=Li.listIterator();
	      while(i.hasNext()) {
	    	  System.out.println(i.next());
	      }
	      System.out.println("previous number");
	    	  while(i.hasPrevious())
	    		  System.out.println(i.previous()); 
	    		    }
	    	  
	      }
	      

	


