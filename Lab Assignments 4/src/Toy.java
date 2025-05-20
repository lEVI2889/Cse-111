//Task 2
public class Toy {
    String name;
    int price;
    public Toy(String a, int n){
        name = a;
        price = n;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int n){
        price = n;
    }
    public void updateName(String b){
        System.out.println("Changing old name: "+ name);
        name = b;
        System.out.println("new name: "+ name);
    }
    public void showPrice(){
        System.out.println("price: "+ price+ " Taka");
    }
}
