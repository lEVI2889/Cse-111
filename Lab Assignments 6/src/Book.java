public class Book {
    static int total_books_sold;
    static double total_revenue;
    String book_title;
    double base_price = 150.0;
    int discount;
    double discounted_price;
    public Book (String a, int n){
        book_title = a;
        discount = n;
        total_books_sold++;
    }
    public double CalculatedDiscounted_price(){
        base_price-=base_price*discount/100;
        total_revenue+=base_price;
        return base_price;
    }
    public void bookDetails(){
        System.out.println("Title:: "+ book_title);
        System.out.println("Price after Discount: "+ CalculatedDiscounted_price());
    }
}
