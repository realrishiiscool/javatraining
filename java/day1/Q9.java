//q9)DIsplay all prime number 1 - 100
class Q9{
	static boolean prime(int n){
		for(int i=2;i<(n/2)+1;i++){
			if (n%i==0){return false;}
		}
		return true;
	}
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if (prime(i)){System.out.print(i+" ");}
		}			
	}

}