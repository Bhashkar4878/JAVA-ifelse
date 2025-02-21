import java.util.*;
class enum36 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("All numbers are not equal");
        }
    }
}
