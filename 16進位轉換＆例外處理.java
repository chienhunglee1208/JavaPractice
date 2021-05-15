/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jiang-Shiou Hwang
 */
import java.util.Scanner;
class NumberFormatException extends Exception {
    int hex2decimal(String s) {       
        int val = 0;
         s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            int d=0;
            if(c<=57&&c>=48){
                 d =c-48;
            }
            else{
                 d=c-55;
            }                   
            val = 16*val +d;
        }
        return val;
    }
     String decimal2hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d == 0) {
            return "0";
        }
        String hex = "";
        while (d > 0) {
            int digit = d % 16;                // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / 16;
        }
        return hex;
    }
}
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        String input,input1;
        int g,i,count=0,count1=0;
        while(a.hasNext()){        
            g=a.nextInt();
            NumberFormatException a1=new NumberFormatException();
            System.out.println(a1.decimal2hex(g));
            input=a.next();   
            input=input.toUpperCase();
            try {
                for(i=0;i<input.length();i++){
                    if(input.charAt(i)<=70&&input.charAt(i)>=65||input.charAt(i)>=48&&input.charAt(i)<=57){
                        count++;   
                    }
                    else{
                        throw new NumberFormatException();                
                    }                   
                }
                if(count==input.length()){
                        System.out.println(a1.hex2decimal(input));
                    }
               }
            catch (NumberFormatException ex) {             
                System.out.println("String is no HEX");
                System.exit(1);
            } 
            input1=a.next(); 
            input1=input1.toUpperCase();
            try {
                for(i=0;i<input1.length();i++){
                    if(input1.charAt(i)<=70&&input1.charAt(i)>=65||input1.charAt(i)>=48&&input1.charAt(i)<=57){           
                       count1++;
                    }
                    else{
                         throw new NumberFormatException();                    
                    }                    
                }
                if(count1==input1.length()){
                       System.out.println(a1.hex2decimal(input1));             
                }
               }
            catch (NumberFormatException ex) {             
                System.out.println("String is no HEX");
                System.exit(1);
            }                           
        }        
    }    
}
