////q6)check even or odd integer
import java.util.*;
class Q6{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	int a = sc.nextInt();
	System.out.println(a+" is " + ((a%2==0)?"even":"odd"));
			}

}