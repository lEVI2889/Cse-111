import java.util.*;
public class Task8 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Please enter number of row: ");
        int r = task.nextInt();
        System.out.println("Please enter number of column: ");
        int c = task.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter elements: ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = task.nextInt();
            }
        }
        System.out.println("2D Array:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[] arr1D = new int[r*c];
        int index= 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr1D[index]=arr[i][j];
                index++;
            }
        }
        System.out.println("1D Array:");
        for(int i =0; i<arr1D.length; i++){
            System.out.print(arr1D[i]+" ");
        }
    }
}
