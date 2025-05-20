//Task 4
public class Student {
    int id;
    double cg;
    String course[] = new String[4];
    int course_num= 0;
    String new_course;
    boolean cg_set= false;
    boolean set_to_null=false;

    public Student(int n){
        id = n;
        System.out.println("A student with ID "+n+" has been created.");
    }
    public Student(int n2, double n3){
        id = n2;
        cg = n3;
        System.out.println("A student with ID "+n2+" and cgpa "+n3+" has been created.");
    }
    public void addCourse(String a){
        //new_course = a;
        if(cg_set){
            if(cg<3.00&&course_num<3) {
                course[course_num++] = a;
            }
            else{
                System.out.println("Failed to add "+ a);
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
        }
        else{
            System.out.println("Failed to add "+ a);
            System.out.println("Set CG first");
        }
        if(set_to_null){
            set_to_null= false;
        }
    }
    public void storeCG(double n1){
        cg=n1;
        cg_set= true;
    }
    public void showAdvisee(){
        System.out.println("Student ID: "+ id+ ", CGPA: "+ cg);
        if(!set_to_null){
            System.out.println("Added Courses are: ");
            if(course.length>4){
                for (int i = 0; i < course.length-1; i++) {
                    if (course[i] != null) {
                        System.out.print(course[i] + " ");
                    }
                }
            }
            else{
                for (int i = 0; i < course.length; i++) {
                    if (course[i] != null) {
                        System.out.print(course[i] + " ");
                    }
                }
            }
            System.out.println();
        }
        else{
            System.out.println("No courses added.");
        }
    }
    public void removeAllCourse(){
        for(int i = 0; i<course.length; i++){
            course[i]=null;
        }
        set_to_null=true;
    }
    public void storeID(int n){
        id = n;
    }
    public void addCourse(String[] a){
        course = a;
        course_num= course.length;
        if(set_to_null){
            set_to_null= false;
        }
        if(course_num>=4){
            System.out.println("Failed to add "+ course[course.length-1]);
            System.out.println("Maximum 4 courses allowed.");
        }
    }
}
