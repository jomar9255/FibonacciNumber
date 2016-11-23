/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccinumber;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jomar9255
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            
            int i = sc.nextInt();
            System.out.println(findTerm(i));
            
        }catch(InputMismatchException e){
                System.err.println(e.getMessage());
        }
    }
    
    /**
     * findTerm(int n) calculates the Fibonacci number of a given term. returns
     * -1 if the term given is less than 1.
     * @param n
     * @return  
     */
    private static int findTerm(int n){
        
       if(n > 0){ 
        if(n > 0 && n <=2){
            n = 1;
            return n;
        } else {
            n = findTerm(n-1) + findTerm(n-2);
            return n;
        }
        }else{
           System.err.println(n + " cannot be less than 1");
           return -1;
       }
    }
}
