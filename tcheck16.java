import java.util.*;
public class tcheck16 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
	int side2 = sc.nextInt();
	int side3 = sc.nextInt();
   
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
