//Task 8
public class Usis {
    String[] student;
    String[] courses;
    int total_advise, stu_num, id;
    String dept;
    boolean logged_in;
    boolean advised;
    public Usis(){
        logged_in = false;
        advised = false;
        total_advise=0;
        //course = 0;
        student = new String[2];
        courses = new String[3];
        System.out.println("Usis is ready to use!");
    }
    public void login(Student a){
        if(a.email.equals("null")&&a.password.equals("null")){
            System.out.println("Email and password need to be set.");
        }
        else{
            System.out.println("Login successful");
            logged_in=true;
        }
    }
    public void advising(Student a){
        if(logged_in){
            if(total_advise==0){
                System.out.println("You haven't selected any courses.");
            }
        }
        else{
            System.out.println("Please login to advise courses!");
        }
    }
    public void advising(Student a, String b, String c, String d, String e){
        System.out.println("You need special approval to take more than 3 courses.");
    }
    public void advising(Student a, String b, String c, String d){
        advised = true;
        System.out.println("Advising successful!");
        student[stu_num++]= a.name;
        id = a.id;
        dept = a.dept;
        courses[0]= b;
        courses[1]= c;
        courses[2]= d;
        total_advise++;
    }
    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+ total_advise);
        for(int i = 0; i<student.length; i++){
            if(student[i]!=null){
                System.out.println("Name: "+student[i]+" ID: "+ id );
                System.out.println("Department: "+dept);
                System.out.println("Advised Courses:");
                for (int j = 0; j < courses.length; j++){
                    System.out.print(courses[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
