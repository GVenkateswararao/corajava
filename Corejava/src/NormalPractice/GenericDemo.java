package NormalPractice;
class Venkat<V>{
	void show(V a) {
		System.out.println(a);
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Venkat <String>S=new Venkat<String>();
      S.show("ramu");
      Venkat <Integer>I=new Venkat<Integer>();
      I.show(100);
      
	}

}
