import java.util.Scanner;
public class Student {
    public String name;
    public int age;
    
    public Student(){
        this.name = "Anirudh";
        this.age = 19;
    }

    public Student(String name,  int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age:  "+ age);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Enter Student's Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student's Age: ");
        int age = sc.nextInt();

        Student s2 = new Student(name, age);

        System.out.println("Student 1: ");
        s1.display();

        System.out.println("Student 2: ");
        s2.display();

    sc.close();
    }
}
