public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String borrowed_books[] = new String[3];
    int book_taken_count = 0;
    String name;
    public Borrower(String a){
        name = a;
    }
    public static void bookStatus(){
        System.out.println("Available Books: ");
        for(int i = 0; i<3; i++){
            System.out.println(book_name[i]+": "+book_count[i]);
        }
    }
    public void bookcompare(int n){
        for(int i = 0; i<3; i++){
            if(borrowed_books[n].equals(book_name[i])){
                book_count[i]--;
            }
        }
    }
    public boolean availablity( String a){
        boolean available = false;
        int req_index = 0;
        for(int i = 0; i<3; i++){
            if(a.equals(book_name[i])){
                req_index=i;
            }
        }
        if(book_count[req_index]>0){
            available = true;
        }
        return available;
    }
    public void borrowBook(String a){
        if(availablity(a)){
            borrowed_books[book_taken_count] = a;
            bookcompare(book_taken_count++);
        }
        else{
            System.out.println("This book is not available.");
        }
    }
    public void borrowerDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Books Borrowed: ");
        for(int i = 0; i<3; i++){
            if(borrowed_books[i]!=null){
                System.out.println(borrowed_books[i]);
            }
        }
    }
    public static int remainingBooks(String a){
        int req = 0;
        for(int i = 0; i<3; i++){
            if(book_name[i].equals(a)){
                req = book_count[i];
            }
        }
        return req;
    }
}
