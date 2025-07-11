import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        boolean flag = false;
        int a[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find:");
        int n = sc.nextInt();
        int l=0;
        int r=a.length-1;
        while(l<r){
            int m=(l+r)/2;
            if (a[m]==n){System.out.print("element found:"+m);flag=true;break;}
            else if (a[m]>n){l=m+1;}
            else {r=m-1;}
        }
        if(!flag){System.out.println("NOt foound");}
    }
}
