//use switch case to assing a number to week
import java.util.*;
class Q3{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a=0;
	do {
	System.out.println("Enter value btw 1-7");
	System.out.print("Enter a:");
	a = sc.nextInt();
	}
	while(a<=1 || a>=7);
	switch(a){
	case 1:System.out.println("Monday");break;
	case 2:System.out.println("Tuesday");break;
	case 3:System.out.println("WEd");break;
	case 4:System.out.println("Thu");break;
	case 5:System.out.println("Fri");break;
	case 6:System.out.println("Sat");break;
	case 7:System.out.println("Sun");break;
			}
	}

}