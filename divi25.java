
import java.util.*;

class divi25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 5 subjects: ");
        int subject1 = sc.nextInt();
	int subject2 = sc.nextInt(); 
	int subject3 = sc.nextInt();
	int subject4 = sc.nextInt();
	int subject5 = sc.nextInt();
        int total = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = total / 5.0;
        if (percentage >= 60) {
            System.out.println("First division");
        } else if (percentage >= 50) {
            System.out.println("Second division");
        } else if (percentage >= 40) {
            System.out.println("Third division");
        } else {
            System.out.println("Fail");
        }
    }
}
