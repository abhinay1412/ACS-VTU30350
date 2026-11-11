
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [][]image = new int [n][n];
        
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                image [i][j] = sc.nextInt();
                
            }
        }
        for(int i =0;i<n;i++){
           int left =0;
           int right =n-1;
           
           while(left<right){
            int temp = image[i][left];
            image[i][left] = image[i][right];
            image[i][right]=temp;
            
            left++;
            right--;
           }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j] = 1-image[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(image[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
