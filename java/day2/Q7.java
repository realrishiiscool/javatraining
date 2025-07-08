//check wehter a given number is prime
import java.util.*;
class Q7{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter n:");
	int n=sc.nextInt();
	int flag=1;
	for(int i=2;i<n;i++){
		if (n%i==0){flag=0;}
	}
	System.out.print(n);
	if (flag==1){System.out.println(" is prime");}
	else {System.out.println(" is not prime");}
	}

}