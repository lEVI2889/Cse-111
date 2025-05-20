import java.util.*;
public class Task3 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Enter first word: ");
        String one = task.nextLine();
        System.out.println("Enter second word: ");
        String two = task.nextLine();
        String three = one+" "+two;
        int sum= 0;
        for(int i= 0; i<three.length(); i++){
            char ch = three.charAt(i);
            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                sum+=(int)ch;
            }
        }
        System.out.println(sum);
    }
}
