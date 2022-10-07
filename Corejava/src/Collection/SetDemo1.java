package Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<String>hs=new LinkedHashSet<String>();
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
	}

}
