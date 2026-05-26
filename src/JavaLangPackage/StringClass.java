package JavaLangPackage;

public class StringClass {
	
public static void main(String[] args) {
	String str = new String("Kalyani");	System.out.println(str);	
	System.out.println(str.concat("Sajanpawar"));
	
	String str2 = new String("Kalyani");
	System.out.println(str == str2);  // false (different objects in memory)
	System.out.println(str.equals(str2)); // true (compares content)
	
	StringBuffer sb = new StringBuffer("Prashant");
	StringBuffer sb2 = new StringBuffer("Prashant");
	System.out.println(sb == sb2);
	System.out.println(sb.equals(sb2)); //does reference comparison
	
	String str3 = new String("Aditya");
	StringBuffer str4 = new StringBuffer("Aditya");
	System.out.println(str3.equals(str4));
//	System.out.println(str3==str4);
	;
//	for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			System.out.print(i);			
//		}
//		System.out.println();
//	}
//	int count = 1;
//	for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			System.out.print(count);
//			count++;
//		}
//		System.out.println();
//	}
}
	
	
}
