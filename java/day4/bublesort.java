public class bublesort {
    public static void main(String[] args) {
        int a[] = {12,31,123,41,345,12};
        int n = a.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if (a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
