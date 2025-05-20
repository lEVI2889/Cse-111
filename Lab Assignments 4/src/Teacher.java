//Task6
public class Teacher {
    String name;
    String ini;
    String[] courses = new String[3];
    int course_count;
    public Teacher(String a, String b){
        name = a;
        ini = b;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course a){
        if(course_count<3){
            courses[course_count++] = a.course;
        }
    }
    public void printDetail(){
        System.out.println("Name: "+ name);
        System.out.println("Initial: "+ ini);
        System.out.println("List of course: ");
        for(int i = 0; i< courses.length; i++){
            if(courses[i]!=null){
                System.out.println(courses[i]);
            }
        }
    }
}

