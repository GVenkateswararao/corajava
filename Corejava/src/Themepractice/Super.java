package Themepractice;
class Parent{
	Parent(int age){
		System.out.println("parent age is "+age);
	}
	
}
class Child extends Parent{
	Child(int age){
		super(33);
		System.out.println("Child age is "+age);
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child C=new Child( 10);
       
	}

}
