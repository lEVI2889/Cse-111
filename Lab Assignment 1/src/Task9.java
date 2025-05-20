//import java.util.*;
public class Task9 {
    public static void main(String[] args){
        int [ ] [ ] A1 = {   {1,  0,  0,  1},
                            {0,  1,  0,  0},
                            {1,  0,  1,  0},
                            {0,  1,  0,  1}
                        };
        boolean identity1 = true;
        for(int i = 0; i<A1.length; i++){
            for(int j=0; j<A1[i].length; j++){
                if(i==j&&A1[i][j]!=1){
                    identity1 = false;
                    break;
                }
                if(i!=j&&A1[i][j]!=0){
                    identity1 = false;
                    break;
                }
            }
            if(identity1 == false){
                break;
            }
        }
        if(identity1==true){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not an Identity Matrix");
        }
        int [ ] [ ] A2 = {  {1, 0, 0},
                            {0, 1, 0},
                            {0, 0, 1}
                         };

        boolean identity2 = true;
        for(int i = 0; i<A2.length; i++){
            for(int j=0; j<A2[i].length; j++){
                if(i==j&&A2[i][j]!=1){
                    identity2 = false;
                    break;
                }
                if(i!=j&&A2[i][j]!=0){
                    identity2 = false;
                    break;
                }
            }
            if(identity2 == false){
                break;
            }
        }
        if(identity2==true){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not an Identity Matrix");
        }
    }
}
