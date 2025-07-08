//q8)find lcm of 2 numbers
import java.util.*;
class Q8{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a:");
	int a = sc.nextInt();
	System.out.print("Enter b:");
	int b = sc.nextInt();
	for(int i=1;i<=b;i++){
		if ((a*i)%b==0){
			System.out.println("lcm:"+(a*i));
			break;
		}
	}
			
	}

}