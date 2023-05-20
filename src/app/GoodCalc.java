package app;
import lib.Calculator;
import lib.Show;

public class GoodCalc extends Calculator{

	
	public static void main(String[] args) {
		new Show();
		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum=0;
		for(int i: a)
			sum += i;
		return sum/a.length;
	}
}
