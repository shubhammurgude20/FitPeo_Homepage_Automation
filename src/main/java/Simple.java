
public class Simple {

	static int myMethod(int x, int y) {
		return x+ y;
	}
	static double myMethod(double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		int myNum1 = myMethod(4,5);
		double myNum2 = myMethod(4.5,5.6);
		System.out.println("int:" + myNum1);
		System.out.println("double:" + myNum2);
		
	}
}