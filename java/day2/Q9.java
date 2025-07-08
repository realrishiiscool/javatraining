//reverse of a number
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int o=n;
        int rr=0;
        while(n>0){
            int r=n%10;
            rr = (rr*10)+r;
            n=n/10;
        }
        System.out.println(rr);
    }
}
