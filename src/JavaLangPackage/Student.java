package JavaLangPackage;

public class Student {
	String name;
	Integer rollNo;

	Student(String name,Integer rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
public static void main(String[] args) {
	Student st1 = new Student("Kalyani", 22);	
	Student st2 = new Student("Prashant", 11);
	System.out.println(st1.equals(st2));
	
	Student st3 = st1;  //.equals does content comparison
	System.out.println(st3.equals(st1));	
	System.out.println(st3==st1);
	
	System.out.println(st2 == st1);	
}


}






