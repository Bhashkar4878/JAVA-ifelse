import java.util.*;
class grade19 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
	int chemistry = sc.nextInt();
	int biology = sc.nextInt();
	int math = sc.nextInt();
	int computer = sc.nextInt();
        int total = physics + chemistry + biology + math + computer;
        double percentage = (total / 5.0);
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);
    }
}
