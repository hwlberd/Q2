
public class Q2 {

public static void main(String[] args) {
		String s1 = "Welcome to Java after Python"; 
		String s2 = s1; 
		String s3 = new String("Welcome to Java after Python"); 
		String s4 = " Welcome to Java after Python"; 

		if(s1==s2) {
			System.out.println("s1==s2 ==> true");
		}
		else {
			System.out.println("s1==s2 ==> false");
		}
		
		
		if(s2==s3) {
			System.out.println("s2==s3 ==> true");
		}else {
			System.out.println("s2==s3 ==> false");
		}
		
		
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2) ==> true");
		}else {
			System.out.println("s1.equals(s2) ==> false");
		}
		
		
		if(s2.equals(s3)) {
			System.out.println("s2.equals(s3) ==> true");
		}else {
			System.out.println("s2.equals(s3) ==> false");
		}
		
		
		if(s1.compareTo(s2)==0) {
			System.out.println("s1.compareTo(s2) ==> true");
		}else {
			System.out.println("s1.compareTo(s2) ==> false");
		}
		
		
		if(s2.compareTo(s3)==0) {
			System.out.println("s2.compareTo(s3) ==> true");
		}else {
			System.out.println("s2.compareTo(s3) ==> false");
		}
		
		if(s1==s4) {
			System.out.println("s1==s4 ==> true");
		}else {
			System.out.println("s1==s4 ==> false");
		}
		
		System.out.println("First char in s1 ==>" +s1.charAt(0));
		
		System.out.println("Index of 'j' in s1 ==>" +s1.indexOf("J"));
		
		System.out.println("Index of 'to' in s1 ==>" +s1.indexOf("to"));
		
		System.out.println("Last index of 'a' in s1 ==>" +s1.lastIndexOf("a"));
		
		System.out.println("Last index of 'o' in s1 ==>" +s1.lastIndexOf("o",15));
		
		System.out.println("Length of s1 is ==>" +s1.length());
		
		System.out.println("Trimed s1 after index 5 is ==>" +s1.substring(5));
		
		System.out.println("Trimed s1 from index 5 to index 11 is ==>" +s1.substring(5,11));
		
		System.out.println("s1.startsWith(\"Wel\") ==>" +s1.startsWith("Wel"));
		
		System.out.println("Last Word in s1 ==>" +s1.substring(s1.lastIndexOf(" ")+1));
}
	}
		
