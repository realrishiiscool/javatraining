import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find:");
        int n = sc.nextInt();
        int j=0;
        for(int i:a){
            if(i==n){System.out.println("Element found at :"+j);flag=true;}
                j++;
        }
        if(!flag){System.out.println("NOt foound");}
    }
}
