import java.util.*;
public class Task4 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Enter string in small letters: ");
        String a = task.nextLine();
        String newString="";
        for(int i =0; i<a.length();i++){
            char ch = a.charAt(i);
            newString += (char)((int)ch-1);
        }
        System.out.println(newString);
    }
}