package Themepractice;
class BusTranspotation{
	String passengername;
	int seatno;
	String busno;
	double amount;
	float starttime;
	static String routename;
}
class TrainTranspotation{
	String passengername;
	int seatno;
	String trainno;
	double amount;
	float starttime;
	static String routename;
}
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BusTranspotation bus=new BusTranspotation();
        bus.passengername="venkat";
        bus.seatno=1283;
        bus.busno="TSO45659";
        bus.amount=2000;
        bus.starttime=10.30f;
        bus.routename="Hydrbad";
        System.out.println(bus.passengername);
        System.out.println(bus.seatno);
        System.out.println(bus.busno);
        System.out.println(bus.amount);
        System.out.println(bus.starttime);
        System.out.println(bus.routename);
        
        TrainTranspotation train=new TrainTranspotation();
        train.passengername="venkat";
        train.seatno=1283;
        train.trainno="TSO45659";
        train.amount=2000;
        train.starttime=10.30f;
        train.routename="Hydrbad";
        System.out.println(train.passengername);
        System.out.println(train.seatno);
        System.out.println(train.trainno);
        System.out.println(train.amount);
        System.out.println(train.starttime);
        System.out.println(train.routename);
	}

}
