//Task 7
public class BracuStudent {
    String name;
    String address;
    boolean got_pass= false;
    public BracuStudent(String a, String b){
        name = a;
        address = b;
    }
    public void showDetails(){
        System.out.println("Student name: "+ name);
        System.out.println("Lives in "+ address);
        if(got_pass){
            System.out.println("Have Bus Pass? true");
        }
        else{
            System.out.println("Have Bus Pass? false");
        }
    }
    public void getPass(){
        got_pass = true;
    }
    public void updateHome(String a){
        address = a;
    }

}
