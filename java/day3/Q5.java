//5)Eliminate duplicate elements from an array.


class Q5{
	static boolean find(int a,int n[]){
		for(int i:n){
			if (i==a){return true;}
		}
	return false;
	}
public static void main(String[] args){
int a[] = {1,1,1,1,2,2,2,2,3,3,3,3};
int b[] = new int[a.length];
int dc=0;
for(int i=0;i<a.length;i++){
	if (!find(a[i],b)){b[dc++]=a[i];} 
}
for(int i=0;i<dc;i++){System.out.print(b[i]+" ");}
}

}