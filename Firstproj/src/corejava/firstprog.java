package corejava;

public class firstprog {
	int yearofpurchase;
	String make;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("yearofpurchase"+2001);
		System.out.println("make"+"suzuki");
		
	}
	public void display2()
	{
		System.out.println("model"+1999);
		System.out.println("cost"+20000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstprog ob1=new firstprog();
				ob1.display1();
				ob1.display2();

	}

}
