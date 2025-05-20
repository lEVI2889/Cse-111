import java.util.*;
public class Task1 {
    public static void main(String[] args){
        Scanner task = new Scanner (System.in);
        System.out.println("Enter 10 numbers: ");
        int[] nums = new int[10];
        for (int i = 0; i<10; i++){
            int n = task.nextInt();
            nums[i]=n;
        }
        int notfoundcount = 0;
        double found= 0;
        int sum = 0;
        //double sum2 = (double)sum;
        //double n = 10-notfoundcount;
        int max = -999999;
        int min = 999999;
        double average = sum/found;
        for(int j = 0; j<10; j++){
            if(nums[j]>0&&nums[j]%2!=0){
                sum+=nums[j];
                if(nums[j]>max){
                    max = nums[j];
                }
                else if(nums[j]<min){
                    min = nums[j];
                }
                found++;
            }
            else{
                notfoundcount++;
            }
        }
        if(notfoundcount==10){
            System.out.println("No odd positive numbers found");
        }
        else{
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + sum / found);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        }
    }
}
