public class CheckingAccount extends Account{
    static int count;
    public CheckingAccount(double n){
        super(n);
        count++;
    }
    public CheckingAccount(){
        super(0.0);
        count++;
    }
}
