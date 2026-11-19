import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        if(h1>h2&&h1>h3){
            System.out.println(h1);
        }else if(h2>h1&&h2>h3){
            System.out.println(h2);
            
        }else if(h1==h2||h2==h3){
            System.out.println(h2);
        }else{
            System.out.println(h3);
        }
        sc.close();
            
        }
        
        
    }
