//7)print all the even numbers from the array taken from the user through Scanner class.
import java.util.*;
class Q7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Eneter size of array:");
int l=sc.nextInt();

int a[] = new int[l];

System.out.print("\nEneter numbers");
for(int i=0;i<l;i++){
System.out.print(":");
a[i] = sc.nextInt();
}
System.out.println("In the given array the even numbers are:");
for(int i:a){
if (i%2==0){System.out.print(i+" ");}
}

}

}