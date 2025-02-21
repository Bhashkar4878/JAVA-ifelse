
import java.util.*;

class aval31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int absoluteValue;
		if (num < 0) {
   			 absoluteValue = -num;
		} else {
 			   absoluteValue = num;
		}

        System.out.println("The absolute value is: " + absoluteValue);
    }
}
