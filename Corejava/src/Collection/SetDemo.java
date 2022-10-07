package Collection;
import java.util.HashSet;
import java.util.Set;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<String>hs=new HashSet<String>();
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
      System.out.println(hs.size());
      System.out.println(hs.isEmpty());
      System.out.println(hs.remove("v"));
      System.out.println(hs.contains("G"));
      
      
      
	}

}
