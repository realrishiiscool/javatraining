//cheack weather a given string is palindrome
import java.util.*;
class Q8{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter String:");
	String s = sc.nextLine().trim();
	String ss = new StringBuilder(s).reverse().toString();
	System.out.println(s + " is " + ((s.equals(ss))?"palindrome":"not palindrome"));
	}
}