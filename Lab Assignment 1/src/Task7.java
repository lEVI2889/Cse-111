import java.util.*;
public class Task7 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Please enter number of elements of the array: ");
        int n = task.nextInt();
        double [] arr = new double[n];
        System.out.println("Please enter the elements of the array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i]= task.nextDouble();
        }
        int newarraylength = 1;
        int removed = 0;
        for(int j = 0; j<arr.length; j++){
            int k = 1;
            int l = j+k;
            if(l<arr.length&&arr[j]!=arr[l]){
                newarraylength++;
            }
            else if(l!=arr.length){
                removed++;
            }
        }
        double[] newarray = new double[newarraylength];
        int index = 0;
        newarray[newarraylength-1]= arr[arr.length-1];
        for(int i = 0; i<arr.length; i++){
            int k = 1;
            int l = i+k;
            if(l<arr.length&&arr[i]!=arr[l]){
                newarray[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newarray));
        System.out.println("Removed Elements: "+ removed);
    }
}
