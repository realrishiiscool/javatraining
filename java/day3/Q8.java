//8)Creating a new array and copying all elements from one array to another.
class Q8{
public static void main(String[] args){

int a[] = {1,2,3,4,5};
System.out.println("A array:");
int b[] = new int[a.length];
int j=0;
for(int i:a){
	System.out.print(i+" ");b[j++]=i;
}
System.out.println("\nB array:");
for(int i:b){
	System.out.print(i+" ");
}

}

}