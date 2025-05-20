//Task 5
public class Course {
    public String coursename;
    public String coursecode;
    public int credit;
    public void updateDetails(String coursename, String coursecode, int credit){
        this.coursename = coursename;
        this.coursecode = coursecode;
        this.credit = credit;
    }
    public void displayCourse(){
        System.out.println("Course Name: "+coursename);
        System.out.println("Course Code: "+coursecode);
        System.out.println("Course Credit: "+credit);
    }
}
