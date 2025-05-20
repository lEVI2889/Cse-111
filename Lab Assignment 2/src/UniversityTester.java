//Task 1
public class UniversityTester {
    public static void main(String[] args){
        University s1 = new University();
        University s2 = new University();
        //a
        System.out.println(s1);
        System.out.println(s2);
        //b
        s1.name = "Imperial College London";
        s1.country = "England";
        s2.name = "Brac University";
        s2.country = "Bangladesh";
        System.out.println(s1.name);
        System.out.println(s1.country);
        System.out.println(s2.name);
        System.out.println(s2.country);
    }
}
