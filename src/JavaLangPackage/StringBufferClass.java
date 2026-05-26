package JavaLangPackage;

public class StringBufferClass {

public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("KALYANI SAJANPAWAR");
	
//	System.out.println(sb.capacity());	
//	System.out.println(sb.length());
//	System.out.println(sb.delete(1, 3));
//	System.out.println(sb.charAt(2));
	
//	sb.setCharAt(2,'Z');
//	System.out.println(sb);
//	
//	sb.replace(2, 3, "C");
//	System.out.println(sb);
//	
//	System.out.println(sb.capacity());
//	sb.trimToSize();
//	System.out.println(sb);
//	System.out.println(sb.capacity());
//	
//	//setting the capacity
//	sb.ensureCapacity(1000);
//	System.out.println(sb);
//	System.out.println(sb.capacity());
	
	sb.append(11).insert(2, 'Q').delete(0, 1).reverse();
	System.out.println(sb);
	
	
	
	}
}
