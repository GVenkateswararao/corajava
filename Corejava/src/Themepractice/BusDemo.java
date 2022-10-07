package Themepractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class BusDemo {

public BusDemo(int busno, String routename, int rate) {
		super();
		this.busno = busno;
		this.routename = routename;
		this.rate = rate;
	}
private int busno;
private String routename;
private int rate;
	public int getbusno() {
	return busno;
}
public void setbusno(int bu ) {
	this.busno = busno;
}
public String getroutename() {
	return routename;
}
public void setroutename(String routename) {
	this.routename = routename;
}
public int getrate() {
	return rate;
}
public void setrate(int rate) {
	this.rate = rate;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<BusDemo> list=new ArrayList<BusDemo>();
		   list.add(new BusDemo(101,"badrachalam",1000));
		   list.add(new BusDemo(103,"vmbanjar",2000));
		   list.add(new BusDemo(104,"sathiupalli",3000));
		   list.add(new BusDemo(105,"penuballi",4000));
		   list.add(new BusDemo(106,"khammam",5000));
		   list.add(new BusDemo(108,"vira",6000));
		   list.add(new BusDemo(109,"kothagudem",7000));
		   list.add(new BusDemo(111,"thalda",8000));
		   
		   Iterator<BusDemo> li=list.iterator();
		   while(li.hasNext()) {
			   BusDemo ee=li.next();
			   if(ee.getbusno()==109) {
				   System.out.println(ee.getbusno()+" "+ee.getroutename()+" "+ee.getrate());
			   }
		   }
		   
		   
	}
	
	

}

