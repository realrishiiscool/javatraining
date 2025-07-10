//6)Identify the second largest or smallest distinct element in an array.
class Q6{

	public static void main(String[] args){
	int a[] = {1,234,12,43,123,12,345};
	int l=a.length;
	for(int i=0;i<l;i++){
		for(int j=0;j<l-1;j++){
			if (a[j]>a[j+1]){
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}	
	}
	//for(int i:a){System.out.print(" "+i);}
	System.out.println("the second smalles is "+a[1]+" and second biggest is "+a[l-2]);

}

}