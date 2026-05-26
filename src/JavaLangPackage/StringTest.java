package JavaLangPackage;

public class StringTest {
 public static void main(String[] args) {
	String s1 = new String ("Kalyani");
	String s2 = new String ("Kalyani");
	String s3 = "KALYANI";
	String s4 = "KALYANI";
	System.out.println(s2.equals(s1)); 	//content comparison
	System.out.println(s1 == s2);	 //reference comparison // Same literal, same memory reference
	System.out.println(s3 == s4);	// Same literal, same memory reference

}
}
