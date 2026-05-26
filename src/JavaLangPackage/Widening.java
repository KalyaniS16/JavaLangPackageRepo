package JavaLangPackage;

public class Widening {
	
	public static void m1(long x) {  //widening
		System.out.println("first method");
	}
	
	public static void m1(Integer x) {  //autoboxing
		System.out.println("second method");
	}
	
	public static void m1(int... x) {  //vararg having least priority
		System.out.println("third method");
	}
	
public static void main(String[] args) {
	int x = 10;
	m1(x);
	
}
}
