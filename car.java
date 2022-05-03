package week1.day2;

public class car 
{
	//state or field 
	int gear =5;
	//behavior or method 
	public void braking() {
		System.out.println("working for braking");
	}
class ac {
	//stores the value for ac
	//true if ac is on 
	//false if ac is off
	boolean ison;
	//metho to turnoff the ac
	void turnoff() {
		ison = false;
		System.out.println("ac on? " + ison);
	}
}

	public static void main(String[] args) {
		//create objects cooling
		car cooling =new car();
		
		//turn on the ac by 
		//calling method turnon()
		cooling.turnoff();
	}

	private void turnoff() {
		// TODO Auto-generated method stub
		
	}
}

	
