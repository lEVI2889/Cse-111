import java.util.*;
public class Task5 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Enter length: ");
        int n = task.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = task.nextInt();
        }
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}