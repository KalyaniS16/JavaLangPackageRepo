package JavaLangPackage;

public class STringMethodsUse {
public static void main(String[] args) {
	String str = "KALYANI";
	
	System.out.println(str.length());
	System.out.println(str.charAt(2));
	System.out.println(str.concat("SAJANPAWAR"));
	System.out.println(str.substring(3));
	System.out.println(str.equals("PRASHANT"));
	System.out.println(str.equals("KALYANI"));
	System.out.println(str.equals("kalyani"));
	System.out.println("endsWith A:- "+ str.endsWith("A"));
	System.out.println("startsWith A:- " +str.startsWith("A", 1));
//	System.out.println(str.split(str));
	
	System.out.println(str.contains("A"));
	System.out.println(str.replace("N", "Q"));
	System.out.println(str.replaceAll("KALYANI", "PRASHANT"));
	System.out.println(str.hashCode());
	System.out.println(str.CASE_INSENSITIVE_ORDER);
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
}
}
