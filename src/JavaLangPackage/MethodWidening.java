package JavaLangPackage;

public class MethodWidening {
public static void main(String[] args) {
	Integer in = new Integer(10);
	System.out.println(in);
	
	Integer i = Integer.valueOf("10");
	System.out.println(i);      //valueof
	
	String str1 = String.valueOf("kk");
	System.out.println(str1);  //
	
	int i1 = Integer.parseInt("12");
	System.out.println(i1);    //intvalue  parseInt
	
	Integer in2 = new Integer("20");
	System.out.println(in2.toString());  //tostring
	
	int num = in.intValue();
	System.out.println(num);  //wrapper to premitive
	
	
	
	
}
}
