public class matadd {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},
                     {4,5,6},
                     {8,9,7}};
        int b[][] = {{1,2,3},
                {4,5,6},
                {8,9,7}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int[] i:a){
            for(int j:i){
                System.out.printf("%2d ",j);
            }System.out.println();
        }


    }
}
