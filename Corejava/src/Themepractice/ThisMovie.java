package Themepractice;
class mve{
	String name;
	float rating;
	
	mve( String name,int rating){
		this.name=name;
		this.rating=rating;	
	}
	void show () {
		System.out.println("movie="+name);
		System.out.println("rating="+rating);
}
}
public class ThisMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mve dhamu=new mve("RRR",5);
       dhamu.show();
       mve sr = new mve("Sitha Rama",(int) 3.1);
       sr.show();
	}

}
