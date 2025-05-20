import java.util.*;
public class Task2 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int n1 = task.nextInt();
        System.out.println("Enter second number: ");
        int n2 = task.nextInt();
        int numcount = 0;
        if(n1<n2) {
            for (int i = n1; i <= n2; i++) {
                int divcount = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divcount++;
                    }
                }
                if (divcount == 2) {
                    numcount++;
                }
            }
            System.out.println("There are " + numcount + " prime numbers between " + n1 + " and " + n2 + ".");
        }
        else{
            for (int i = n1; i >= n2; i--) {
                int divcount = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divcount++;
                    }
                }
                if (divcount == 2) {
                    numcount++;
                }
            }
            System.out.println("There are " + numcount + " prime numbers between " + n2 + " and " + n1 + ".");
        }
    }
}