//4)Find how many times a particular element appears in an array.
import java.util.*;
class Q4{
public static void main(String[] args){
int a[] = {1,1,1,2,3,3,3,2,2,2,3,3,3,4,4,4,4};
for(int i:a){
System.out.print(i+" ");
}
Scanner sc = new Scanner(System.in);
System.out.print("\nSelect a number to find how many times it is repeated:");
int n = sc.nextInt();
int c=0;
for(int i:a){
	if (i==n){c++;}
}
System.out.println("The number is repeated "+c+" times");


}

}