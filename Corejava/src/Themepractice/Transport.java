package Themepractice;
class Train1{
	int num;
	String routename;
	double timings;
    String stationname;
	
	Train1(String routename,double timings,String stationname){
		
		this.routename=routename;
		this.timings=timings;
	    this.stationname=stationname;
	}
		
	void Show() {
		System.out.println("Routename "+routename);
		System.out.println("Timings "+timings);
		System.out.println("stationname "+stationname);
	}
}
public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Train1 TR=new Train1("hyd",10,"");
       TR.Show();
	}

}
