public class Course_reg {
    private String coursename;
    private String coursecode;

    public Course_reg(String coursename, String coursecode){
        this.coursename = coursename;
        this.coursecode = coursecode;
    }

    public void displayCourse(){
        System.out.println("Course Name: "+ this.coursename);
        System.out.println("Course Code: "+ this.coursecode);
    }

    public static void main(String[] args){
        Course_reg course1 = new Course_reg("Introduction to Java.", "CSE1201");

        course1.displayCourse();
    }
}
