//Last e remove kore deya lagbe
public class CinemexTicket extends MovieTicket{
    static int total_tickets;
    boolean night_Show = false;
    static String seat_type;
    String genre;
    String pay_status = "Not Paid.";
    boolean stat = false;
    static int req_ind;
    public CinemexTicket(String name, String time, String genre, String date){
        super(name, date, time, seatPrices[0]);
        total_tickets++;
        this.seat_type = seatTypes[0];
        this.genre = genre;
    }
    public CinemexTicket(String name, String time, String genre, String date, String seat_type){
        super(name, date, time, seatPrices[getIndex(seat_type)]);
        total_tickets++;
        this.seat_type = seat_type;
        this.genre = genre;
    }
    public void calculateTicketPrice(){
        double org_price = super.getPrice();
        super.setPrice(finalPrice(org_price));
        System.out.println("Ticket price is calculated successfully.");
    }
    public static int getTotalTickets(){
        return total_tickets;
    }
    public String confirmPayment(){
        String return_statement = "Payment Successful.";
        if(stat){
            return_statement= "Ticket price is already paid!";
        }
        else{
            stat = true;
            pay_status = "Paid";
        }
        return return_statement;
    }
    public double finalPrice(double p){
        String[] times = showtime.split(":");
        int hrs = Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);
        if(is_a_nightShow(hrs, minutes)){
            p+=p*nightShowCharge/100;
        }
        return p;
    }
    public boolean is_a_nightShow(int a, int b){
        if(a>=18&&a<23&&b>=00&&b<=59){
            night_Show = true;
        }
        return night_Show;
    }
    public String ticketIdGen(){
        char ini = seat_type.charAt(0);
        return "Ticket ID: "+ getMovie()+"-"+ini+"-"+total_tickets;
    }
    public String toString(){
        return ticketIdGen()+"\n"+super.toString()+ "\nGenre: "+ genre+
                "\nSeat Type: "+ seat_type+"\nPrice(tk): "+ getPrice()+ "\nStatus: "+ pay_status;
    }
    public static int getIndex(String a){
        for(int i = 0; i< seatTypes.length; i++){
            if(a.equals(seatTypes[i])){
                req_ind=i;
            }
        }
        return req_ind;
    }
}