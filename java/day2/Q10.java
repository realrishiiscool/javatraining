//number of digits in a number
import java.util.Scanner;
public class Q10 {
    static boolean isNumeric(String n){
            for (char i : n.toCharArray()) {
            if (!Character.isDigit(i)) {
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
        
        String n;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Enter n:");
        n = sc.nextLine().trim();
        }
        while(!isNumeric(n));
        System.out.println("no.of digits:"+n.length());
    }
}
