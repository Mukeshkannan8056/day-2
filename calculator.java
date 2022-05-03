package week1.day2;

public class calculator {
	public int add(int a,int b) {
		int total=a+b;
		//system.out.println(total);
		return total;
	}
	public void sub(int totalvalues) {
		int d = 50;
		int z=totalvalues-d;
		System.out.println(z);
	}

	public static void main(String[] args) {
		calculator cal=new calculator();
		int totalvalues =cal.add(100, 100);
		System.out.println(totalvalues);
		cal.sub(totalvalues);
	}
}