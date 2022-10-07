package core.java8;
import java.util.Optional;
public class OptionalDemo {

	private static final Optional<String> value = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] str=new String[10];
         str[0]="java";
         Optional<String>cn=Optional.ofNullable(str[1]);
         if(cn.isPresent()) {
        	System.out.println(str[1].length());
        	
         }else
         {
        	 System.out.println("String is null");
         }
         System.out.println("Getting value: "+value.get());
         System.out.println("Statement-2");
         System.out.println("Statement-3");
         System.out.println("Statement-4");
         System.out.println("Statement-5");
	}
}
