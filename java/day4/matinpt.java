import java.util.Scanner;

public class matinpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m:");
        int m=sc.nextInt();
        System.out.print("Enter n:");
        int n= sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                System.out.printf("Enter a[%d][%d]:", i, j);
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n\n");
        for(int[] i:a){
            for(int j:i){
                System.out.printf("%2d ",j);
            }
            System.out.println();
        }
    }
}
