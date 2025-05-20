public class Dog extends Animal {
    String breed;
    public Dog(String a, int n, String c, String b){
        super(a, n, c);
        breed = b;
    }
    public String info(){
        System.out.print(super.info());
        return "Breed: "+ breed;
    }

    @Override
    public void makeSound() {
        System.out.println(color+" color "+name+" is barking");
    }
}
