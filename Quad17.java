import java.util.*;
class Quad17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Roots are real and different");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Roots are complex");
        }
    }
}
