package JavaLangPackage;

public class Student11 {
	
	int a;
	
	public Student11(int a) {
		this.a = a;
	}
	
public static void main(String[] args) {
	Student11 st = new Student11(10);
	Student11 st2 = new Student11(10);
	
	System.out.println(st.equals(st2));
	System.out.println(st == st2);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student11 other = (Student11) obj;
	return a == other.a;
}
}
