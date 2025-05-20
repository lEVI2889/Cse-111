public class Quiz {
    public static void main (String[] args){
        int[][] arr = { {2, 3, 6},
                        {1, 5, 8},
                        {1, 6, 8}};
        int row = arr.length;
        int max_row = 0;
        for(int i = 0; i<row; i++){
            int sum = 0;
            int max_sum = -99999;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]%2==0){
                    sum+=arr[i][j];
                }
            }
            if(sum>max_sum){
                max_sum = sum;
                max_row=i;
            }
            if(i==row-1){
                System.out.println("Max: "+ max_sum);
            }
        }
        for(int k = 0; k<arr[0].length; k++){
            System.out.print(arr[max_row][k]+" ");
        }
    }
}