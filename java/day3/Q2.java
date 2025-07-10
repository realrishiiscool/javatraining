//2)Determine the largest and smallest element within an array.
class Q2 {

	public static void main(String[] args){
	int a[] = {1,234,12,43,123,12,345};
	int small=a[0],big=a[0];
	for(int i:a){
		if (small >= i){small=i;}
		if (big <= i){big=i;}
	}
	System.out.println("biggest :"+big+" smallest:"+small);

}

}