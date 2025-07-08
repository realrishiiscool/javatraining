//q4)swap 2 numbers
import java.util.*;
class Q4{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a,b;
	System.out.print("Enter a:");
	a = sc.nextInt();
	System.out.print("Enter b:");
	b = sc.nextInt();
	System.out.println("a:"+a+"  b:"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a:"+a+"  b:"+b);
		}

}