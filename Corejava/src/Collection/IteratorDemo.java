package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String>hs=new TreeSet<String>();
	      hs.add("F");
	      hs.add("G");
	      hs.add("Q");
	      hs.add("T");
	      hs.add("");
	      hs.add("F");
	      hs.add("E");
	      hs.add("v");
	      hs.add("K");
	      hs.add("G");
	      hs.add("M");
	      System.out.println(hs);
	      Iterator i=hs.iterator();
	      while(i.hasNext()) {
	    	System.out.println(i.next());
	      }
	}

}
