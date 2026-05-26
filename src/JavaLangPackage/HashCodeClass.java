package JavaLangPackage;

public class HashCodeClass {
public static void main(String[] args) {
	HashCodeClass hc = new HashCodeClass();
	System.out.println(hc.hashCode());
	
	HashCodeClass hc1 = new HashCodeClass();
	System.out.println(hc1.hashCode());
	
	HashCodeClass hc2 = new HashCodeClass();
	System.out.println(hc2.hashCode());
	
	HashCodeClass hc3 = new HashCodeClass();
	System.out.println(hc3.hashCode());
	
	HashCodeClass hc4 = new HashCodeClass();
	System.out.println(hc4.hashCode());
}

//public int hashcode() {
//	return 100;
//}

}