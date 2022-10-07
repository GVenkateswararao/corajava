package Collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> T=new TreeMap<Integer,String>();
         T.put(109,"venky");
         T.put(108,"srividya");
         T.put(116,"-prasanth");
         T.put(122, "tamiza");
         T.put(109, "venkat");
         T.put(110, "kamu");
         T.put(129, "damu");
         System.out.println(T);
  //        Set<Entry<Integer,String>> 
  //        S=T.entrySet();
  //         Iterator<Entry<Integer,String>>
  //       i=S.iterator();
  //     while(i.hasNext()) {
  //  	 Entry<Integer,String> ee=i.next();
  //	 System.out.println(ee.getKey()+" "+ee.getValue());
        	 	 
   //      }
	T.forEach((key,value)->System.out.println(key+" "+value));
      
	}
}


