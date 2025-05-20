import java.util.*;
public class Task6 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        int n = task.nextInt();
        int[] arr = new int[n];
        boolean[] arr2 = new boolean[n];
        for(int i = 0; i<n; i++){
            arr[i]=task.nextInt();
            arr2[i]= false;
        }
        for(int i= 0; i<arr.length; i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count++;
                    arr2[j]= true;
                }
            }
            if (arr2[i]==false){
                System.out.println(arr[i] + "-" + count + "times");
            }
        }
    }
}
