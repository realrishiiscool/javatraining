//q10)check leap year
import java.util.*;
class Q10{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter year:");
	int a = sc.nextInt();
	System.out.println(a+" is " + ((a%4==0 && a%100!=0 || a%400==0)?"leap year":"NOt leap year"));
			}

}