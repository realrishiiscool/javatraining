//q1)given integer number is postive or negative
import java.util.*;
class Q1{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	int a = sc.nextInt();
	System.out.println(a+" is " + ((a>0)?"positive":(a<0)?"negative":"netral"));
			}

}