//9)Combine elements from two separate arrays into a single new array.
class Q9{
public static void main(String[] args){
int a[] = {1,2,3,4};
int b[] = {6,7,8,9};
int c[] = new int[a.length+b.length];
int j=0;
for(int i:a){c[j++]=i;}
for(int i:b){c[j++]=i;}

for(int i:c){System.out.print(i+" ");}

}


}