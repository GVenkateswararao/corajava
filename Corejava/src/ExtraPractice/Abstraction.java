package ExtraPractice;
abstract class Animal{
	abstract void lifeSpan();
	abstract void eat();
	
}
class Tiger extends Animal{
	void lifeSpan() {
		System.out.println("tiger life span is 8 to 10 years");
	}
	void eat() {
		System.out.println("tiger eats meat");
	}
}
class Zirafee extends Tiger{
	void lifeSpan() {
		System.out.println("Zerafee life span is 8 to 10 years");
	}
	void eat() {
		System.out.println("Zerafee eats leaves");
}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal A;
    A= new Tiger();
    A.lifeSpan();
    A.eat();
    A=new Zirafee();
    A.lifeSpan();
    A.eat();
	}

}
