package Collection;

import java.util.TreeSet;
import java.util.Set;

public class SetDemo2 {

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
	     
	 
	      
	      System.out.println("Lowest Value: "+((TreeSet<String>) hs).first()); 
	      
	         System.out.println("Highest Value: "+((TreeSet<String>) hs).pollLast()); 
	         System.out.println("ceiling value: "+((TreeSet<String>) hs).ceiling("M")); 
          
	         System.out.println("Reverse Set: "+((TreeSet<String>) hs).descendingSet());  
	           
	         System.out.println("Head Set: "+((TreeSet<String>) hs).headSet("F", false));  
	          
	         System.out.println("SubSet: "+((TreeSet<String>) hs).subSet("A", false, "E", true));  
	           
	         System.out.println("TailSet: "+((TreeSet<String>) hs).tailSet("C", false));  
	}

}
