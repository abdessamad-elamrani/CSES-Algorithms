/*
# my java solution to https://cses.fi/problemset/task/1068/.
 */

/**
 *
 * @author aelamrani
 */

import java.util.Scanner;


public class weirdalgo {
    
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
       
        Long n = Long.valueOf(in.nextLine());
        System.out.print(n);
        
        while (n>1){
            System.out.print(" ");
            if (n%2==0){
                n=n/2;
                System.out.print(n);
            }
            else {
                n=3*n+1;
                System.out.print(n);
            }
        }
    }
    
}











