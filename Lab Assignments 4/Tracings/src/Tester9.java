public class Tester9 {
    public static void main(String args []){
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(1, 2);
        b2.methodB(3, 2);
    }
}
