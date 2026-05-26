package JavaLangPackage;

public class AutoUnboxing {
public static void main(String[] args) {
//	Integer i = null;
//	int num = i;
//	System.out.println(i);
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	System.out.println(i1==i2);
	
	Integer i3 = new Integer(10);
	Integer i4 = new Integer(30);
	System.out.println(i3==i4);
	
	Integer i5 = new Integer(10);
	Integer i6 = 20;
	System.out.println(i5==i6);
	
	Integer i7 = new Integer(10);
	Integer i8 = i7;
	System.out.println(i7==i8);
	
	Integer i9 = 10;
	Integer i10 = 30;
	System.out.println(i9==i10);
}
}
