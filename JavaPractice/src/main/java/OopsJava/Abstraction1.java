package OopsJava;
class Addition extends Abstraction{
	void calculator(int x, int y) {
		System.out.println(x+y);
	}
}
class Sub extends Abstraction{
	void calculator(int x, int y) {
		System.out.println(x-y);
	}
}
class Mul extends Abstraction{
	void calculator(int x, int y) {
		System.out.println(x*y);
	}
}
public class Abstraction1 {
	
public static void main(String[] args) {
	Abstraction abs;
	abs = new Sub();
	abs.calculator(3, 2);
	abs = new Addition();
	abs.calculator(3, 2);
	abs = new Mul();
	abs.calculator(3, 2);
}



}
