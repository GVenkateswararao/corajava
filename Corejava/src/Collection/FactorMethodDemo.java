package Collection;

class Car{
	void start() {
		System.out.println("Start with the key");
	}
	
	void cost() {
		System.out.println("No cost ");
	}
		void millage() {
			System.out.println("No millage");
		}
}
			class Audi extends Car{
				void start() {
					System.out.println("Start with the key");
				}
				void cost() {
					System.out.println("Audi cast is-- $01lakhs");
				}
				void millage() {
					System.out.println("audi milage is---10km");
				}
			}
		
			class Bmw extends Audi{
				void start() {
					System.out.println("Start with the key");
				}
				void cost() {
					System.out.println("Bmw cost is ---$40lakhs");
				}
				void millage() {
					System.out.println("Bmw millage is--15km");
				}
			}
class CarFactory{
	Car getCar(String carName) {
		if(carName.equals("Audi"))
		return new Audi();
		else if(carName.equals("Bmw"))
		return new Bmw();
		else
	    return null;
		
	}
}
public class FactorMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CarFactory cf=new CarFactory();
         Car x=cf.getCar("Bmw");
         x.start();
         x.cost();
         x.millage();
	}

}
