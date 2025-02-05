import java.util.Scanner;

public class University {

    static String universityName = "UPES";

    String studentName;

    public University(String name){
        studentName = name;
    }

    public static void displayUniname(){
        System.out.println("University: "+ universityName);
    }

    public void studentName(){
        System.out.println("Student Name: "+ studentName);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + studentName);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        University.displayUniname();

        University[] students = new University[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student's name: ");
            String name = sc.nextLine();
            students[i] = new University(name);
        }

        System.out.println("\nList of Students:");
        for (int i = 0; i < n; i++) {
            students[i].displayStudentName();
        }
    sc.close();
    }
}
