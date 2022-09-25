package NormalPractice;
class Car{
	void cost() {
		System.out.println("No cost ");
	}
		void millage() {
			System.out.println("No millage");
		}
}
			class Audi extends Car{
				void cost() {
					System.out.println("Audi cast is-- $01lakhs");
				}
				void millage() {
					System.out.println("audi milage is---10km");
				}
			}
		
			class Bmw extends Audi{
				void cost() {
					System.out.println("Bmw cost is ---$40lakhs");
				}
				void millage() {
					System.out.println("Bmw millage is--15km");
				}
			}
				

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car C=new Car();
         C.cost();
         C.millage();
         C=new Audi();
         C.cost();
         C.millage();
         C=new Bmw();
         C.cost();
         C.millage();
	}

}
