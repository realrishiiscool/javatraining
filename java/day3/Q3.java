//3)Reverse the order of elements in an array.
class Q3{
public static void main(String[] args){

int a[] = {1,2,3,4,5};
int l = a.length/2;
int b=a.length-1;
for(int i=0;i<l;i++){
int t=a[i];
a[i]=a[b];
a[b--]=t;
}
for(int i:a){
System.out.print(i+" ");	
}
}

}