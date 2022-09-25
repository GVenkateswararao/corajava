package Themepractice;
class movie{
	String name;
	int rating;
movie (){
	name= "sarkari varipata";
	rating= 9;
}
void show() {
	System.out.println("Name="+name);
	System.out.println("Rating="+rating);
}
}

public class CnstructorMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie mv=new movie();
		mv.show();
	}

}
