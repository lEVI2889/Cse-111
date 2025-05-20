//Task 1
public class Student {
    String name;
    String prog;
    public Student(String a, String b){
        name = a;
        prog = b;
    }
    public void updateName(String c){
        name = c;
    }
    public void updateProgram(String d){
        prog = d;
    }
    public String accessProgram(){
        return prog;
    }
}
