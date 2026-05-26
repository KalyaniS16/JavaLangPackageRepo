package JavaLangPackage;

public class WrapperClass {
public static void main(String[] args) {
	Float f = new Float(2);
	System.out.println("Float:-" +f);
	
	Boolean b = new Boolean("KALYANI");
	System.out.println(b);
	
	Byte by6 = new Byte((byte) 45);
	System.out.println(by6);
	
	Byte by = new Byte("45");
	System.out.println(by);
	
	Short sh = new Short("00");
	System.out.println(sh);
	
	Double d = new Double("44");
	System.out.println(d);
	
	Character ch = new Character('7');
	System.out.println(ch);
	
	System.out.println("****Printing With valueOf()*****");
	//converting Primitive/String into wrapper object	
	
	Integer i = Integer.valueOf(3);
	System.out.println(i);
	
	String str = String.valueOf(10);
	System.out.println(str);
	
	Boolean bb = Boolean.valueOf(false);
	System.out.println(bb);
	
	Long l = Long.valueOf(3);
	System.out.println(l);
	
	Integer inti = Integer.valueOf("111",2);  //0^2+
	System.out.println(inti);  
	
	Character cha = Character.valueOf('y');
	System.out.println(cha);
	
	System.out.println("****Printing With xxxvalue()*****");	
	//converting wrapperobj into Primitive/String
	
	Boolean bo = Boolean.valueOf("UU");
	System.out.println(bo);  //It is in wrapper object
	
	boolean b1 = bo.booleanValue();
	System.out.println(b1); //it is in premitive
	
	Integer it = new Integer(130);
	System.out.println(it.byteValue());  //will convert into byte max value
	System.out.println(it.shortValue());
	System.out.println(it.doubleValue());
	System.out.println(it.longValue());
	System.out.println(it.intValue());
	System.out.println(it.floatValue());
	
	System.out.println("****Printing With parseInt()*****");
	//converting wrapper into primitive
	
	int in = Integer.parseInt("44");
	System.out.println(in);
	
	int in2 = Integer.parseInt("111",2);
	System.out.println(in2);  
	
	boolean boo = Boolean.parseBoolean("true");
	System.out.println(boo);
	
	double dd = Double.parseDouble("45");
	System.out.println(dd);
	
	
	System.out.println("****Printing With toString()*****");
	//converting 
	
	String i3 = Integer.toString(10);
	System.out.println(i3);
	
	String lg = Long.toString(100);
	System.out.println(lg);
	
//	String sh = Short.toString((short)120);
//	System.out.println(sh);
	
	String by1 = Byte.toString((byte)200);
	System.out.println(by1);
	
	Integer inti1 = 10;
	System.out.println(inti1);
	
}
}
