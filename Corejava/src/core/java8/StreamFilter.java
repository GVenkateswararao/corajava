package core.java8;

import java.util.ArrayList;
import java.util.List;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
}
public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Product> pl = new ArrayList<Product>();  
	        //Adding Products  
	        pl.add(new Product(1,"HP Laptop",25000f));  
	        pl.add(new Product(2,"Dell Laptop",30000f));  
	        pl.add(new Product(3,"Lenevo Laptop",28000f));  
	        pl.add(new Product(4,"Sony Laptop",28000f));  
	        pl.add(new Product(5,"Apple Laptop",90000f));  
	        pl.stream()  
	                    .filter(p ->p.price> 28000)     
	                    .map(pm ->pm.price)          
	                    .forEach(System.out::println);   
	}

}
