package JavaLangPackage;

import java.util.Scanner;

public class StringForMakingFirstLetterCapitalOfYourName {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String input = sc.nextLine();
		
	String output = input.toUpperCase();
	System.out.println(output);
	
	String output1 = input.substring(2, 6).toUpperCase();
	System.out.println(output1);
	
	String output2 = input.substring(0, 1).toUpperCase()+ input.substring(3);
	System.out.println(output2);
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



