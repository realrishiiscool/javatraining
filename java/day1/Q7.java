//q7)find the largest amoung 3 numbers
import java.util.*;
class Q7{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	int a = sc.nextInt();
	System.out.print("Enter b:");
	int b = sc.nextInt();
	System.out.print("Enter c:");
	int c = sc.nextInt();
	System.out.println(Math.max(a,Math.max(b,c)));
			}

}