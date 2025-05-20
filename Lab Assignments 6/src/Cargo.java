public class Cargo {
    static int cargo_num = 0;
    int id = 1;
    double weight;
    String items;
    boolean load_stat = false;
    static double capacity = 10.0;
    public Cargo(String a, double w){
        id = ++cargo_num;
        weight= w;
        items = a;
    }
    static double capacity(){
        return capacity;
    }
    public void details(){
        System.out.println("Cargo ID: "+id +", " +"Contents: "+ items+", "+"Weight: "+weight+","+" Loaded: "+ load_stat);
    }
    public void load(){
        double temp_cap = capacity;
        temp_cap-=weight;
        if(temp_cap>0){
            load_stat = true;
            capacity=capacity-weight;
            capacity = Math.round(capacity*100.0)/100.0;
            System.out.println("Cargo " + id + " loaded for transport");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    public void unload(){
        load_stat = false;
        System.out.println("Cargo "+id+" unloaded.");
        capacity+=weight;
    }
}
