package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Integer,String> hm=new HashMap<Integer,String>();
         hm.put(109,"venky");
         hm.put(108,"srividya");
         hm.put(116,"-prasanth");
         hm.put(122, "tamiza");
         hm.put(109, "venkat");
         hm.put(110, "kamu");
         hm.put(129, "damu");
         System.out.println(hm);
         System.out.println("---------------------------");
         
        LinkedHashMap<Integer,String> L=new LinkedHashMap<Integer,String>();
         L.put(109,"venky");
         L.put(108,"srividya");
         L.put(116,"-prasanth");
         L.put(122, "tamiza");
         L.put(109, "venkat");
         L.put(110, "kamu");
         L.put(129, "damu");
         System.out.println(hm);
         System.out.println("---------------------------");
         
         TreeMap<Integer,String> T=new TreeMap<Integer,String>();
         T.put(109,"venky");
         T.put(108,"srividya");
         T.put(116,"-prasanth");
         T.put(122, "tamiza");
         T.put(109, "venkat");
         T.put(110, "kamu");
         T.put(129, "damu");
         System.out.println(hm);
         
         
         
         
	}

}
