//Task 7
public class BracuBus {
    String location;
    int passenger_count;
    int max_capacity = 2;
    //boolean on_bus = false;
    String [] passenger;
    //boolean got_pass= false;
    public BracuBus(String a) {
        location = a;
        max_capacity =2;
        passenger = new String [max_capacity];
        passenger_count= 0;
    }

    public BracuBus(String a, int n) {
        location = a;
        max_capacity = n;
        passenger = new String [max_capacity];
        passenger_count = 0;
    }

    public void showDetails() {
        System.out.println("Bus Route: "+ location);
        System.out.println("Passenger Count: "+ passenger_count+ " ( Max: "+max_capacity+" )");
        System.out.println("Passenger on Board: ");
        if(passenger_count>0){
            for(int i = 0; i<passenger.length; i++){
                System.out.print(passenger[i]+" ");
            }
            System.out.println();
        }
    }
    public void board() {
        System.out.println("No passengers");
    }
    public void board(BracuStudent st) {
        if(!st.got_pass){
             System.out.println("You don't have a bus pass!");
        }
        else if(st.address!=location){
            System.out.println("You got on the wrong bus!");
        }
        else if(passenger_count>=max_capacity){
            System.out.println("Bus if full!");
        }
        else{
            passenger[passenger_count++]=st.name;
            System.out.println(st.name+ " boarded the bus.");
        }
    }
    public void board(BracuStudent st1, BracuStudent st2) {
        board(st1);
        board(st2);
    }
}
