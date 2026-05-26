package JavaLangPackage;

public class CloneInterface implements Cloneable{

	int i =10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneInterface ci = new CloneInterface();
		CloneInterface ci2 = (CloneInterface)ci.clone();
		
		ci.i = 666;
		ci.j = 444;
		System.out.println(ci2.i + "___" + ci2.j);
	}
	
}
