//q5)add 2 complex numbers
import java.util.*;
class Q5{
	static void add(String a,String b){
		int l1=a.length();
		int l2=b.length();
		int s1=0,s2=0;
		for(int i=0;i<l1;i++){
			if (a.charAt(i)=='+' && a.charAt(i+1)=='i'){
				s1=i;
				break;	
			}	
		}
		for(int i=0;i<l2;i++){
			if (a.charAt(i)=='+' && a.charAt(i+1)=='i'){
				s2=i;
				break;	
			}	
		}
int n1 = Integer.parseInt(a.substring(0, s1));
int n2 = Integer.parseInt(a.substring(s1 + 2, l1));
int n3 = Integer.parseInt(a.substring(0, s2));
int n4 = Integer.parseInt(a.substring(s2 + 2, l1));

		System.out.println((n1+n3)+"+i"+(n2+n4));
	
	}
		
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	String a = sc.nextLine();
	System.out.print("Enter b:");
	String b = sc.nextLine();
	add(a.trim(),b.trim());

	}

}