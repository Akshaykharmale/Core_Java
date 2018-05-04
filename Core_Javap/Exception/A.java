package day25_cj_exception;

public class A {
	int a = 10, b = 0, c, d = 6, e;

	void m() {

		c = a / b;
		System.out.println("hii");
		e = d / b;
	}

	void n() {
		try {
			m();
		} catch (Exception e) {
			System.out.println(e + "hii");
			System.out.println("hey");
			System.out.println("hello");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		A obj = new A();
		//obj.m();
		System.out.println("a");
		obj.n();
	}

}

